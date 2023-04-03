package Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeys {

	public static void main(String[] args) {
		System.setProperty("WebDriver.Edge.Driver","C:\\Users\\dipti\\eclipse-workspace\\SeleniumWebDriver\\drivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		Actions a=new Actions(driver);
		
		WebElement usernamefield = driver.findElement(By.name("userid"));
		usernamefield.sendKeys("Dipti");

		a.sendKeys(Keys.TAB).perform();
		
		WebElement passwordfield = driver.findElement(By.name("pswrd"));
		
		passwordfield.sendKeys("12345");
		
		//a.sendKeys(Keys.TAB).perform();
		//a.sendKeys(Keys.ENTER).perform();
		
		a.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		
		
	}

}
