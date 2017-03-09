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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageSupportCommunity {
	static WebDriver driver;
	// private String baseUrl;

	@BeforeMethod(alwaysRun = true)

		  public void ti () throws MalformedURLException {
				//String hubURL = "http://172.16.1.118:6577/wd/hub";
				DesiredCapabilities capability = DesiredCapabilities.firefox();
				driver = new RemoteWebDriver(new URL("http://172.16.1.68:4444/wd/hub"), capability);
				driver.get("https://tournaments.o01.dev.playphone.cc/#/");
	}


	@Test
	  public void SupportCommunity () throws MalformedURLException {
		  
		  // driver.get(baseUrl + "/#/");
		  try {
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
		        
		        }
		      }



