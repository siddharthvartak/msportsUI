package com.playphone.msportsUI;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.playphone.msportsUI.pages.HomePage;
import com.playphone.msportsUI.pages.IframePage;

import org.testng.annotations.BeforeMethod;
 

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginClickPlayNow {
	static WebDriver driver;
	HomePage homePageElements;
	IframePage iframePageElements;
	 

	  @BeforeMethod(alwaysRun = true)

		  public void ti () throws MalformedURLException {
				
				DesiredCapabilities capability = DesiredCapabilities.firefox();
				driver = new RemoteWebDriver(new URL("http://172.16.1.179:5555/wd/hub"), capability);
				driver.get("https://tournaments.olympus-stage.playphone.cc/#/");
				homePageElements = new HomePage(driver);
				iframePageElements = new IframePage(driver);
				
	  }

	  @Test
	  public void loginclickPlaynow () throws InterruptedException {
		  
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
		homePageElements.clickPlayNow2();
		Thread.sleep(15000);
		new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@class='sdk-app']")));
	    driver.switchTo().frame(driver.findElement(By.className("sdk-app")));
		iframePageElements.clickPlayTournament();
		Thread.sleep(10000);
	  }
		
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
		    
		    new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-pp-auto-id='skip']")));
		    driver.findElement(By.xpath("//div[@data-pp-auto-id='skip']")).click();
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
			    new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-pp-auto-id='skip']")));
			    driver.findElement(By.xpath("//div[@data-pp-auto-id='skip']")).click();
			    try {
		            Thread.sleep(3000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
			    new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-pp-auto-id='play-now-button-0']")));
			    driver.findElement(By.xpath("//div[@data-pp-auto-id='play-now-button-0']")).click();
			    try {
		            Thread.sleep(6000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
			    new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@class='sdk-app']")));
			    driver.switchTo().frame(driver.findElement(By.className("sdk-app")));
			    
			    try {
		            Thread.sleep(6000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
			    	
			    new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@data-pp-auto-id='playTournament']")));
			    driver.findElement(By.xpath("//button[@data-pp-auto-id='playTournament']")).click();
			    try {
		            Thread.sleep(3000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
			    new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@class='proxy']")));
			    driver.switchTo().frame(driver.findElement(By.className("proxy")));
			    
			    try {
		            Thread.sleep(6000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
			    driver.navigate().back();
			    try {
		            Thread.sleep(3000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
	  }
			    new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-pp-auto-id='skip']")));
			    driver.findElement(By.xpath("//div[@data-pp-auto-id='skip']")).click();
			    try {
		            Thread.sleep(3000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
			    /*new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-pp-auto-id='icon-sdk-ui']")));
			    driver.findElement(By.xpath("//div[@data-pp-auto-id='icon-sdk-ui']")).click();
			    try {
		            Thread.sleep(3000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
			    
			    
			    
			    //Modified
			    if( driver.findElement(By.xpath("//div[contains(@class, 'more-info-button')][@data-pp-auto-id='FAQ']")).isDisplayed()){
			    	System.out.println("Element is Visible");
			    	}else{
			    	System.out.println("Element is InVisible");
			    	}
			    	 

		  new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class, 'home-header-title') and contains(@class ,'home-header-title')]")));
		  // Boolean isPresent = driver.findElements(By.id("submit-error-message")).size() > 0;
		   if(driver.findElements(By.xpath("//div[contains(@class, 'home-header-title') and contains(@class ,'home-header-title')]")).size() != 0){
		   	System.out.println("Element is Present");
		   	}else{
		   	System.out.println("Element is Absent");
		   	}
		  }*/
		  	    
	  
		    @AfterMethod(alwaysRun = true)
		    public void tearDown() throws MalformedURLException {
		    	  //Thread.sleep(4000);
		        driver.quit();
		        
		        }
		      }


