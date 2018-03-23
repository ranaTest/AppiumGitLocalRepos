package com.appiumDemoPro.Generic;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class Demo {
	
	public static WebDriver driver;

	@Test
	public void takeScreenShot() throws Throwable{
		// TODO Auto-generated method stub
		
		EventFiringWebDriver edriver=new EventFiringWebDriver(driver);
File screenshot=edriver.getScreenshotAs(OutputType.FILE);
BufferedImage fullImg=ImageIO.read(screenshot);

	}

}
