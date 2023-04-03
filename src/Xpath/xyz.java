package Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class xyz {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Edge.Driver","C:\\Users\\dipti\\eclipse-workspace\\SeleniumWebDriver\\drivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		//driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		

		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']")).click(); //To close the light box
		
		
		
		
	}

}
