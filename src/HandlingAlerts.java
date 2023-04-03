import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Edge.Driver","C:\\Users\\dipti\\eclipse-workspace\\SeleniumWebDriver\\drivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver(); //create a object(driver) for WebDriver(Parent class) with the reference of child class(EdgeBrowser)
		
		driver.get("http://omayo.blogspot.com/"); //To open a particular URL in browser(Main window will open)
		driver.manage().window().maximize(); //for maximize the window
		
		//implicitlyWait
		
		//Instead of halting the program till the specified time is reached, 
		//Implicit wait will wait for all the web elements dynamically (i.e. Global wait)
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		//CliclToGetAlert button on wabepage
		driver.findElement(By.id("alert1")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String textDisplayOnAlert = alert.getText();
		System.out.println(textDisplayOnAlert);
		
		alert.accept();
		Thread.sleep(2000);
		
		
		
		
		driver.quit();

	}

}
