package selenium.java.script;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkSpecific {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("http://www.leafground.com/");
			
			driver.findElement(By.xpath("//img[@alt=\"Link\"]")).click();
			
			driver.findElement(By.xpath("//section[@class=\"innerblock\"]//child::div[1]//div[1]//div//a")).click();
			
			driver.navigate().back();
			
			String attribute = driver.findElement(By.xpath("//a[contains(text(),'Find')]")).getAttribute("href");
			
			System.out.println(attribute);
			
			driver.findElement(By.xpath("//div[@id=\"wrapper\"]//descendant::label//preceding-sibling::a")).click();
			
			driver.navigate().back();
			
			  List<WebElement> findElements = driver.findElements(By.tagName("a"));
             System.out.println(findElements.size());
             
              driver.findElement(By.xpath("//a[starts-with(text(),'Verify')]")).click();
              
              String title = driver.getTitle();
             
             if(title.contains("404")){
            	System.out.println("this link is broken"); 
             }
             
	}

}
