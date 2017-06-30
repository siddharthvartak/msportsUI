package com.playphone.msportsUI;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
 

import java.net.MalformedURLException;
import java.net.URL;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.playphone.msportsUI.pages.HomePage;

public class AccountLoginValidUsernamePassword {
	static WebDriver driver;
	 HomePage homePageElements;
 

  @BeforeMethod(alwaysRun = true)

	  public void ti () throws MalformedURLException {
			
			DesiredCapabilities capability = DesiredCapabilities.firefox();
			driver = new RemoteWebDriver(new URL("http://172.16.1.179:5555/wd/hub"), capability);
			driver.get("https://tournaments.msports.games");
			homePageElements = new HomePage(driver);
  }

  @Test
  public void TestValidLogin () throws InterruptedException {
	    Thread.sleep(5000);
		homePageElements.clickSkip();
		Thread.sleep(20000);
		homePageElements.clickLoginButton();
		Thread.sleep(20000);
		homePageElements.emailLogin();
		Thread.sleep(3000);
		homePageElements.enterEmail("randomuser321@hotmail.com");
		Thread.sleep(3000);
		homePageElements.enterPassword("test1234");
		homePageElements.submitClick();
		Thread.sleep(12000);
		homePageElements.clickSkip();
		Thread.sleep(3000);
		homePageElements.clickSkip();
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class, 'home-header-title') and contains(@class ,'home-header-title')]")));
		   // Boolean isPresent = driver.findElements(By.id("submit-error-message")).size() > 0;
		    if(driver.findElements(By.xpath("//div[contains(@class, 'home-header-title') and contains(@class ,'home-header-title')]")).size() != 0){
		    	System.out.println("Element is Present");
		    	}else{
		    	System.out.println("Element is Absent");
		    	}
		
  }
  

  


@AfterMethod(alwaysRun = true)
public void tearDown() throws MalformedURLException {
	  //Thread.sleep(4000);
    driver.quit();
    
    }
  }



