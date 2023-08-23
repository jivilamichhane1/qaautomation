package com.automation.GoogleDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium. interactions.Actions;

public class DrageAndDrop {
public static void main (String[]args) {
	System.setProperty("webdriver.chrome.drive", "resources/chromedrover.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/droppable/");
	
	WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
	driver.switchTo().frame(frame);
	WebElement drag = driver.findElement(By.id("draggable"));
	WebElement drop = driver.findElement(By.id("droppable"));
	
	Actions action = new Actions (driver);
action.dragAndDrop(drag, drop).build().perform();
	System.out.println ("The square has been drop");
}
}
