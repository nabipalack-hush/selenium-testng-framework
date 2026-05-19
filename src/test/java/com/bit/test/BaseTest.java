package com.bit.test;

import org.testng.annotations.Test;

import com.bit.util.utils;
import com.sun.javafx.util.Utils;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseTest {

	public WebDriver dr;
	@Parameters({"browser","url"})
  @BeforeMethod(groups="frontend")
  public void beforeMethod(String b,String u) {
	 // System.out.println("bm");
	  if(b.equals("chrome")) {
		  //open chrome
	  }else if(b.equals("ie")) {
		  
	  }
	  //open browser
	  //go to url
  }

  @AfterMethod
  public void afterMethod(ITestResult r) throws IOException {
	  System.out.println("am");
	  switch(r.getStatus()) {
	  case ITestResult.FAILURE:
	  {
		  utils.getScreenshot();
	  }
	  case ITestResult.SUCCESS:{
		  System.out.println(r.getName()+" is passed");
	  }
	  case ITestResult.SKIP:{
		  System.out.println();
	  }
	  }
	  
  }


 
  @BeforeClass
  public void beforeClass() {
	  System.out.println("bc");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("ac");
	 
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("bt");
	  //read prop file
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("at");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("bs");
	  //start configure report
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("as");
  }

}
