package com.automation.GoogleDemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterMethodTestNG {

	@BeforeTest // execute before all test in class
	public void loginToApplication() {
		System.out.println("Login to application BeforeTest");
	}

	@AfterTest // execute after all test in the class
	public void logoutFromApplication() {
		System.out.println("Logout from application AfterTest");
	}

	@BeforeMethod
	public void connectToDB() {
		System.out.println("DB Connected BeforeMethod");
	}

	@AfterMethod
	public void disconnectFromDB() {
		System.out.println("Disconnected DB Connection AfterMethod");
	}

	@Test(priority = 1, description = "This is a login test1")
	public void bloginTest() {

	}

	@Test(priority = 0, description = "This is a login test2")
	public void blogoutTest() {
	}
}
