import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebEdge {

	public static void main(String[] args) throws InterruptedException {
		
		
			//Execute the sample Selenium script on the specified browser
		String browser="Firefox";
			//we are assigning the objects of different Classes to the variable of a Parent Interface
		WebDriver driver=null;
		
		if(browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver","C:\\Users\\dipti\\eclipse-workspace\\SeleniumWebDriver\\drivers\\msedgedriver.exe");
			driver=new EdgeDriver();
		}else if(browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("WebDriver.gecko.driver","C:\\Users\\dipti\\eclipse-workspace\\SeleniumWebDriver\\drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("WebDriver.chrome.driver","C:\\Users\\dipti\\eclipse-workspace\\SeleniumWebDriver\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
/*				//ChromeDriver,EdgeDriver,FirefoxDriver are a predefined class of Selenium WebDriver library. 
				//WebDriver - is an Interface in selenium.  
				//EdgeDriver- Edge browser. 
						
		System.setProperty("webdriver.edge.driver","C:\\Users\\dipti\\eclipse-workspace\\SeleniumWebDriver\\drivers\\msedgedriver.exe");
		
			//EdgeDriver is the child class of WebDriver interface. 
			//Created an object for EdgeDriver class.
			//A blank Edge Driver will be launched
			//EdgeDriver()constructor - launch Edge browser
		WebDriver driver=new EdgeDriver();				*/
		
		
			//get() - Used to open the specified URL's web page
		driver.get("http://omayo.blogspot.com/");
		
			//manage().window().maximize() - Used to maximize the current web page 
		driver.manage().window().maximize();
		
/*			//findElement() is a predefined method of WebDriver and it needs to be used with By Class 
  			//and its   predefined methods for locating and performing the operations on UI   elements
		WebElement element=driver.findElement(By.id("confirm"));
			// Used to perform click operation on different UI elements like Button, link, checkbox option 
			//and radio option etc
		element.click();	*/
		
/*			//finding the UI element =name
		WebElement element=driver.findElement(By.name("q"));
			//sendKeys() - Used to enter text into the text fields like text box, text area, password fields etc
		element.sendKeys("Dipti Ranjan Nayak");		*/
		
			//finding the UI element By.id("confirm") 
/*		WebElement element=driver.findElement(By.id("textbox1"));
			//Hold the program for 5 Seconds
		Thread.sleep(5000);
			//clear() - Used to clear the text available in the text box or text area fields
		element.clear();		*/
		
/*			//finding the UI element  By.className("classone")
		WebElement element=driver.findElement(By.className("classone"));
			//Hold the program for 5 Seconds
		Thread.sleep(5000);
			//sendKeys() - Used to enter text into the text fields like text box, text area, password fields etc.
		element.sendKeys("Dipti Ranjan Nayak");		*/
		
/*			//finding the UI element  By.linkText("compendiumdev")
		WebElement element=driver.findElement(By.linkText("compendiumdev"));
			//Hold the program for 5 Seconds
		Thread.sleep(5000);
			//click() - Used to perform click operation on different UI elements like Button, link, checkbox option and radio option etc 
		element.click();	*/
		
/*			//finding the UI element By.partialLinkText("compendium"),(using partial name compen instead of compendiumdev)
		WebElement element=driver.findElement(By.partialLinkText("compen"));
			//Hold the program for 5 Seconds
		Thread.sleep(5000);
			//click the hyperlink
		element.click();	*/
		
/*			//Finding the UI element cssSelector
		WebElement element=driver.findElement(By.cssSelector("#confirm"));
			//Hold the program for 5 Seconds
		Thread.sleep(5000);
		element.click();	*/
		
/*			//Finding the UI element xpath
		WebElement element=driver.findElement(By.xpath("//input[@id='confirm']"));
			//Hold the program for 5 second
		Thread.sleep(5000);
		element.click();	*/
		
/*			//Finding the UI element this is the shortcut method of previous method
		String text=driver.findElement(By.id("pah")).getText();
		System.out.println(text);	*/
		
/*			//finding the UI element searchBox 
		String text=driver.findElement(By.className("gsc-search-button")).getText();
		System.out.println(text);	*/
		
/*			//getTitle() - Used to retrieve the title of the current web page 
		String title=driver.getTitle();
		System.out.println("Title of the page:"+title);		*/
		
/*			//getCurrentUrl() - Used to retrieve the URL of the current web page
		String url1 = driver.getCurrentUrl();
		System.out.println("URL of the page:"+url1);
		WebElement element = driver.findElement(By.linkText("compendiumdev")); //long code
		element.click();
	  //driver.findElement(By.linkText("compendiumdev")).click(); //short code
		String url2 = driver.getCurrentUrl();
		System.out.println("Current URL of the page:"+url2);
		
			//close the browser windows
		driver.close(); //Only close main window	*/
		
/*		driver.findElement(By.linkText("Open a popup window")).click(); //Open a PopUP window
		driver.findElement(By.linkText("Blogger")).click(); //Open a new Tab
		Thread.sleep(5000);
		driver.quit(); //It closes all the windows		*/
		
/*			//getAttribute() - Used to retrieve the value stored in the specified attribute value of the html element 
		String text = driver.findElement(By.id("textbox1")).getAttribute("value");
		System.out.println(text);
		driver.quit();		*/
		
/*			//isDisplayed() - Used to find out whether the element is displayed on the page 
		boolean displayed = driver.findElement(By.id("but2")).isDisplayed();
		System.out.println("Button is displayed on the page:"+displayed);
		driver.quit();		*/
		
/*			//find the hidden button is displayed on the screen or not
		boolean displayed = driver.findElement(By.id("hbutton")).isDisplayed();
		System.out.println("Button is displayed on the screen:"+displayed);
		driver.quit();		*/
		
/*			//isEnabled() - Used to find out whether the element is enabled or disabled before performing operation on it
		boolean display = driver.findElement(By.id("but2")).isEnabled();
		System.out.println("Button is enabled on the screen:"+display);
		driver.quit();		*/
		
/*			//isEnabled() - Used to find out whether the element is enabled or disabled before performing operation on it
		boolean display =  driver.findElement(By.id("but1")).isEnabled();
		System.out.println("Button is enable on the screen:"+display);
		driver.quit();		*/
		
/*			//isSelected() - Used to find out whether the radio options and checkbox options are selected or not. 
		boolean selected = driver.findElement(By.id("checkbox2")).isSelected();
		System.out.println("Check Box is selected on the screen:"+selected);
		driver.quit();		*/
		
/*			//perform operations like navigate back to previous page, navigate forward again or refreshing the current page
		driver.navigate().to("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.8.1");
		Thread.sleep(2000);
		driver.navigate().back();//Browser back option
		Thread.sleep(2000);
		driver.navigate().forward();//Browser forward option
		Thread.sleep(2000);
		driver.navigate().refresh();//Refresh the browser
		driver.quit();  	*/
		
/*			//getPageSource() - Used to retrieve all the source code of the current page and return in the form of String 
		String sourcecode = driver.getPageSource();
		System.out.println(sourcecode);		*/
		
/*			//submit() - Used to submit a form - Example: enter email and password in tutorialninja.com
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		Thread.sleep(2000);
		driver.findElement(By.id("input-email")).sendKeys("diptistudyspace@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("input-password")).sendKeys("123456789");
		Thread.sleep(2000);
			//driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//input[@value='Login")).submit();		*/
		
/*			//getTagName() - Used to get the html tag of the provided element - Example: find tag name of Search text field
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		String tagname = driver.findElement(By.id("input-email")).getTagName();
		System.out.println(tagname);		*/
		
/*			//getCSSValue() - driver.findElement(By.id("home")).getCssValue("line-height");
		String value = driver.findElement(By.id("home")).getCssValue("text-align");
		System.out.println(value);		*/
		
/*			//getSize() - Used to get the height and width of the given element - Dimension d = driver.findElement(By.id("but2")).getSize(); - d.height and d.width
		Dimension d = driver.findElement(By.id("but2")).getSize();
		System.out.println("Height of the button is:"+d.height);
		System.out.println("Width of the button is:"+d.width);		*/
		
/*			//getLocation() - Used to get the x and y coordinate position of the given element - Point p = 
		Point p = driver.findElement(By.id("but2")).getLocation();
		System.out.println("x coordinate of the button is:"+p.x);
		System.out.println("y coordinate of the button is:"+p.y);		*/
		
/*			//fullScreen() - Used to display the web page in full screen mode - driver.manage().window().fullscreen();
		driver.manage().window().fullscreen();
		Thread.sleep(3000);		*/
		
			//findElements() - Used to find and return more than one Web Element
			//By.tagName() - Print all the hyperlink texts on the web page
		List<WebElement> elements = driver.findElements(By.tagName("a"));
			//using for each loop
		for(WebElement j : elements) {
			if(j.getText().length()>0) {
				System.out.println(j.getText());
			}
		}
		
/*			//using for loop
		for(int i=0;i<elements.size();i++) { 
			if(elements.get(i).getText().length()>0) {//this code will  the blank lines
				
				System.out.println(elements.get(i).getText());
			}
		}		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.quit();
		
	}

}
