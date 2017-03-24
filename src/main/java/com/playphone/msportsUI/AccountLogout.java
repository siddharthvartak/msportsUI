package com.playphone.msportsUI;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
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

public class AccountLogout {
  static WebDriver driver;
  //private String baseUrl;
 

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
  public void TestValidLogin () throws MalformedURLException {
	  
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
	    //Click on Skip and Skip now
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
	    //new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-pp-auto-id='skip-for-now']")));
	    //driver.findElement(By.xpath("//div[@data-pp-auto-id='skip-for-now']")).click();
	     
	    
	    //try {
            //Thread.sleep(3000);
        //} catch (InterruptedException e) {
           // e.printStackTrace();
       // }
	    ////div[@data-pp-auto-id='skip-for-now']
	    
	    new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-pp-auto-id='outer-menu-button']")));
	   // Boolean isPresent = driver.findElements(By.id("submit-error-message")).size() > 0;
	    driver.findElement(By.xpath("//div[@data-pp-auto-id='outer-menu-button']")).click();
	    try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	    
	    driver.findElement(By.xpath("//i[@data-pp-auto-id='3-dots-menu']")).click();
	    try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	    
	    
	    new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@data-pp-auto-id='icon-msports-logout']")));
	    driver.findElement(By.xpath("//a[@data-pp-auto-id='icon-msports-logout']")).click();
	    try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	  //  driver.findElement(By.xpath("//button[@data-pp-auto-id='play-now-button-0']")).click();
	   
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



