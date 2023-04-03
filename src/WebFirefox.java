import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebFirefox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.gecko.driver", "C:\\Users\\dipti\\eclipse-workspace\\SeleniumWebDriver\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.quit();

	}

}
