package selenium.java.script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtoncls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		
		driver.findElement(By.xpath("//img[@alt=\"Radio Button\"]")).click();
		driver.findElement(By.id("yes")).click();
		
		boolean selected = driver.findElement(By.xpath("//input[@type=\"radio\" and @name=\"news\" and @checked]")).isSelected();
             System.out.println(selected);
             driver.findElement(By.xpath("//input[@class=\"myradio\" and @value=\"2\"]")).click();
	}

}
