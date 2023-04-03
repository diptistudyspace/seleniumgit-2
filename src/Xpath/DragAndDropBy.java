package Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Edge.Driver","C:\\Users\\dipti\\eclipse-workspace\\SeleniumWebDriver\\drivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("http://omayo.blogspot.com/p/page3.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		WebElement minprice = driver.findElement(By.xpath("//a[@aria-labelledby='price-min-label']"));
		
		Actions a=new Actions(driver);
		
		Thread.sleep(2000);
		
		a.dragAndDropBy(minprice,100,0).perform();
		
		Thread.sleep(2000);
		
		a.dragAndDropBy(minprice,-200,0).perform();

	}

}
