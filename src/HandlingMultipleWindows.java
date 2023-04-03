import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingMultipleWindows {

	public static void main(String[] args) {
		System.setProperty("WebDriver.Edge.Driver","C:\\Users\\dipti\\eclipse-workspace\\SeleniumWebDriver\\drivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver(); //create a object(driver) for WebDriver(Parent class) with the reference of child class(EdgeBrowser)
		
		driver.get("http://omayo.blogspot.com/"); //To open a particular URL in browser(Main window will open)
		driver.manage().window().maximize(); //for maximize the window
		
		//This will open first child window
		driver.findElement(By.linkText("Open a popup window")).click(); //To open a Particular pupup link in website use(.linkText()) 
																		//then use(.click) for click that link
		
		//This will open third child window
		driver.findElement(By.linkText("Blogger")).click();
		
		//At this point two window will open one is main window and another is popup window
		
		//Every window will capture by an unique ID
		//We have to capture all the three window. All window captured by (.getWindowHandles)
		//Window ID will be form of local variable String(return type is Set of String)
		Set<String> windows = driver.getWindowHandles();//This will return all window handle(Three window ID in random order)
		
		
		//While you are Iterate to this window IDs selenium don't know which one is Main window and which one is child window
		Iterator<String> itr = windows.iterator(); //Iterating through all the window ids
		
		String paraTextOnPopupWindow=null; //variable is create and assign to null(variable create out side 
										   //bcz print will be out side while loop)Instance variable
		
		//Refering to Set proper window(i.e which one is Main,child-1,child-2)
		while(itr.hasNext()) {  //hasNext will check any window id is there or not(here .hasNext means true)
			String windowid = itr.next(); //(itr.next) with this we don't know which windowid will come here with reference (windowid)
			
			//Switching to the window, No matter what whether we get main window or child window
			driver.switchTo().window(windowid);
			
			//(.getTitle) will return the title of the current window
			if(driver.getTitle().equals("Basic Web Page Title")) {	//we are assigning perticular title of the page
				paraTextOnPopupWindow=driver.findElement(By.id("para1")).getText(); //assign the variable (paraTextOnPopupWindow)
																					//which is create outside the while loop
			}
			
		}
			
		System.out.println(paraTextOnPopupWindow); //print the Instance variable value

		
		
		
		driver.quit();
	}

}
