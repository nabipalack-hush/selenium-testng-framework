package com.bit.DB;

import org.testng.annotations.DataProvider;

public class DataDriven {

	 @DataProvider(name="login")
	  public Object[][] dp() {
		Object[] [] o=new Object[2][2];
		o[0][0]="user1";
		 o[0][1]="user4";
		 o[1][0]="user2";
		 o[1][1]="user43";
		 return o;
		 
	 }
	    //return new Object[][] {
//	      new Object[] { 1, "a" },
//	      new Object[] { 2, "b" },
//	    };
	//  }
}
