package com.automation.GoogleDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium. JavascriptExecutor;


public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.drive", "resources/chromedrover.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com");
		Thread.sleep(5000);
		WebElement demos = driver.findElement(By.xpath("//*[@id=\"menu-top\"]/li[1]/a"));
		demos.click();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments(0).click();", demos);
	Thread.sleep(5000);
	
	
	System.out.println("clicked demos");
	
	
	driver.quit();
	}

}
