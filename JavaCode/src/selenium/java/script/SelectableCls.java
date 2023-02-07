package selenium.java.script;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableCls {

	public static void main(String[] args) {
	

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("http://www.leafground.com/");
			
			driver.findElement(By.xpath("//img[@alt=\"selectable\"]")).click();
			
			List<WebElement> findElements = driver.findElements(By.xpath("//ol[@id=\"selectable\"]/li"));
			
			System.out.println(findElements.size());
			
			
			
			for(WebElement element :findElements ) {
				System.out.println(element.getText());
				if(!(element.getText().equals("Item 6"))) {
				
					Actions act=new Actions(driver);
			
					act.keyDown(Keys.CONTROL).click(element).perform();
					
				}
			}
	}

}
