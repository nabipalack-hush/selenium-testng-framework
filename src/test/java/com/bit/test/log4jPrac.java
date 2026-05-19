package com.bit.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class log4jPrac {

	
	@Test
	public void test2() {
		DOMConfigurator.configure("log4j.xml");
		Logger log=Logger.getLogger(log4jPrac.class);
		
		
		ChromeOptions cp=new ChromeOptions();
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setPlatform(Platform.ANY);
		cap.merge(cp);
		WebDriver dr=null;
		try {
			dr = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dr.get("http://www.google.com");
		
		
		
		log.fatal("this is fatal");
		log.error("this is error");
		log.warn("this is waen");
		log.info("this is info");
		log.debug("this is debug");
		log.trace("this is trace");
	}
	@Test
	public void test1() {
		DOMConfigurator.configure("log4j.xml");
		Logger log=Logger.getLogger(log4jPrac.class);
		
		
		ChromeOptions cp=new ChromeOptions();
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setPlatform(Platform.ANY);
		cp.merge(cap);
		WebDriver dr=null;
		try {
			dr = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dr.get("http://www.google.com");
		
		
		
		log.fatal("this is fatal");
		log.error("this is error");
		log.warn("this is waen");
		log.info("this is info");
		log.debug("this is debug");
		log.trace("this is trace");
	}
}
