package com.automation.GoogleDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class JavaScriptExecutorDemo {
@Test //TestNg is testing framework which can be used for unit, integration, end-to-end, functional testing. 
// Testing framewrok for Java Programming Language
//Created Cedric Beust
//Inspired by JUnit and NUnit
//provides additional features compare to JUnite
public void login() {
	
		System.setProperty("wedriver.chrome.driver", "resources/chromedrover.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://twoplugs.com/");
	WebElement joinNowFree = driver.findElement(By.className("help"));
	
	}

}
