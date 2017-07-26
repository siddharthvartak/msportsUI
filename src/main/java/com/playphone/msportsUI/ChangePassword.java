package com.playphone.msportsUI;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.playphone.msportsUI.pages.HomePage;
import com.playphone.msportsUI.pages.SignupPage;
import com.playphone.msportsUI.pages.UserProfilePage;

import org.testng.annotations.BeforeMethod;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChangePassword {
	static WebDriver driver;
	HomePage homePageElements;
	SignupPage signupPageElements;
	UserProfilePage userProfileElements;

	@BeforeMethod(alwaysRun = true)

	public void ti() throws MalformedURLException {
		// String hubURL = "http://172.16.1.118:6577/wd/hub";
		DesiredCapabilities capability = DesiredCapabilities.firefox();
		driver = new RemoteWebDriver(new URL("http://172.16.1.179:5555/wd/hub"), capability);
		driver.get("http://tournaments.olympus-stage.playphone.cc/");
		homePageElements = new HomePage(driver);
		signupPageElements = new SignupPage(driver);
		userProfileElements = new UserProfilePage(driver);

	}

	@Test
	public void NewAccountSignup() throws InterruptedException {
		
		Thread.sleep(5000);
		homePageElements.clickSkip();
		Thread.sleep(27000);
		homePageElements.clickFloaterSignUp();
		Thread.sleep(15000);
		homePageElements.clickSkip();
		Thread.sleep(15000);
		signupPageElements.clickSignupWithEmail();
		Thread.sleep(15000);
		
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(10000);
		signupPageElements.enterSignupEmailInput("msportsTestUser" + randomInt + "@gmail.com");
		signupPageElements.enterSignupPasswordInput("test1234");
		Thread.sleep(15000);
		signupPageElements.clickCreateAccountButton();
		Thread.sleep(25000);
		homePageElements.clickSkip();
		Thread.sleep(15000);
		homePageElements.clickSkip();
		Thread.sleep(15000);
		homePageElements.clickNavBarUserAvatar();
		Thread.sleep(15000);
		userProfileElements.clickChangePassword();
		Thread.sleep(5000);
		/*userProfileElements.enterCurrentPassword("test1234");
		Thread.sleep(5000);
		userProfileElements.enterNewPassword("test12345");
		Thread.sleep(5000);
		userProfileElements.enterConfirmPassword("test12345");
		Thread.sleep(5000);
		userProfileElements.clickSaveButton();
		Thread.sleep(5000);*/
	

	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() throws Exception {
		driver.quit();

	}

}
