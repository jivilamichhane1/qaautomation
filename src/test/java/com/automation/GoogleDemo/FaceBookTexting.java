package com.automation.GoogleDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v114.input.Input;

public class FaceBookTexting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.drive", "resources/chromedrover.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.findElement(By.name("login")).click();
		
        WebElement createAccount = driver.findElement(By.xpath("//div[@class='_6ltg'][2]/a"));

        createAccount.click();

        

        Thread.sleep(5000);

        WebElement month = driver.findElement(By.id("month"));

        Select select = new Select(month);

        select.selectByValue("2");

	}

}
