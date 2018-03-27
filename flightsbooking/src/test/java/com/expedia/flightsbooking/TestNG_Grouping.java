package com.expedia.flightsbooking;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestNG_Grouping {
	
	@BeforeClass(alwaysRun=true)
	public void setUp() {
		System.out.println("Running before class");
	}
	
	@AfterClass(alwaysRun=true)
	public void cleanUp() {
		System.out.println("Running after class");
	}
	
	@Test(groups = {"cars","suv"})
	public void testBMWX6() {
		System.out.println("Running test -> BMW X6");
	}
	
	@Test(groups = {"cars","sedan"})
	public void testAudiA6() {
		System.out.println("Running test -> Audi A6");
	}
	
	@Test(groups = {"bikes"})
	public void testNinja() {
		System.out.println("Running test -> Kawasaki Ninja");
	}
	
	@Test(groups = {"bikes"})
	public void testHondaCBR() {
		System.out.println("Running test -> Honda CBR");
	}

	

}
