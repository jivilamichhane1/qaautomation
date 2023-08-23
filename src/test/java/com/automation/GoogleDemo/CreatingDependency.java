package com.automation.GoogleDemo;

import org.testng.annotations.Test;

public class CreatingDependency {
	static String trakingNumber = null;
	@Test
	public void createShipment() {
		System.out.println(5/0);
		System.out.println("CreateShipment");
		trakingNumber = "45aa16";
	}
	@Test(dependsOnMethods = {"CreateShipment"})//parameter is dependsOnMethods & use the ray {} value 
	public void trackSipment() throws Exception {
		if (trakingNumber != null)
			System.out.println("trackShipment");
		else
			throw new Exception("invalid tracking number");
	}
	@Test(dependsOnMethods = {"CreateShipment","trackShipment"})
	public void cancelShipment() throws Exception {
		if (trakingNumber != null)
			System.out.println("cancelShipment");
		else
			throw new Exception("invalid tracking number");
	}
}
