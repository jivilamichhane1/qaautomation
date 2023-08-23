package com.automation.GoogleDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleTestNG {
	@Test
public void testGoogle() throws InterruptedException {
		System.setProperty("wedriver.chrome.driver", "resources/chromedrover.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://google.com/");
	driver.findElement(By.name("q")).sendKeys("Nepal",Keys.ENTER);
	System.out.println(driver.getTitle());
	
	Thread.sleep(5000);	

}
	public void facebook() throws InterruptedException {
		System.setProperty("wedriver.chrome.driver", "resources/chromedrover.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://face.com/");
	driver.findElement(By.name("email")).sendKeys("Nepal",Keys.ENTER);
	System.out.println(driver.getTitle());
	
	Thread.sleep(5000);
	
 driver.quit();
}
}
