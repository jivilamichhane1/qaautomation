package com.automation.GoogleDemo;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameters {
	WebDriver driver;
	@Parameters({"browser"})
	@Test
	public void lunchURLTest(String browser) {
		System.out.println("Running browser is :"+ browser);
	if (browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.drive", "resources/chromedrover.exe");
	 driver = new ChromeDriver();
				}
	else if (browser.equals("firefox")) {
	 driver = new FirefoxDriver()	;
	}
	else if (browser.equals("ie")) {
	 driver = new InternetExplorerDriver()	;
	}
	else if (browser.equals("safari")) {
	 driver = new SafariDriver();
	}
	driver.get("http:/www.freecrm.com");
	}
	@Parameters({"username", "password"})
	@Test
	public void loginTest(String username, String password) {
	
	}

}
