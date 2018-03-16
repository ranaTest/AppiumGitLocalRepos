package com.appiumDemoPro.Generic;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseLibrary {
	public  DesiredCapabilities cap=null;
	public AndroidDriver<MobileElement> driver=null; 
	
	@BeforeClass
	public void launchApp() throws MalformedURLException{
	cap=new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "");
	cap.setCapability(MobileCapabilityType.APP, "");
	cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "30");
	driver=new AndroidDriver<MobileElement>(new URL("http://0.0.0.1:4723"), cap);
	
	
	}
	
	@Test
	public void sample(){
		System.out.println("Hello");
	}
	
	@AfterMethod
	public void closeApp(){
		driver.closeApp();
	}
}
