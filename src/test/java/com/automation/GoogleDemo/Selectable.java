package com.automation.GoogleDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium. interactions.Actions;

public class Selectable {
public static void main(String []args) throws InterruptedException {
	System.setProperty("webdriver.chrome.drive", "resources/chromedrover.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/selectable/");
	WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
	driver.switchTo().frame(frame);
	WebElement selectable = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[4]/a"));
selectable.click();
	WebElement selelectElement = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]"));
selelectElement.click();	
	Actions actions = new Actions(driver);
	actions.click(selectable).build().perform();
	
	Thread.sleep(5000);
	System.out.println("click item one");
}

}
