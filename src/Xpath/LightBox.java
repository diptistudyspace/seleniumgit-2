package Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LightBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Edge.Driver","C:\\Users\\dipti\\eclipse-workspace\\SeleniumWebDriver\\drivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("http://omayo.blogspot.com/p/lightbox.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		
		//click the light box
		driver.findElement(By.id("lightbox1")).click();
		
		//close the light box
		//driver.findElement(By.className("close cursor")).click(); //here id is not work by class name bcz there is a space btwn class name
		
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@class='close cursor']")).click(); //close light box by xpath 
		//driver.findElement(By.cssSelector("[class='close cursor']")).click(); //close light box by css selector
		driver.findElement(By.cssSelector(".close.cursor")).click(); //In css selector class=. and every space we can replace with .
	}

}
