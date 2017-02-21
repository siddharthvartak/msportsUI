package com.playphone.msportsUI;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class WorkingTest {
	
	@Test
	public void ti () throws InterruptedException {
		File pathToBinary = new File("/Applications/Firefox.app/Contents/MacOS/firefox");
		FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();       
		WebDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);
		//WebDriver driver;
		//System.setProperty("webdriver.gecko.driver", "/Users/siddharth/bin/geckodriver");
		//DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		//capabilities.setCapability("marionette", true);
		//WebDriver driver = new FirefoxDriver(capabilities);
		
		driver = new FirefoxDriver();
		String baseURL = "http://games.o01.dev.playphone.cc/#/?";
		
		driver.get(baseURL);
		//driver.manage().window().maximize();
		
		Thread.sleep(1000);
		driver.quit();
	

	}

}



