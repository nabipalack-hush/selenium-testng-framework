package com.bit.DB;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.bit.test.BaseTest;
import com.bit.util.utils;

public class BaseListener  implements ITestListener {

//	public BaseListener(WebDriver driver) {
//		super(driver);
//		// TODO Auto-generated constructor stub
//	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getName()+" is started");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getName()+ "status is "+result.getStatus() );
	}

	public void onTestFailure(ITestResult result)  {
		// TODO Auto-generated method stub
		System.out.println(result.getName()+" is failred");
		//utils u=new utils(dr);
	
//			try {
//				getScreenshot();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getName()+" is skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getName()+" success rate");
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println(context.getClass()+" is statting");
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println(context.getName()+" is finised");
	}

}
