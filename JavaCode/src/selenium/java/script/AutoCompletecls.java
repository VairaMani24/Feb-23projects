package selenium.java.script;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoCompletecls {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		
		driver.findElement(By.xpath("//img[@alt=\"Auto Complete\"]")).click();
		
		driver.findElement(By.xpath("//input[@id=\"tags\"]")).sendKeys("w");
		
		Thread.sleep(4000);
		//WebDriverWait wait = new WebDriverWait(driver,60);
		
		//List<WebElement> until = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@id=\"ui-id-1\"]/li")));
		
		List<WebElement> until = driver.findElements(By.xpath("//ul[@id=\"ui-id-1\"]/li"));
		System.out.println(until.size());
		
		for (WebElement webElement : until) {
			System.out.println(webElement.getText()+" bbbbb ");
			if(webElement.getText().equals("Web Services")) {
				webElement.click();	
			}
			
		}

	}

}
