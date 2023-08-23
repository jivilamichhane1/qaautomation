package com.automation.GoogleDemo;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium. interactions.Actions;

import java.time.Duration;
import java.util.List;
//clt+? to select all comment
public class ActionClass {
public static void main(String []args) {
System.setProperty("webdriver.chrome.drive", "resources/chromedrover.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://jqueryui.com/demos/"); //how to get it need reminder

//WebElement draggable = driver.findElement(By.xpath("//div[@id='sidebar']/aside[1]/ul/li[1]/a"));
//Actions actions = new Actions(driver); //not working I typed
//draggable.click();

System.out.println("the draggable link clicked");


Actions actions = new Actions(driver);

//WebElement dragAndDrop = driver.findElement(By.xpath("//*[id='draggable']/p"));
//actions.dragAndDropBy(dragAndDrop, 140, 300).build().perform();

//System.out.println("the element is dragged");

//WebElement sortable = driver.findElement(By.xpath("//*div[@id='sidebar']/aside[1]/ul/li[5]/a"));
//actions.contextClick(sortable).build().perform();
System.out.println("sortable has been open");
//Thread.sleep(5000); not working

//WebElement accordion = driver.findElement(By.xpath("//div[@id='sidebar']/aside[2]/ul/li[1]/a"));
//actions.contextClick(accordion).build().perform();
System.out.println("accordion has been open");
WebElement droppable = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a"));
droppable.click();
WebElement frame = driver.findElement(By.className("demo-frame"));

driver.switchTo().frame(0);
WebElement DrageAndDropS = driver.findElement(By.id("draggable"));
WebElement DrageAndDropD = driver.findElement(By.id("droppable"));
actions.dragAndDrop(DrageAndDropS, DrageAndDropD).build().perform();
//actions.clickAndHold(DrageAndDropS).pause(Duration.ofSeconds(2))
//.moveToElement(DrageAndDropD).release().build().perform();


System.out.println("box has been dropped");
driver.get("https://jqueryui.com/demos");



//Actions class is a feature to handle mouse and keyboard functionalities

//double click, move to element, click and hold



WebElement draggable = driver.findElement(By.xpath("//div[@id='sidebar']/aside[1]/ul/li[1]/a"));

//Actions actions = new Actions(driver);

actions.click(draggable).build().perform();

draggable.click();



System.out.println("the draggable link is clicked");

driver.quit();
}
}
