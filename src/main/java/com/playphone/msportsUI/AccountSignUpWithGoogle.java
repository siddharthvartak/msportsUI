package com.playphone.msportsUI;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.playphone.msportsUI.pages.HomePage;
import com.playphone.msportsUI.pages.SignupPage;
import org.testng.annotations.BeforeMethod;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AccountSignUpWithGoogle {
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
	  signupPageElements.clickSignWithGoogle();
	  Thread.sleep(5000);
	  signupPageElements.enterGmailEmailInput("testuser3076@gmail.com");
	  signupPageElements.clickEmailNext();
	  Thread.sleep(6000);
	  signupPageElements.enterGmailPassword("mikimiki");
	  signupPageElements.clickPasswordNext();
	  Thread.sleep(5000);
	  /*homePageElements.clickSkip();
	  Thread.sleep(5000);
	  homePageElements.clickSkip();*/
	   
	}

  
	@AfterMethod(alwaysRun = true)
	public void tearDown() throws Exception {
		driver.quit();

	}
	
}



