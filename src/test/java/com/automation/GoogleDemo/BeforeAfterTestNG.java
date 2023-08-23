package com.automation.GoogleDemo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterTestNG {
	
	@BeforeTest //execute before all test in class
public void loginToApplication() {
	System.out.println("Login to application");
}
	
	@AfterTest //execute after all test in the class
public void logoutFromApplication() {
	System.out.println("Logout from application");
}
	@Test(priority = 1, description = "This is a login test")
public void bloginTest() {
	
}
}