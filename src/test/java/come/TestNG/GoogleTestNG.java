package come.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction;

public class GoogleTestNG {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.drive", "resources/chromedrover.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");

	}

	@Test(priority = 1)
	public void gogleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	@Test(priority = 2)
	public void googleTest() {
		boolean b = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")).isDisplayed();
	}

	@Test(priority = 3)
	public void mailLinkTest() {
		boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
