package Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDownKeyUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Edge.Driver","C:\\Users\\dipti\\eclipse-workspace\\SeleniumWebDriver\\drivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		
		WebElement compendiumdevlink = driver.findElement(By.linkText("compendiumdev"));
		
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		
		a.keyDown(Keys.CONTROL).click(compendiumdevlink).keyUp(Keys.CONTROL).build().perform();

	}

}
