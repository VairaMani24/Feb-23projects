package selenium.java.script;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHansCls {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		
		driver.findElement(By.xpath("//img[@alt=\"Windows\"]")).click();
		
		String defaulWindow = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//button[@id=\"home\"]")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		for (String s : windowHandles) {
			
			driver.switchTo().window(s);
			}
		
		driver.close();
		driver.switchTo().window(defaulWindow);
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@onclick=\"openWindows()\"]")).click();
		
		
		
		
				
			
		
		driver.findElement(By.xpath("//button[@id=\"color\" and @onclick=\"openWindows();\"]")).click();
		
Set<String> windowHandles2 = driver.getWindowHandles();
		
		System.out.println(windowHandles2.size());
		
		for (String string : windowHandles2) {
			 
			driver.switchTo().window(string);
			if(!driver.getWindowHandle().equals(defaulWindow)) {
				driver.close();}
			
		}
		

	}

}
