package com.automation.GoogleDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNGVerifyTitleTest {
	
public void titleTest() {
	
	//System.setProperty("webdriver.chrome.drive", "resources/chromedrover.exe");
	String expectedttle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.ebay.com/");
	String actualTitle = driver.getTitle();
	
	
	}
}
