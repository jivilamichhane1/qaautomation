package com.automation.GoogleDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderExam {
	
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
