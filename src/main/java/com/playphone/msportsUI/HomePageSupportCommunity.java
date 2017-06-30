package com.playphone.msportsUI;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.playphone.msportsUI.pages.HomePage;
import com.playphone.msportsUI.pages.SdkMenuDrawer;
import com.playphone.msportsUI.pages.SupportPage;

import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageSupportCommunity {
	static WebDriver driver;
	HomePage homePageElements;
	SupportPage supportPageElements;
	SdkMenuDrawer sdkMenuDrawerElements;

	@BeforeMethod(alwaysRun = true)

		  public void ti () throws MalformedURLException {
				
				DesiredCapabilities capability = DesiredCapabilities.firefox();
				driver = new RemoteWebDriver(new URL("http://172.16.1.179:5555/wd/hub"), capability);
				driver.get("http://tournaments.olympus-stage.playphone.cc/");
				driver.manage().window().maximize();
				homePageElements = new HomePage(driver);
				supportPageElements = new SupportPage(driver);
				sdkMenuDrawerElements = new SdkMenuDrawer(driver);
	}


	@Test
	  public void SupportCommunity () throws InterruptedException {
		
		Thread.sleep(5000);
		homePageElements.clickSkip();
		Thread.sleep(25000);
		homePageElements.clickOuterMenuButton();
		Thread.sleep(15000);
		sdkMenuDrawerElements.clickSupport();
		Thread.sleep(10000);
		supportPageElements.clickGotoCommunity();
		
	}
		  
		  /*try {
	          Thread.sleep(3000);
	      } catch (InterruptedException e) {
	          e.printStackTrace();
	      }
		    new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-pp-auto-id='skip']")));
		    driver.findElement(By.xpath("//div[@data-pp-auto-id='skip']")).click();
		    try {
	            Thread.sleep(6000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		    new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[@data-pp-auto-id='gotoSupportsPage'])")));
		    driver.findElement(By.xpath("(//a[@data-pp-auto-id='gotoSupportsPage'])")).click();
		    try {
	            Thread.sleep(6000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		    new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@data-pp-auto-id='gotoCommunity'])")));
		    driver.findElement(By.xpath("(//div[@data-pp-auto-id='gotoCommunity'])")).click();
		    try {
	            Thread.sleep(6000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	}
		    @AfterMethod(alwaysRun = true)
		    public void tearDown() throws MalformedURLException {
		    	  //Thread.sleep(4000);
		        driver.quit();
		        
		        }*/
		      

@AfterMethod(alwaysRun = true)
public void tearDown() throws MalformedURLException {
	  //Thread.sleep(4000);
    driver.quit();
    
    }
  }



