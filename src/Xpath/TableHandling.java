package Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TableHandling {

	public static void main(String[] args) {
		System.setProperty("WebDriver.Edge.Driver","C:\\Users\\dipti\\eclipse-workspace\\SeleniumWebDriver\\drivers\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement headings = driver.findElement(By.xpath("//table[@id='table1']//th"));
		
		for(int i=0;i<headings.Size();i++) {
			
		}

	}

}
