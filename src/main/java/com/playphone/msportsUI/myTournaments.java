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

public class myTournaments {
	static WebDriver driver;
	HomePage homePageElements;
	IframePage iframePageElements;
	 

	  @BeforeMethod(alwaysRun = true)

		  public void ti () throws MalformedURLException {
				//String hubURL = "http://172.16.1.118:6577/wd/hub";
				DesiredCapabilities capability = DesiredCapabilities.firefox();
				driver = new RemoteWebDriver(new URL("http://172.16.1.179:5555/wd/hub"), capability);
				driver.get("https://tournaments.msports.games/#/");
				driver.manage().window().maximize();
				homePageElements = new HomePage(driver);
				iframePageElements = new IframePage(driver);

	  }

	  @Test
	  public void TestValidLogin () throws InterruptedException {
		  
		  Thread.sleep(5000);
			homePageElements.clickSkip();
			Thread.sleep(25000);
			homePageElements.clickLoginButton();
			Thread.sleep(20000);
			homePageElements.emailLogin();
			Thread.sleep(3000);
			homePageElements.enterEmail("randomuser321@hotmail.com");
			Thread.sleep(3000);
			homePageElements.enterPassword("test1234");
			Thread.sleep(15000);
			homePageElements.submitClick();
			Thread.sleep(22000);
			homePageElements.clickSkip();
			Thread.sleep(3000);
			homePageElements.clickSkip();
			Thread.sleep(10000);
			homePageElements.clickPlayNow1();
			Thread.sleep(20000);
			new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@class='sdk-app']")));
		    driver.switchTo().frame(driver.findElement(By.className("sdk-app")));
		    Thread.sleep(10000);
		    iframePageElements.clickInnerMenuButton();
		    Thread.sleep(10000);
		    iframePageElements.clickmyTournaments();
		    Thread.sleep(10000);
		    iframePageElements.clickmsportsCloseIcon();
		    
		  
	  }
	  
	@AfterMethod(alwaysRun = true)
	public void tearDown() throws MalformedURLException {
		  //Thread.sleep(4000);
	    driver.quit();
	    
	    }
	  }

