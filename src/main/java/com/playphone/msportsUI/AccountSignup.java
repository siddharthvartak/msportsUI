package com.playphone.msportsUI;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.playphone.msportsUI.pages.HomePage;
import com.playphone.msportsUI.pages.SignupPage;

import org.testng.annotations.BeforeMethod;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class AccountSignup {
  static WebDriver driver;
  HomePage homePageElements;
  SignupPage signupPageElements;
 

  @BeforeMethod(alwaysRun = true)

	  public void ti () throws MalformedURLException {
			
		    DesiredCapabilities capability = DesiredCapabilities.firefox();
			driver = new RemoteWebDriver(new URL("http://172.16.1.179:5555/wd/hub"), capability);
			driver.get("https://tournaments.msports.games");
			homePageElements = new HomePage(driver);
			signupPageElements = new SignupPage(driver);
			

  }

  @Test
	public void NewAccountSignup () throws InterruptedException {
	  Thread.sleep(5000);
	  homePageElements.clickSkip();
	  Thread.sleep(27000);
	  homePageElements.clickFloaterSignUp();
	  Thread.sleep(3000);
	  homePageElements.clickSkip();
	  Thread.sleep(12000);
	  signupPageElements.clickSignupWithEmail();
	  Thread.sleep(4000);
	  Random randomGenerator = new Random();  
	    int randomInt = randomGenerator.nextInt(10000);
	    driver.findElement(By.xpath("//input[@data-pp-auto-id='sign-up-email-input']")).sendKeys("msportsTestUser"+ randomInt +"@gmail.com");
	  Thread.sleep(3000);
	  signupPageElements.enterSignupPasswordInput("test1234");
	  signupPageElements.clickCreateAccountButton();
	  Thread.sleep(5000);
	  
	  
	  /*Find menu button
		 driver.findElement(By.xpath("//div[@data-pp-auto-id='outer-menu-button']")).click();
		 if(driver.findElements(By.xpath("//*[@id='jackpots']/div[1]/div[1]/div[1]")).size() != 0){
		    	System.out.println("Element is Present");
		    	}else{
		    	System.out.println("Element is Absent");
		    	}*/
	
		 
	}

  
	@AfterMethod(alwaysRun = true)
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.quit();

	}
	
}


