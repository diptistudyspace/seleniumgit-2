import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class edgedriver {

	public static void main(String[] args) {

		class EdgeDriverSample {
			public static void main(String[] args) throws Exception {
				EdgeDriver driver = new EdgeDriver();
				try {
					driver.navigate().to("https://github.com/diptistudyspace/seleniumgit-2");

					WebElement element = driver.findElement(By.id("sb_form_q"));
					element.sendKeys("WebDriver");
					element.submit();

					Thread.sleep(5000);
				} finally {
					driver.quit();
				}
			}
		}

	}

}
