import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownMultiSelection {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Edge.Driver","C:\\Users\\dipti\\eclipse-workspace\\SeleniumWebDriver\\drivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver(); //create a object(driver) for WebDriver(Parent class) with the reference of child class(EdgeBrowser)
		
		driver.get("http://omayo.blogspot.com/"); //To open a particular URL in browser(Main window will open)
		driver.manage().window().maximize(); //for maximize the window
		
		//implicitlyWait
		
		//Instead of halting the program till the specified time is reached, 
		//Implicit wait will wait for all the web elements dynamically (i.e. Global wait)
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		
		//driver.findElement(By.id("drop1")).sendKeys("doc 3");//This can be used but this is not the exact way to selecting
		
		
		WebElement dropDownField = driver.findElement(By.id("drop1"));
		
		WebElement multiSelectionBoxField = driver.findElement(By.id("multiselect1"));
		
		Select select=new Select(multiSelectionBoxField);
		//select.deselectByVisibleText("doc 3");
		
		//select.selectByIndex(3);
		
		select.selectByVisibleText("Volvo");
		select.selectByVisibleText("Audi");
		select.selectByVisibleText("Hyundai");
		
		Thread.sleep(3000);
		
		select.deselectByVisibleText("Hyundai");
		
		
		
		driver.quit();
		
		
		
		

	}

}
