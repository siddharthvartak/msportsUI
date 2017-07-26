package com.playphone.msportsUI;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.playphone.msportsUI.pages.HomePage;
import com.playphone.msportsUI.pages.IframePage;

import org.testng.annotations.BeforeMethod;
 

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class playTournamentMsportsClose {
	static WebDriver driver;
	  HomePage homePageElements;
	  IframePage iframePageElements;
	  
	 

	  @BeforeMethod(alwaysRun = true)

		  public void ti () throws MalformedURLException {
				DesiredCapabilities capability = DesiredCapabilities.firefox();
				driver = new RemoteWebDriver(new URL("http://172.16.1.179:5555/wd/hub"), capability);
				driver.get("https://tournaments.msports.games");
				homePageElements = new HomePage(driver);
				iframePageElements = new IframePage(driver);
				
	  }

	  @Test
		public void ClickPlayNowButton0 () throws InterruptedException {
		  
		  Thread.sleep(10000);
		  homePageElements.clickSkip();
		  Thread.sleep(27000);
		  homePageElements.clickPlayNow12();
		  Thread.sleep(27000);
		  new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@class='sdk-app']")));
		    driver.switchTo().frame(driver.findElement(By.className("sdk-app")));
		  homePageElements.clickSkip();
		  Thread.sleep(26000);
		  iframePageElements.clickmsportsCloseIcon();
		  
//		  Thread.sleep(4000);
//		  driver.navigate().back();
	  }
		  
		    
		
	 	@AfterMethod(alwaysRun = true)
	 	public void tearDown() throws Exception {
	 		driver.quit();

	 	}
	 	
	 }


