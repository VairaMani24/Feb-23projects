package selenium.java.script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.grid.selenium.node.ChromeMutator;

public class EditBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		
		driver.findElement(By.xpath("//img[@alt=\"Edit / Text Fields\"]")).click();
		
		driver.findElement(By.id("email")).sendKeys("vairamani24@gmail.com");
		
		driver.findElement(By.xpath("//input[@value=\"Append \"]")).sendKeys("java");
		
		String attribute = driver.findElement(By.xpath("//input[@value=\"TestLeaf\"]")).getAttribute("value");
		System.out.println(attribute);
		
		driver.findElement(By.xpath("//input[@value=\"Clear me!!\"]")).clear();
		
		boolean enabled = driver.findElement(By.xpath("//input[@disabled=\"true\"]")).isEnabled();
		
		System.out.println(enabled);
		
		
		
		

	}

}
