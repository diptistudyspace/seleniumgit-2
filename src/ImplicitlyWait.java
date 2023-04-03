import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitlyWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Edge.Driver","C:\\Users\\dipti\\eclipse-workspace\\SeleniumWebDriver\\drivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver(); //create a object(driver) for WebDriver(Parent class) with the reference of child class(EdgeBrowser)
		
		driver.get("http://omayo.blogspot.com/"); //To open a particular URL in browser(Main window will open)
		driver.manage().window().maximize(); //for maximize the window
		
		//implicitlyWait
		
		//Instead of halting the program till the specified time is reached, 
		//Implicit wait will wait for all the web elements dynamically (i.e. Global wait)
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//wait 0 seconds - immediately click(If button will appear immediately then click immediately before waiting time)
		driver.findElement(By.className("dropbtn")).click();
		
		//Thread.sleep(10000); //Thread option will wait 10 seconds to perform operation whether the button appear before time
		
		//Facebook option is appear after 3 second
		//wait 3 seconds -Not waist 7 more seconds to click(ImplicitlyWait is 10 seconds maximum wait time as we assign) 
		driver.findElement(By.linkText("Facebook")).click();			
		
		
		
		driver.quit();
	}

}
