package com.playphone.msportsUI;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
 

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import com.playphone.msportsUI.pages.HomePage;

public class AccountLogout {
  static WebDriver driver;
  HomePage homePageElements;
 

  @BeforeMethod(alwaysRun = true)

	  public void ti () throws MalformedURLException {
			//String hubURL = "http://172.16.1.118:6577/wd/hub";
			DesiredCapabilities capability = DesiredCapabilities.firefox();
			driver = new RemoteWebDriver(new URL("http://172.16.1.179:5555/wd/hub"), capability);
			driver.get("https://tournaments.msports.games");
			homePageElements = new HomePage(driver);
			
  }

  @Test
  public void TestValidLogin () throws InterruptedException {
	  
	    Thread.sleep(5000);
		homePageElements.clickSkip();
		Thread.sleep(27000);
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
		Thread.sleep(3000);
		homePageElements.clickOuterMenuButton();
		Thread.sleep(3000);
		homePageElements.clickThreeDotsMenu();
		Thread.sleep(3000);
		homePageElements.clickIconMsportsLogout();
		
		if(driver.findElements(By.xpath("//button[@data-pp-auto-id='play-now-button-0']")).size() != 0){
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



