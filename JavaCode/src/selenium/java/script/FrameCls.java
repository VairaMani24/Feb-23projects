package selenium.java.script;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameCls {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		
		driver.findElement(By.xpath("//img[@alt=\"Frame\"]")).click();
		
	driver.switchTo().frame(0);
	
	Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//button[@id=\"Click\"]")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//button[@id=\"Click1\"]")).click();
		
		driver.switchTo().defaultContent();
		
		List<WebElement> findElements = driver.findElements(By.xpath("//iframe"));
		
		System.out.println(findElements.size());
		/*for (WebElement webElement : findElements) {
			System.out.println(webElement.getText());
		}*/
		

	}

}
