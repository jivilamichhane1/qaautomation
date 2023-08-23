package com.automation.GoogleDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium. interactions.Actions;

public class Resizable {
public static void main(String[]args) {
	
	System.setProperty("webdriver.chrome.drive", "resources/chromedrover.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/resizable/");
	WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
	driver.switchTo().frame(frame);
	WebElement resiable = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
	Actions ob = new Actions(driver);
	ob.dragAndDropBy(resiable, 500, 100).build().perform();
	System.out.println("the object hasbeen ");
}
}
