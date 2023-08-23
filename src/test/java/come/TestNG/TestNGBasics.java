package come.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	@BeforeClass
public void setUp() {
		System.out.println("BeforeClass--Setup");
	}
	
	@BeforeSuite
	public void launchBrowser() {
		System.out.println("BeforeSuite---lunchBrowser");
	}
	@BeforeMethod
	public void enterURL() {
		System.out.println("BeforeMethod---enterURL");
	}
	@BeforeTest
	public void login() {
		System.out.println("BeforeTest----login method");
	}
	@Test
	public void googleTitle() {
		System.out.println("Test-1-googleTitle-");
	}
	@Test
	public void searchTest() {
	System.out.println("Test-2-SearchTest");	
	}
	@Test
	public void googleLoginTest() {
		System.out.println("Test-3-Google log out");
	}
	@AfterMethod
	public void logout() {
		System.out.println("logout--from app");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("AfterClass--close browser");
	}
	@AfterSuite
	public void generateTestReport() {
		System.out.println("AfterSuite--generateTestReport");
	}
}
