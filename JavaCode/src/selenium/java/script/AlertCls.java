package selenium.java.script;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertCls {

	public static void main(String[] args) {
		
		String xpath="//img[@alt=\"Alert\"]";
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		
		driver.findElement(By.xpath(xpath)).click();
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
		
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("vairamani");
		alert3.accept();
		
		driver.findElement(By.xpath("//button[text()='Line Breaks?']")).click();
		Alert alert4 = driver.switchTo().alert();
		alert4.accept();
		
		

	}

}
