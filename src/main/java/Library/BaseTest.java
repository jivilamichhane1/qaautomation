package Library;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	public static WebDriver driver;
	
	@BeforeMethod
	public void before_each_test() {
		System.setProperty("webdriver.gecko.drive", "resources/geckodriver.exe");
	driver =new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.ebay.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	}
	@AfterMethod
	public void after_each_test() {
		if (driver != null) {
			driver.quit();
		}
	}
}
