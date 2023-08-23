package com.automation.GoogleDemo;

import org.testng.annotations.Test;

public class PrirotyExapmples {

	static String trakingNumber = null;

	@Test(priority = 1)
	public void createShipment() {
		System.out.println("CreateShipment");
		trakingNumber = "45aa16";
	}

	@Test(priority = 2)
	public void trackingshipment() throws Exception {
		if (trakingNumber != null)
			System.out.println("trackingshipment");
		else
			throw new Exception("invalid tracking number");
	}

	@Test (priority = 3)
	public void cancelShipment() throws Exception {
		if (trakingNumber != null)
			System.out.println("cancelShipment");
		else
			throw new Exception("invalid tracking number");
	}
}
