package com.bit.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SmokeTest {

	@Test(groups="frontends")
	public void logout() {
		Reporter.log("test1");
		System.out.println(System.getProperty("user.dir"));
	}
}
