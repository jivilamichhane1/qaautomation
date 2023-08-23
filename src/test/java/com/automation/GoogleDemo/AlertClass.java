package com.automation.GoogleDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClass {
public static void main (String []args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.drive", "resources/chromedrover.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File ("resources/screenshot.png"));
		
		WebElement popup = driver.findElement(By.id("alertButton"));
		popup.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		driver.quit();
		
}
}
