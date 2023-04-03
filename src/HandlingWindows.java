import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Edge.Driver","C:\\Users\\dipti\\eclipse-workspace\\SeleniumWebDriver\\drivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver(); //create a object(driver) for WebDriver(Parent class) with the reference of child class(EdgeBrowser)
		
		driver.get("http://omayo.blogspot.com/"); //To open a particular URL in browser
		driver.manage().window().maximize(); //for maximize the window
		
		driver.findElement(By.linkText("Open a popup window")).click(); //To open a Particular pupup link in website use(.linkText()) then use(.click) for click that link
		
		//At this point two window will open one is main window and another is popup window
		
		//Every window will capture by an unique ID
		//We have to capture all the two window. All window captured by (.getWindowHandles)
		//Window ID will be form of local variable String(return type is Set of String)
		Set<String> windows = driver.getWindowHandles();//This will return handle all window
		
		Iterator<String> itr = windows.iterator(); //Iterating through all the window ids
		
/*		while(itr.hasNext()){ //hasNext will check any window id is there or not(here .hasNext means true)
		String windowid = itr.next();//.Next will return you first window.While loop first window will assign in(windowid)
		System.out.println(windowid);
		
		//Till this point we will get two window ID 
		}		*/
		
		String mainwindowid = itr.next(); //It will give main window Id
		String childwindowid = itr.next(); //It will give child window Id
		
		//selenium can only see the Main window so to see the child window we have to use (.switchTo())
		driver.switchTo().window(childwindowid); //selenium will switch from main window to child window
		
		//Now seleniun will read the text in child window(popup window)
		String FirstParaOnChildWindow = driver.findElement(By.id("para1")).getText();
		System.out.println(FirstParaOnChildWindow);
		
		driver.close(); //This will close the child window only bcz at this time selenium has focus only child window
		
		Thread.sleep(2000);
		
		//driver.quit();//This will close all the window
		
		//If we want selenium to focus back to main window have to use (.switchTo) with main window ID 
		driver.switchTo().window(mainwindowid);
		driver.close(); //This will close the main window bcz now selenium has focus back to main window ID
	}

}
