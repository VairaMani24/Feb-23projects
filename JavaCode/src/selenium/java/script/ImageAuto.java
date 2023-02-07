package selenium.java.script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		
		String s="//h5[text()='Image']";
		driver.findElement(By.xpath(s)).click();
		
		String attribute = driver.findElement(By.xpath("//img[@src=\"../images/abcd.jpg\"]")).getAttribute("naturalWidth");
		if(attribute.equals("0")) {
			System.out.println("this image is broken");
		}
		
		else{
			System.out.println("this image is not broken");
		}

	}

}
