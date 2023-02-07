package selenium.java.script;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;

public class DropDownCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		
		driver.findElement(By.xpath("//img[@alt=\"ListBox\"]")).click();
		WebElement findElement = driver.findElement(By.xpath("//select[@id=\"dropdown1\"]"));
		
		Select select=new Select(findElement);
		select.selectByIndex(2);
		
			WebElement findElement2 = driver.findElement(By.xpath("//select[@name=\"dropdown2\"]"));
			
			Select select1=new Select(findElement2);
			select1.selectByVisibleText("Appium");
			
			WebElement findElement3 = driver.findElement(By.id("dropdown3"));
			Select select2=new Select(findElement3);
			select2.selectByValue("3");
			
		 List<WebElement> findElements = driver.findElements(By.xpath("//select[@class=\"dropdown\"]//option"));
			
		 
		 System.out.println(findElements.size());
		 
		 driver.findElement(By.xpath("//option[contains(text(),'You')]//parent::select")).sendKeys("Appium");
         WebElement findElement4 = driver.findElement(By.xpath("//option[text()='Select your programs']//parent::select"));
	     
	       Select select3=new Select(findElement4);
	       select3.selectByIndex(0);
	       select3.selectByIndex(1);
	       select3.selectByIndex(2);
	       select3.selectByIndex(3);
	       
	       
	}

}
