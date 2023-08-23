package come.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamiterTestMethod {
//URL.USERNAME.PASSWORD..
	
	WebDriver driver;
	
	@Test
	@Parameters({"url","emailID"})
public void yahooTest(String url, String emailID) {
	System.setProperty("webdriver.chrome.drive", "resources/chromedrover.exe");
	driver = new ChromeDriver();
	driver.get(url);
	
	driver.findElement(By.xpath("//*[@id=\"login-username\"]")).clear();	
	driver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys(emailID);
	driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
	
	
	
	}
	
	
}
