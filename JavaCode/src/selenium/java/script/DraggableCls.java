package selenium.java.script;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DraggableCls {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		/*driver.get("https://letcode.in/table");
		
		WebElement element = driver.findElement(By.xpath("//table[@id=\"simpletable\"]//td[text()='Raj']//following::td//input"));
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		WebElement until = wait.until(ExpectedConditions.elementToBeClickable(element));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", until);*/
		
		driver.get("http://www.leafground.com/");
		
		driver.findElement(By.xpath("//img[@alt=\"Draggable\"]")).click();
		
		WebElement findElement = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		
		WebElement element = driver.findElement(By.xpath("//div[@id=\"wrapper\"]"));
		
		Actions act =new Actions(driver);
		act.dragAndDropBy(findElement, 98, 346).build().perform();
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//h5[text()='Droppable']")).click();
		
		WebElement source = driver.findElement(By.xpath("//p[contains(text(),'Drag me')]"));
		WebElement destination = driver.findElement(By.id("droppable"));
		
		Actions act1 =new Actions(driver);
	//	act1.dragAndDrop(source, destination).build().perform();
		
		act1.clickAndHold(source).moveToElement(destination).release(destination).build().perform();
		
		
		
		
		
		

	}

}