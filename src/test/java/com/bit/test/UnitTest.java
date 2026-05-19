package com.bit.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class UnitTest extends BaseTest {
	
	@Test(groups="frontend")
	public void buyAshirt() {
		System.out.println("test2");
	}
	@Test(groups="frontend")
	public void buyAshirt1() {
		System.out.println("test2");
	}
	
	
	@Parameters({"browser"})
	@Test
	public void buyApants(String b) {
		System.out.println(b);
	}
	
}
