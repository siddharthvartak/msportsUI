package com.playphone.msportsUI;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.playphone.msportsUI.pages.HomePage;
import com.playphone.msportsUI.pages.LoginPage;

import org.testng.annotations.BeforeMethod;
 

import java.net.MalformedURLException;
import java.net.URL;
 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class forgotpasswordloginpage {
	static WebDriver driver;
	HomePage homePageElements;
	LoginPage loginPageElements;
	 

	  @BeforeMethod(alwaysRun = true)

		  public void ti () throws MalformedURLException {
				
				DesiredCapabilities capability = DesiredCapabilities.firefox();
				driver = new RemoteWebDriver(new URL("http://172.16.1.180:5555/wd/hub"), capability);
				driver.get("https://tournaments.msports.games");
				homePageElements = new HomePage(driver);
				loginPageElements = new LoginPage(driver);
	  }

	  @Test
	  public void forgotpassword () throws InterruptedException {
		  
		  Thread.sleep(5000);
		  homePageElements.clickSkip();
		  Thread.sleep(3000);
		  homePageElements.clickLoginButton();
		  Thread.sleep(10000);
		  loginPageElements.clickForgotPasswordLoginPage();
		  Thread.sleep(5000);
		  loginPageElements.enterEmail("randomuser3210@hotmail.com");
		  Thread.sleep(5000);
		  loginPageElements.resetPasswordButton();
		  Thread.sleep(5000);
		  
		  	 

}
	  @AfterMethod(alwaysRun = true)
	  public void tearDown() throws MalformedURLException {
	  	  //Thread.sleep(4000);
	      driver.quit();
	      
	      }
	    }