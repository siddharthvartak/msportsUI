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

public class forgotpasswordloginpage {
	static WebDriver driver;
	 // private String baseUrl;
	 

	  @BeforeMethod(alwaysRun = true)

		  public void ti () throws MalformedURLException {
				//String hubURL = "http://172.16.1.118:6577/wd/hub";
				DesiredCapabilities capability = DesiredCapabilities.firefox();
				driver = new RemoteWebDriver(new URL("http://172.16.1.68:4444/wd/hub"), capability);
				driver.get("https://tournaments.o01.dev.playphone.cc/#/");
				
		//WebDriver driver;  
		//System.setProperty("webdriver.gecko.driver", "/Users/siddharth/Documents/workspace/geckodriver");
	    //driver = new FirefoxDriver();
	    //baseUrl = "http://tournaments.olympus01.playphone.cc/";
	    //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void forgotpassword () throws MalformedURLException {
		  
		  // driver.get(baseUrl + "/#/");
		  try {
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
		    new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//button[@data-pp-auto-id='floater-login-button'])")));
			driver.findElement(By.xpath("(//button[@data-pp-auto-id='floater-login-button'])")).click();
			try {
	            Thread.sleep(6000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		    
			new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@data-pp-auto-id='forgot-password-login-page']")));
			driver.findElement(By.xpath("//a[@data-pp-auto-id='forgot-password-login-page']")).click();
			try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
			driver.findElement(By.xpath("//input[@data-pp-auto-id='email-input-field']")).clear();  
			driver.findElement(By.name("email")).sendKeys("ppsvm20@hotmail.com");
			 try {
		            Thread.sleep(1000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
			 new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@data-pp-auto-id='login-with-email']")));
				driver.findElement(By.xpath("//button[@data-pp-auto-id='login-with-email']")).click();
				try {
		            Thread.sleep(3000);
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