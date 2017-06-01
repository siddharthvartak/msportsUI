package com.playphone.msportsUI;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.playphone.msportsUI.pages.HomePage;
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


public class AccountSignUpWithFacebook {
  static WebDriver driver;
  HomePage homePageElements;
  SignupPage signupPageElements;
 
 

  @BeforeMethod(alwaysRun = true)

	  public void ti () throws MalformedURLException {
			
			DesiredCapabilities capability = DesiredCapabilities.firefox();
			driver = new RemoteWebDriver(new URL("http://172.16.1.180:5555/wd/hub"), capability);
			driver.get("https://tournaments.olympus-stage.playphone.cc/#/");
			homePageElements = new HomePage(driver);
			signupPageElements = new SignupPage(driver);
			

  }

  @Test
	public void NewAccountSignup () throws InterruptedException {
	  Thread.sleep(5000);
	  homePageElements.clickSkip();
	  Thread.sleep(5000);
	  homePageElements.clickFloaterSignUp();
	  Thread.sleep(3000);
	  homePageElements.clickSkip();
	  Thread.sleep(12000);
	  signupPageElements.clickSignWithFacebook();
	  Thread.sleep(5000);
	  signupPageElements.enterFacebookEmail("randomuser321@gmail.com");
	  Thread.sleep(5000);
	  signupPageElements.enterFacebookPassword("test1234");
	  signupPageElements.clickFacebookLoginButton();
	  new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='u_0_6']")));
			
			 driver.findElement(By.xpath(".//*[@id='u_0_6']")).click();
			 if(driver.findElements(By.xpath(".//*[@id='u_0_6']")).size() != 0){
			    	System.out.println("Element is Present");
			    	}else{
			    	System.out.println("Element is Absent");
			    	}
	    }

  
	@AfterMethod(alwaysRun = true)
	public void tearDown() throws Exception {
		driver.quit();

	}
	
}



