package Xpath;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Edge.Driver","C:\\Users\\dipti\\eclipse-workspace\\SeleniumWebDriver\\drivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		//driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(15));
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		
		//drive focus into required frame only
		WebElement iframe2 = driver.findElement(By.id("iframe2"));
		driver.switchTo().frame(iframe2);
		
		//Text type into the text box field
		driver.findElement(By.id("q")).sendKeys("Dipti Ranjan Nayak");
		
		//now switch back the focus to defauld page from frame
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("ta1")).sendKeys("Dipti Ranjan Nayak");
		
		
	}

}
