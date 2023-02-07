package selenium.java.script;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonOriented {

	public static void main(String[] args) {
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
        driver.findElement(By.xpath("//img[@alt=\"Buttons\"]")).click();
        
        driver.findElement(By.id("home")).click();
        
        driver.navigate().back();
        
        Point location = driver.findElement(By.xpath("//button[text()='Get Position']")).getLocation();
        
        int x = location.getX();
        int y = location.getY();
        
        System.out.println(x+"   "+y);
        
        String cssValue = driver.findElement(By.xpath("//button[text()='What color am I?']")).getCssValue("background-color");
        
        System.out.println(cssValue);
        
        Dimension size = driver.findElement(By.xpath("//button[text()='What is my size?']")).getSize();
        
        int height = size.getHeight();
        int width = size.getWidth();
        
        System.out.println(height+"   "+width);
        
        
	}
	
}
