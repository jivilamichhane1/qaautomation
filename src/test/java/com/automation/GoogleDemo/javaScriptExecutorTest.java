package com.automation.GoogleDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;


public class javaScriptExecutorTest {

	public static void main(String []args) {
		System.setProperty("webdriver.chrome.drive", "resources/chromedrover.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		//WebElement clinic = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]"));
		//clinic.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scorllBy(0,500)");
		
		driver.quit();
		
		
		
		
		
	}
}
