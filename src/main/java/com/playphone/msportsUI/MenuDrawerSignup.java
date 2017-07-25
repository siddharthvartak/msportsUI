package com.playphone.msportsUI;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.playphone.msportsUI.pages.HomePage;
import com.playphone.msportsUI.pages.SdkMenuDrawer;
import com.playphone.msportsUI.pages.SignupPage;

public class MenuDrawerSignup {
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
		Thread.sleep(20000);
		sdkMenuDrawerElements.clickMenuButtonSignup();
		Thread.sleep(22000);
		homePageElements.clickSkip();
		Thread.sleep(12000);
//		homePageElements.clickSkip();
//		Thread.sleep(12000);
		signupPageElements.clickSignupWithEmail();
		Thread.sleep(14000);
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(10000);
		driver.findElement(By.xpath("//input[@data-pp-auto-id='sign-up-email-input']"))
				.sendKeys("msportsTestUser" + randomInt + "@gmail.com");
		Thread.sleep(3000);
		signupPageElements.enterSignupPasswordInput("test1234");
		signupPageElements.clickCreateAccountButton();
		Thread.sleep(5000);

		    
	  }
	  

	  


	@AfterMethod(alwaysRun = true)
	public void tearDown() throws MalformedURLException {
		  //Thread.sleep(4000);
	    driver.quit();
	    
	    }

}
