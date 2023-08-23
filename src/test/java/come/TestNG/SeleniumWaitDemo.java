package come.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWaitDemo {

	
	public void seleniumWaits() {
		System.setProperty("webdriver.chrome.drive", "resources/chromedrover.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(null);
	}
}
