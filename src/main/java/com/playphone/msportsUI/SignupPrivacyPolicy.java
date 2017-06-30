package com.playphone.msportsUI;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.playphone.msportsUI.pages.HomePage;
import com.playphone.msportsUI.pages.SignupPage;

import org.testng.annotations.BeforeMethod;
import java.net.MalformedURLException;
import java.net.URL;
//import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupPrivacyPolicy {
	static WebDriver driver;
	HomePage homePageElements;
	SignupPage signupPageElements;
	 

	  @BeforeMethod(alwaysRun = true)

		  public void ti () throws MalformedURLException {
				
				DesiredCapabilities capability = DesiredCapabilities.firefox();
				driver = new RemoteWebDriver(new URL("http://172.16.1.179:5555/wd/hub"), capability);
				driver.get("https://tournaments.olympus-stage.playphone.cc/#/");
				homePageElements = new HomePage(driver);
				signupPageElements = new SignupPage(driver);
				

	  }

	  @Test
		public void PrivacyPolicy () throws InterruptedException {
		  
		  Thread.sleep(5000);
		  homePageElements.clickSkip();
		  Thread.sleep(20000);
		  homePageElements.clickFloaterSignUp();
		  Thread.sleep(3000);
		  homePageElements.clickSkip();
		  Thread.sleep(12000);
		  signupPageElements.clickPrivacyPolicy();
		  

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
		    new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//button[@data-pp-auto-id='floater-signup-button'])")));
			driver.findElement(By.xpath("(//button[@data-pp-auto-id='floater-signup-button'])")).click();
			try {
	            Thread.sleep(6000);
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
		    new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-pp-auto-id='privacypolicy']")));
		    driver.findElement(By.xpath("//div[@data-pp-auto-id='privacypolicy']")).click();
		    try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		    driver.navigate().back();
		    new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-pp-auto-id='skip']")));
		    driver.findElement(By.xpath("//div[@data-pp-auto-id='skip']")).click();
		    try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }*/
		    
		 

}
	  @AfterMethod(alwaysRun = true)
		public void tearDown() throws Exception {
			driver.quit();

		}
		
	}
