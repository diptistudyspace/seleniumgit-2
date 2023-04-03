package Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FindFramesOnWebPage {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("WebDriver.Edge.Driver","C:\\Users\\dipti\\eclipse-workspace\\SeleniumWebDriver\\drivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		//find out how many iframes are on the web page
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		//driver.quit();

	}

}
