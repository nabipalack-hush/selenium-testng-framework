package com.bit.test;

import org.testng.annotations.Test;

import com.bit.DB.DataDriven;

public class DBTest {

	  @Test(dataProvider = "datalogin",dataProviderClass=Utils.class,description="this for datadriven")
	  public void fgd(String n, String s) {
		  System.out.println(n);
		  System.out.println(s);
	  }
}
