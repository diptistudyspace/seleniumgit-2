package Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class KeysMultiple {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.Edge.driver","C:\\Users\\dipti\\eclipse-workspace\\SeleniumWebDriver\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("http://omayo.blogspot.com/");  
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.findElement(By.id("ta1")).sendKeys("Dipti Ranjan Nayak");
		
		Thread.sleep(2000);
	
		driver.findElement(By.id("ta1")).sendKeys(Keys.chord(Keys.CONTROL,"z"));

	}

}
