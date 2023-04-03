package Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Edge.Driver","C:\\Users\\dipti\\eclipse-workspace\\SeleniumWebDriver\\drivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		WebElement oslo = driver.findElement(By.id("box1"));
		WebElement norway = driver.findElement(By.id("box101"));
		
		
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		
		a.dragAndDrop(oslo,norway).perform(); //Drag and drop

	}

}
