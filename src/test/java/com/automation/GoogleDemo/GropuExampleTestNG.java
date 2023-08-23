package com.automation.GoogleDemo;

import org.testng.annotations.Test;

public class GropuExampleTestNG {
	
	@Test (groups = {"smoke"})
	public void longin1() {
		System.out.println("this is longin1");
	}
	@Test (groups = {"regression"})
	public void longin2() {
		System.out.println("this is longin2");
	}
	@Test (groups = {"regression"})
	public void longin3() {
		System.out.println("this is longin3");
	}
	@Test (groups = {"smoke", "regression"})
	public void longin4() {
		System.out.println("this is longin4");
	}
}
