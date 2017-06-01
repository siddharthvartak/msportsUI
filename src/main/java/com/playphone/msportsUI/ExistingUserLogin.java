package com.playphone.msportsUI;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

//import java.io.InterruptedIOException;
import java.net.MalformedURLException;
import java.net.URL;
//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import com.playphone.msportsUI.pages.HomePage;


public class ExistingUserLogin {
	static WebDriver driver;
    HomePage homePageElements;
	 
	  @BeforeMethod(alwaysRun = true)

		  public void ti () throws MalformedURLException {
				//String hubURL = "http://172.16.1.118:6577/wd/hub";
				DesiredCapabilities capability = DesiredCapabilities.firefox();
				driver = new RemoteWebDriver(new URL("http://172.16.1.68:5555/wd/hub"), capability);
				driver.get("https://tournaments.olympus-stage.playphone.cc/#/");
				//driver.manage().window().maximize();
				homePageElements = new HomePage(driver); 
				
	  }
@Test
public void test() throws InterruptedException {
	Thread.sleep(5000);
	homePageElements.clickSkip();
	Thread.sleep(3000);
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
	
}


@AfterMethod(alwaysRun = true)
public void tearDown() throws MalformedURLException {
	  
    driver.quit();
}
}