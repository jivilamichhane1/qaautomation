package com.automation.GoogleDemo;

import org.testng.annotations.Test;

public class GrupTestNG1 {
	@Test(groups={"smoke"})//must select the group names
	//value must be form of the aray
public void test1() {
	System.out.println("test1"); //Type sysout Ctrl+Space
}
	@Test (groups={"regression","sanity"})
public void test2() {
	System.out.println("test2");
}
	@Test 
public void test3() {
	System.out.println("test3");
}
	@Test (groups={"functional"})
public void test4() {
	System.out.println("test4");
}
}