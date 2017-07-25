package com.playphone.msportsUI;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.playphone.msportsUI.pages.HomePage;
import com.playphone.msportsUI.pages.SdkMenuDrawer;
import com.playphone.msportsUI.pages.SignupPage;

public class MenuDrawerLogin {
	static WebDriver driver;
	HomePage homePageElements;
    SignupPage signupPageElements;
    SdkMenuDrawer sdkMenuDrawerElements;
	 

	  @BeforeMethod(alwaysRun = true)

		  public void ti () throws MalformedURLException {
		    
		    DesiredCapabilities capability = DesiredCapabilities.firefox();
		    driver = new RemoteWebDriver(new URL("http://172.16.1.179:5555/wd/hub"), capability);
			driver.get("https://tournaments.msports.games");
			driver.manage().window().maximize();
			homePageElements = new HomePage(driver);
			signupPageElements = new SignupPage(driver);
			sdkMenuDrawerElements = new SdkMenuDrawer(driver);	
	  }

	  @Test
	  public void TestValidLogin () throws InterruptedException {
		  
		Thread.sleep(3000);
		homePageElements.clickSkip();
		Thread.sleep(25000);
		homePageElements.clickOuterMenuButton();
		Thread.sleep(10000);
		sdkMenuDrawerElements.clickMenuButtonLogin();
		Thread.sleep(20000);
		homePageElements.emailLogin();
		Thread.sleep(3000);
		homePageElements.enterEmail("randomuser321@hotmail.com");
		Thread.sleep(3000);
		homePageElements.enterPassword("test1234");
		Thread.sleep(5000);
		homePageElements.submitClick();
		
		    
	  }
	  

	  


	@AfterMethod(alwaysRun = true)
	public void tearDown() throws MalformedURLException {
		  //Thread.sleep(4000);
	    driver.quit();
	    
	    }
	  }
