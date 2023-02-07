package selenium.java.script;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortableCls {

	public static void main(String[] args) throws AWTException, InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		
		driver.findElement(By.xpath("//img[@alt=\"sortable\"]")).click();
		
		List<WebElement> findElements = driver.findElements(By.xpath("//ul[@id=\"sortable\"]/li"));
		
		System.out.println(findElements.size());
		
		
		
		Actions act=new Actions(driver);
		
		act.clickAndHold(findElements.get(1));
		Thread.sleep(2000);
		act.moveToElement(findElements.get(6));
		
		act.release(findElements.get(6));
		act.build().perform();
		
	//act.dragAndDrop(findElements.get(1), findElements.get(6)).build().perform();
		
		
		
		
		
		
		
		
	}

}
