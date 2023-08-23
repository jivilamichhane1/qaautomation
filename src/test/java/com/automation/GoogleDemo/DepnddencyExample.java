package com.automation.GoogleDemo;

import org.testng.annotations.Test;

public class DepnddencyExample {
	static String trakingNumber = null;

	@Test
	public void createShipment() {
		System.out.println("CreateShipment");
		trakingNumber = "45aa16";
	}

	@Test
	public void trackingshipment() throws Exception {
		if (trakingNumber != null)
			System.out.println("trackingshipment");
		else
			throw new Exception("invalid tracking number");
	}
	@Test
	public void cancelShipment() throws Exception {
		if (trakingNumber != null)
			System.out.println("cancelShipment");
		else
			throw new Exception("invalid tracking number");
	}
}

//CreateShipment-Trackingshipment-CancelShipment
//whenever you depend another test you create the dependency test