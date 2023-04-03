package Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Callender {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("WebDriver.Edge.Driver","C:\\Users\\dipti\\eclipse-workspace\\SeleniumWebDriver\\drivers\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("form-field-travel_comp_date")).click();
		
		while(!driver.findElement(By.className("cur-month")).getText().contains("December")) {
			//driver.findElement(By.className("numInput cur-year")).click();
			driver.findElement(By.xpath("/html[1]/body[1]/div[10]/div[1]/span[2]/*[local-name()='svg'][1]")).click();
		}
		
		WebElement days = driver.findElement(By.className("flatpickr-day today"));
		for(int i=0;i<days.size();i++) {
			
			if(days.get(i).getText().equals("15")) {
				
				days.get(i).click();
				break;
			}}
	}

}
