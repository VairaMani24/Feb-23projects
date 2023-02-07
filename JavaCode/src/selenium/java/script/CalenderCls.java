package selenium.java.script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderCls {

	public static void main(String[] args) {
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		
		driver.findElement(By.xpath("//img[@alt=\"Calendar\"]")).click();
		
	//	driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).sendKeys("08/10/2022");
		driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).click();
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		driver.findElement(By.xpath("//a[text()='10']")).click();
		

	}

}
