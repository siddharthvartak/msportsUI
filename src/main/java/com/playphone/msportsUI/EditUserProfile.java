package com.playphone.msportsUI;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.playphone.msportsUI.pages.HomePage;
import com.playphone.msportsUI.pages.SdkMenuDrawer;
import com.playphone.msportsUI.pages.SignupPage;
import com.playphone.msportsUI.pages.UserProfilePage;

import org.testng.annotations.BeforeMethod;
 

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class EditUserProfile {
	
	static WebDriver driver;
	HomePage homePageElements;
	SignupPage signupPageElements;
	SdkMenuDrawer sdkMenuDrawerElements;
	UserProfilePage userProfilePageElements;
	 

	  @BeforeMethod(alwaysRun = true)

		  public void ti () throws MalformedURLException {
		  DesiredCapabilities capability = DesiredCapabilities.firefox();
			driver = new RemoteWebDriver(new URL("http://172.16.1.179:5555/wd/hub"), capability);
			driver.get("https://tournaments.olympus-stage.playphone.cc/");
			driver.manage().window().maximize();
			homePageElements = new HomePage(driver);
			signupPageElements = new SignupPage(driver);
			sdkMenuDrawerElements = new SdkMenuDrawer(driver);
			userProfilePageElements = new UserProfilePage(driver);
				
	  }

	  @Test
	  public void TestValidLogin () throws InterruptedException {
		  
		  Thread.sleep(5000);
		  homePageElements.clickSkip();
		  Thread.sleep(25000);
		  homePageElements.clickFloaterSignUp();
		  Thread.sleep(5000);
		  homePageElements.clickSkip();
		  Thread.sleep(15000);
		  signupPageElements.clickSignupWithEmail();
		  Thread.sleep(10000);
		  Random randomGenerator = new Random();  
		    int randomInt = randomGenerator.nextInt(10000);
		    driver.findElement(By.xpath("//input[@data-pp-auto-id='sign-up-email-input']")).sendKeys("msportsTestUser"+ randomInt +"@gmail.com");
		  Thread.sleep(3000);
		  signupPageElements.enterSignupPasswordInput("test1234");
		  Thread.sleep(5000);
		  signupPageElements.clickCreateAccountButton();
		  Thread.sleep(20000);
		  homePageElements.clickSkip();
		  Thread.sleep(15000);
		  homePageElements.clickSkip();
		  Thread.sleep(15000);
		  homePageElements.clickNavBarUserAvatar();
		  Thread.sleep(15000);
		  /*userProfilePageElements.enterFirstName("Test account");
		  Thread.sleep(5000);
		  userProfilePageElements.enterUserName("PlayPhoneTest");
		  Thread.sleep(5000);*/
		  /*JavascriptExecutor jse = (JavascriptExecutor) driver;
		  jse.executeScript("window.scrollBy(0,250)", "");
		  userProfilePageElements.msportsLogoutIcon();
		  Thread.sleep(3000);*/
		  
		  /*try {
	          Thread.sleep(3000);
	      } catch (InterruptedException e) {
	          e.printStackTrace();
	      }
		    new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-pp-auto-id='skip']")));
		    driver.findElement(By.xpath("//div[@data-pp-auto-id='skip']")).click();
		    try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		    new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@data-pp-auto-id='floater-login-button']")));
		    driver.findElement(By.xpath("//button[@data-pp-auto-id='floater-login-button']")).click();
		    try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		    
			new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@data-pp-auto-id='login-with-google'][contains(text(),'Log in with Email')]")));
		    driver.findElement(By.xpath("//span[@data-pp-auto-id='login-with-google'][contains(text(),'Log in with Email')]")).click();
		    try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		    //(".//*[@id='play-now-button-1']")).click();
		    new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@data-pp-auto-id='email-input-field']")));
		    driver.findElement(By.xpath("//input[@data-pp-auto-id='email-input-field']")).clear();
		    driver.findElement(By.xpath("//input[@data-pp-auto-id='email-input-field']")).sendKeys("randomuser321@hotmail.com");
		    new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@data-pp-auto-id='pw-input-field']")));
		    driver.findElement(By.xpath("//input[@data-pp-auto-id='pw-input-field']")).clear();
		    //Thread.sleep(3000);
		    new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@data-pp-auto-id='pw-input-field']")));
		    driver.findElement(By.xpath("//input[@data-pp-auto-id='pw-input-field']")).sendKeys("test1234");	     
		    new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@data-pp-auto-id='login-with-email']")));
		    driver.findElement(By.xpath("//button[@data-pp-auto-id='login-with-email']")).click();
		    try {
	            Thread.sleep(4000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		    
//		    new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-pp-auto-id='skip']")));
//		    driver.findElement(By.xpath("//div[@data-pp-auto-id='skip']")).click();
		    new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@data-pp-auto-id='nav-bar-user-avatar']")));
		    driver.findElement(By.xpath("//a[@data-pp-auto-id='nav-bar-user-avatar']")).click();
		    try {
	            Thread.sleep(4000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		    new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@data-pp-auto-id='enter-full-name']")));
		    driver.findElement(By.xpath("//input[@data-pp-auto-id='enter-full-name']")).clear();
		    driver.findElement(By.xpath("//input[@data-pp-auto-id='enter-full-name']")).sendKeys("Test User");
		    try {
	            Thread.sleep(4000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		    new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@data-pp-auto-id='enter-user-name']")));
		    driver.findElement(By.xpath("//input[@data-pp-auto-id='enter-user-name']")).clear();
		    driver.findElement(By.xpath("//input[@data-pp-auto-id='enter-user-name']")).sendKeys("Test User PlayPhone");*/
		   
		   
	  
	  
	  }
	  

	  


	@AfterMethod(alwaysRun = true)
	public void tearDown() throws MalformedURLException {
		  //Thread.sleep(4000);
	    driver.quit();
	    
	    }
	  }


