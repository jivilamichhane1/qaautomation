package com.automation.GoogleDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class allTestNGGroupNmoreExample {
	@Parameters({"URL","userName"})
	
	@Test(groups= {"smoke"})
public void run(String url, String userName) {
		System.out.println(url);
		System.out.println(userName);
	System.out.println("This metod is to run the program");//Ctrl+spac
}
	@Test(groups= {"smoke"})
	public void beforeMethod() {
		System.out.println("beforeMethod");//Ctrl+spac
	}
	@Test(groups= {"sanity"})
	public void afterMethod() {
		System.out.println("afterMethod");//Ctrl+spac
	}
	@Test(groups= {"regression"})
	public void stop() {
		System.out.println("This metod is to stop the program");//Ctrl+spac
	}
	@Test(groups= {"smoke", "regression"})
	public void enabledTest() {
		System.out.println("This metod is to enabledTest the program");//Ctrl+spac
	}
	@Test(groups= {"smoke", "sanity"})
	public void enabledTest2() {
		System.out.println("This metod is to enabledTest2 the program");//Ctrl+spac
	}
	@Test(groups= {"smoke", "sanity", "regression"})
	public void dependMethod() {
		System.out.println("This metod is to dependMethod the program");//Ctrl+spac
	}
	public void testing() {
		System.out.println("this is testing");
	}
	@DataProvider
	public Object [][] getData(){
		Object[][] data = new Object[2][2];
		data [0][0]="first userName";
		data [0][1]="first password";
		data [1][0]="second userName";
		data [1][2]="second password";
		return data;
		
	}
	@Test(dataProvider="getData")
	public void useData(String userName, String password) {
		System.out.println(userName);
		System.out.println(password);
	}
}
