import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWebDriverWait {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		
		//WebDriverWait wait = new WebDriverWait(driver,30); 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 
		 driver.get("http://www.omayo.blogspot.com");
		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.className("dropbtn")).click();
		 
		 
/*		 //Old code
		 Object facebookElement = wait.until(ExpectedCondition.visibilityOfElementLocated(By.linkText("Facebook")));
		((WebElement) facebookElement).click();		*/
		 
		
		//New code
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Facebook")));
		 element.click();	
		 
		 driver.quit();

	}

}
