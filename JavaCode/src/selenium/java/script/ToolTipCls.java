package selenium.java.script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTipCls {
	
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		
		driver.findElement(By.xpath("//h5[text()='Tool Tip']")).click();
		WebElement element = driver.findElement(By.xpath("//input[@id=\"age\"]"));
		/*Actions act=new Actions(driver);
		
		act.moveToElement(element).perform();*/
		
		
		
		String attribute = element.getAttribute("title");
		
		System.out.println(attribute);
		
		//System.out.println(element.getText());
		
		
	}

}
