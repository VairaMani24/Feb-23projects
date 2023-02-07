package selenium.java.script;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDynamic {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\Downloads\\chromedriver_win32\\chromedriver.exe");
        
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		
		driver.findElement(By.xpath("//img[@alt=\"Table\"]")).click();
		
		List<WebElement> findElements = driver.findElements(By.tagName("th"));
		System.out.println(findElements.size());
		
		List<WebElement> findElements2 = driver.findElements(By.tagName("tr"));
        System.out.println(findElements2.size());
        
        List<WebElement> findElements3 = driver.findElements(By.xpath("//font[contains(text(),'Learn to interact with')]//following::td[1]"));
	     for(WebElement we  : findElements3) {
	    	 String text = we.getText();
	    	 System.out.println(text);
	     }
	     
	     List<WebElement> findElements4 = driver.findElements(By.xpath("//td[2]"));
	     
	    TreeSet<Integer> ts= new TreeSet<>();
	     for(WebElement dt : findElements4) {
	    	 String replace = dt.getText().replace("%","");
	    	 int i = Integer.parseInt(replace);
	    	 
	    	ts.add(i); 
	     }
	     
	     System.out.println(ts);
	     Integer min = Collections.min(ts);
	     System.out.println(min);
	     String string = min.toString();
	     string=string+"%";
	     System.out.println(string);
	     
	  String xpath="//td[2]//font[text()="+"\""+string+"\""+"]//following::td[1]";
	  driver.findElement(By.xpath("//td[2]//font[text()="+"'"+string+"'"+"]//following::td[1]")).click();
	     
	}
          	
                   String l="vair\"value\"amani";
}
