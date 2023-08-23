package com.automation.GoogleDemo;

import org.testng.annotations.Test;

public class GroupsExampleInTestNG {

	@Test(groups = { "sanity" })
	void test1() {
		System.out.println("this is test1.....");
	}

	@Test(groups = { "regression" })
	void test2() {
		System.out.println("this is test2.....");
	}

	@Test(groups = { "smoke" })
	void test3() {
		System.out.println("this is test3.....");
	}

	@Test(groups = { "regression" })
	void test4() {
		System.out.println("this is test4.....");
	}

	@Test(groups = { "sanity", "smoke" })
	void test5() {
		System.out.println("this is test5.....");
	}

	@Test(groups = { "sanity", "smoke", "regression" })
	void test6() {
		System.out.println("this is test6.....");
	}
}
