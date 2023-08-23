package com.automation.GoogleDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium. interactions.Actions;

public class Action2ndJuly extends ActionClass {
public static void main (String[]args) {	
		System.setProperty("webdriver.chrome.drive", "resources/chromedrover.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Actions act=new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		act.dragAndDropBy(driver.findElement
		(By.xpath("//div[@id='draggable']")), 300, 150).build().perform();
	System.out.println("The box has been draged");			

}
}
