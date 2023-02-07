package selenium.java.script;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileDownCls {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		
			driver.findElement(By.xpath("//img[@alt=\"Download\"]")).click();
			
			driver.findElement(By.xpath("//a[text()='Download Excel']")).click();
			
			
			File file=new File("C:\\Users\\santh\\Downloads\\vairamani");
			
			
			
			File[] listFiles = file.listFiles();
			
			for (File file2 : listFiles) {
				System.out.println(file2.getName());
				
			}
			
			driver.navigate().back();
			
			driver.findElement(By.xpath("//img[@alt=\"contextClick\"]")).click();
			
			WebElement element = driver.findElement(By.xpath("//div[@id=\"mydiv\"]/input"));
			
			Thread.sleep(3000);
			
			Actions act=new Actions(driver);
			act.click(element).perform();
			
			String s="C:\\Users\\santh\\Downloads\\vairamani\\Vairamani Details.docx";
			
			StringSelection se=new StringSelection(s);
			
			
			
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(se, null); 
			
			Robot ro=new Robot();
			
			ro.keyPress(KeyEvent.VK_CONTROL);
			ro.keyPress(KeyEvent.VK_V);
			ro.keyRelease(KeyEvent.VK_V);
			ro.keyRelease(KeyEvent.VK_CONTROL);
			
			ro.keyPress(KeyEvent.VK_ENTER);
			ro.keyRelease(KeyEvent.VK_ENTER);
			
			
			
			
		
	}

}
