package Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class KeysClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.Edge.driver","C:\\Users\\dipti\\eclipse-workspace\\SeleniumWebDriver\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");  
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.findElement(By.id("input-email")).sendKeys("arun.motoori@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("12345");
		
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).sendKeys(Keys.ENTER);

	}

}
