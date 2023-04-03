import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class ExplicitFluentWait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("WebDriver.Edge.Driver","C:\\Users\\dipti\\eclipse-workspace\\SeleniumWebDriver\\drivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver(); //create a object(driver) for WebDriver(Parent class) with the reference of child class(EdgeBrowser)
		
		driver.get("http://omayo.blogspot.com/"); //To open a particular URL in browser(Main window will open)
		driver.manage().window().maximize(); //for maximize the window
		
		//implicitlyWait
		
		//Instead of halting the program till the specified time is reached, 
		//Implicit wait will wait for all the web elements dynamically (i.e. Global wait)
		//You can customize the pulling time
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//wait 0 seconds - immediately click(If button will appear immediately then click immediately before waiting time)
		driver.findElement(By.className("dropbtn")).click();

		 // Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(Duration.ofSeconds(30L))
		       .pollingEvery(Duration.ofSeconds(5L)) //pulling time in every 5l second it check whether the option is available or not
		       .ignoring(NoSuchElementException.class);

		   @SuppressWarnings("unused")
		WebElement facebookElement = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.linkText("Facebook"));
		     }
		   });
		
		
		
		driver.quit();
		
	}

}
