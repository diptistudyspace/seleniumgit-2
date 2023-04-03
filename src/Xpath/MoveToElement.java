package Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Edge.Driver","C:\\Users\\dipti\\eclipse-workspace\\SeleniumWebDriver\\drivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		//To move element first find the menu by inspect.Then create object for this element
		WebElement blogsmenu = driver.findElement(By.id("blogsmenu"));
		
		//To move the cursor to selenium143 we have to create object and find the path by inspect it
		WebElement selenium143option = driver.findElement(By.xpath("//a/span[text()='Selenium143']"));
		
		//create object to move mouse on blogs menu
		Actions a=new Actions(driver); //constructor should not be empty so enter the object = driver
		
		//move mouse on blogs menu using object
		a.moveToElement(blogsmenu).perform(); //add .perform to perform the action
		
		Thread.sleep(2000);
		
		//a.moveToElement(selenium143option).perform(); //move the cursor to selenium143
		//a.click(selenium143option).perform(); //click the option selenium143
																					
		//a.moveToElement(selenium143option).click(selenium143option).perform(); //Above two line is merge here
																				//multiple operation in one line(without build() it also work)
			
		a.moveToElement(selenium143option).click(selenium143option).build().perform(); //for multiple operation we have to add build()
		

	}

}
