package com.bit.util;

import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.Location;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.interactions.TouchScreen;
import org.openqa.selenium.remote.SessionId;
import org.openqa.selenium.support.ui.Select;

public class SeleniumMethods {

	ChromeDriver dr;
	WebElement ele;
	List<WebElement> eles;
	Keyboard key;
	Mouse m;
	Options opt;
	Navigation na;
	public void driverMethod() {
		dr.close();
		ele=dr.findElement(By.className(""));
		//Webelement method
		ele.clear();
		ele.click();
		ele.findElement(By.id(""));
		ele.findElements(By.id(""));
		ele.getAttribute("id");
		ele.getCssValue("font-size");
		int x=ele.getRect().height;
		Dimension  d=ele.getSize();//to get hight and width
		ele.getTagName();
		ele.getText();
		ele.isDisplayed();
		ele.isEnabled();
		ele.isSelected();
		ele.sendKeys(Keys.ARROW_RIGHT);
		ele.submit();
		//webelements
		eles=dr.findElements(By.xpath(""));
		dr.get("");
		dr.getCurrentUrl();
		key=dr.getKeyboard();
		m=dr.getMouse();
		dr.getPageSource();
		File f=dr.getScreenshotAs(OutputType.FILE);
		SessionId sid=dr.getSessionId();
		dr.getTitle();
		TouchScreen ts=dr.getTouch();
		String pwin=dr.getWindowHandle();
		Set<String> cwin=dr.getWindowHandles();
		Location l=dr.location();
		opt=dr.manage();
		//Options methods
		Cookie c=opt.getCookieNamed("dgdfgdg");
		opt.addCookie(c);//opt return all methods from cookie
		opt.timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		opt.window().fullscreen();//option provide all method to window handle
		opt.window().maximize();
		opt.timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		opt.timeouts().setScriptTimeout(10, TimeUnit.SECONDS);//option provide all methods to load page
		opt.window().getPosition().getX();//to get window coordinates
		opt.window().maximize();
		
		//navigate method
		na=dr.navigate();
		na.forward();
		na.back();
		na.to("url");
		na.refresh();
		
		dr.quit();
		
		//targetlocator method
		TargetLocator tl=dr.switchTo();
		tl.activeElement();
		Alert al=tl.alert();
		tl.defaultContent();
		tl.frame(0);
		tl.frame("name");
		tl.frame(ele);
		tl.parentFrame();
		tl.window("window name");
		
		
	}
	
	public void handleDropDown() {
		Select s=new Select(ele);
		s.getAllSelectedOptions();
		s.getFirstSelectedOption();
		s.getOptions().size();
		s.selectByIndex(6);
		List<WebElement> eles=s.getOptions();
//		for(WebElement ele:eles) {
//			String v=ele.getText();
//			s.selectByValue(v);
//		}
//		
		for(int i=s.getOptions().size()-1;i>=0;i--) {
			s.selectByIndex(i);
		}
		
		
		s.selectByValue("Jan");
		s.selectByVisibleText("Sat");
		
	}
	
	public void mouseRelatedMethods() {
		Actions a=new Actions(dr);
		a.click(ele);
		a.click();
		a.clickAndHold();
		a.clickAndHold(ele);
		a.contextClick(ele);
		a.dragAndDrop(ele, ele);
		a.dragAndDropBy(ele, 100, 200).perform();;
		a.doubleClick(ele);
		a.keyUp(Keys.ARROW_UP);
		a.moveToElement(ele);
		a.pause(10);
		a.release().perform();;
		a.sendKeys("");
		a.contextClick(ele).build().perform();;
		
	}
	
	public void alertHandle() {
		Alert a=dr.switchTo().alert();
		a.accept();
		a.dismiss();
		a.sendKeys("");
		a.getText();
		
		
	}
	Actions a;
	public void multipleWindowHandle() {
		 a=new Actions(dr);
		a.contextClick(ele).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		String pwin=dr.getWindowHandle();
		Set<String> cwin=dr.getWindowHandles();
		for(String win:cwin) {
			if(!win.equals(pwin)) {
				dr.switchTo().window(win);
				
				//dr.switchTo().defaultContent();
			}
		}
	}
	public void iframeHandle(String frameName) {
		List<WebElement> frames=dr.findElements(By.tagName("iframe"));
		for(WebElement frame:frames)
		{
			if(frame.getAttribute("class").equals(frameName)) {
				dr.switchTo().frame(frameName);
			}
		}
		//dr.switchTo().frame(0);
		//a.dragAndDrop(ele, ele).build().perform();
	}
	
	public void handleCookies(String cookieValue) {
		Set<Cookie> allcookies=dr.manage().getCookies();
		for(Cookie cookie:allcookies) {
			if(cookie.getValue().equals(cookieValue)) {
				System.out.println("is present");
			}
			dr.manage().deleteCookie(cookie);
		}
	}
	
	public void handleBOM() {
		JavascriptExecutor js=(JavascriptExecutor)dr;
		js.executeScript("window.scrollBy(0.500)");
		js.executeAsyncScript("document.getElementById("email").values="sdffgs"");
		js.executeAsyncScript("arguments[0].click()",ele);
	}
	
	
	
	
	
	
	
	
}
