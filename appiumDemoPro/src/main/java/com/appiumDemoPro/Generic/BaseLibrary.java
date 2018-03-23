package com.appiumDemoPro.Generic;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseLibrary {
	public  DesiredCapabilities cap=null;
	public static AndroidDriver<MobileElement> driver; 
	public ExtentReports extent;
	ExtentTest logger=extent.startTest("BaseClassTest");
	
	@BeforeSuite
	public void reportGrenerator(){
		 extent=new ExtentReports("./test-output/advancereport.html");
		    extent.loadConfig(new File("Path .xml file"));
		
		
	}
		
	@BeforeClass
	public void launchApp() throws MalformedURLException{
	cap=new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "");
	cap.setCapability(MobileCapabilityType.APP, "/home/tyss/Desktop/AppiumGitLocalRepos/appiumDemoPro/arbohub.apk");
	cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "30");
	driver=new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723"), cap);
	
	
	}
	
	@BeforeMethod
	
	public void logginCofig(){
		
	}
	
	@Test
	public void sample(){
		System.out.println("Hello");
	}
	
	@AfterMethod
	public void logOutConfig(){
		driver.closeApp();
	}
	
	@AfterClass
	
	public void cleanConfig(){
		
		driver.closeApp();
		
	}
	
	@AfterSuite
	
	public void closeReport(){
		 extent.flush();
		 extent.close();
		
	}
	
}
