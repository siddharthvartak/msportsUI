package com.playphone.msportsUI;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.playphone.msportsUI.pages.HomePage;
import com.playphone.msportsUI.pages.SdkMenuDrawer;
import com.playphone.msportsUI.pages.SupportPage;

import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageSupportFeedback {
	static WebDriver driver;
	HomePage homePageElements;
	SupportPage supportPageElements;
	SdkMenuDrawer sdkMenuDrawerElements;

	@BeforeMethod(alwaysRun = true)

		  public void ti () throws MalformedURLException {
				
				DesiredCapabilities capability = DesiredCapabilities.firefox();
				driver = new RemoteWebDriver(new URL("http://172.16.1.179:5555/wd/hub"), capability);
				driver.get("https://tournaments.olympus-stage.playphone.cc/");
				driver.manage().window().maximize();
				homePageElements = new HomePage(driver);
				supportPageElements = new SupportPage(driver);
				sdkMenuDrawerElements = new SdkMenuDrawer(driver);
	}


	@Test
	  public void SupportFeedback () throws InterruptedException {
		Thread.sleep(5000);
		homePageElements.clickSkip();
		Thread.sleep(25000);
		homePageElements.clickOuterMenuButton();
		Thread.sleep(15000);
		sdkMenuDrawerElements.clickSupport();
		Thread.sleep(10000);
		supportPageElements.clickGotoFeedback();
		Thread.sleep(2000);
		  
		  
	}
		    @AfterMethod(alwaysRun = true)
		    public void tearDown() throws MalformedURLException {
		    driver.quit();
		        
		        }
		      }



