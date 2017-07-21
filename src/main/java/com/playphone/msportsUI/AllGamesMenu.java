package com.playphone.msportsUI;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.playphone.msportsUI.pages.HomePage;
import com.playphone.msportsUI.pages.SdkMenuDrawer;
import com.playphone.msportsUI.pages.SignupPage;

import org.testng.annotations.BeforeMethod;
 

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllGamesMenu {
	static WebDriver driver;
	HomePage homePageElements;
	SignupPage signupPageElements;
	SdkMenuDrawer sdkMenuDrawerElements;
		
	 

	  @BeforeMethod(alwaysRun = true)

		  public void ti () throws MalformedURLException {
				
				DesiredCapabilities capability = DesiredCapabilities.firefox();
				driver = new RemoteWebDriver(new URL("http://172.16.1.180:5555/wd/hub"), capability);
				driver.get("https://tournaments.msports.games");
				homePageElements = new HomePage(driver);
				signupPageElements = new SignupPage(driver);
				sdkMenuDrawerElements = new SdkMenuDrawer(driver);
				
	  }

	  @Test
	  public void TestValidLogin () throws InterruptedException {
		  
		  Thread.sleep(3000);
		  homePageElements.clickSkip();
		  Thread.sleep(20000);
		  homePageElements.clickLoginButton();
		  Thread.sleep(10000);
		  homePageElements.emailLogin();
		  Thread.sleep(5000);
		  homePageElements.enterEmail("randomuser321@hotmail.com");
		  Thread.sleep(5000);
		  homePageElements.enterPassword("test1234");
		  Thread.sleep(5000);
		  homePageElements.submitClick();
		  Thread.sleep(15000);
		  homePageElements.clickSkip();
		  Thread.sleep(5000);
		  homePageElements.clickSkip();
		  Thread.sleep(5000);
		  homePageElements.clickOuterMenuButton();
		  Thread.sleep(5000);
		  sdkMenuDrawerElements.clickGames();
//		  new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class, 'home-header-title') and contains(@class ,'home-header-title')]")));
//		  if(driver.findElements(By.xpath("//div[contains(@class, 'home-header-title') and contains(@class ,'home-header-title')]")).size() != 0){
//		    	System.out.println("Element is Present");
//		    	}else{
//		    	System.out.println("Element is Absent");
//		    	}
		  
	  }
	  
    @AfterMethod(alwaysRun = true)
	public void tearDown() throws MalformedURLException {
		  //Thread.sleep(4000);
	    driver.quit();
	    
	    }
	  }

