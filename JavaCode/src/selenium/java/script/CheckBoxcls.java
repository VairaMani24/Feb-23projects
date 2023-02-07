package selenium.java.script;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxcls {

	public static void main(String[] args) {
		
		
		String s="//img[@class=\"wp-categories-icon svg-image\" and @alt=\"Checkbox\"]";
System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath(s)).click();

		
		String s2="//*[@id=\"contentblock\"]/section/div[1]/input[1]";
		driver.findElement(By.xpath("//label[contains(text(),'languages')]//following::*[3]")).click();
	
	////*[@id="contentblock"]/section/div[1]/input[1]
		boolean selected = driver.findElement(By.xpath("//div[@id=\"contentblock\"]//div[2]//input")).isSelected();
		System.out.println(selected);
		WebElement element = driver.findElement(By.xpath("//label[text()='DeSelect only checked']//parent::div//following-sibling::input[@checked]"));
		
		boolean selected2 = element.isSelected();
	if(selected2==true) {
		element.click();
		
	}
		
	List<WebElement> findElements = driver.findElements(By.xpath("//label[text()='Select all below checkboxes ']//following::input"));
		for(WebElement we : findElements) {
			we.click();
		}
	}
	

}
