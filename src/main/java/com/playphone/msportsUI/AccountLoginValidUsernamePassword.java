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

public class AccountLoginValidUsernamePassword {
  static WebDriver driver;
  private String baseUrl;
 

  @BeforeMethod(alwaysRun = true)

	  public void ti () throws MalformedURLException {
			//String hubURL = "http://172.16.1.118:6577/wd/hub";
			DesiredCapabilities capability = DesiredCapabilities.firefox();
			driver = new RemoteWebDriver(new URL("http://192.168.0.115:6577/wd/hub"), capability);
			driver.get("http://tournaments.olympus-stage.playphone.cc/#/");
			
	//WebDriver driver;  
	//System.setProperty("webdriver.gecko.driver", "/Users/siddharth/Documents/workspace/geckodriver");
    //driver = new FirefoxDriver();
    //baseUrl = "http://tournaments.olympus01.playphone.cc/";
    //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void TestValidLogin () throws MalformedURLException {
	  
	  // driver.get(baseUrl + "/#/");
	  
	    new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//button[@type='button'])[3]")));
	    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
	    new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='button']")));
		driver.findElement(By.xpath("//button[@type='button']")).click();
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@data-pp-auto-id='login-with-google'][contains(text(),'Log in with Email')]")));
	    driver.findElement(By.xpath("//span[@data-pp-auto-id='login-with-google'][contains(text(),'Log in with Email')]")).click();
	    //(".//*[@id='play-now-button-1']")).click();
	    new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(By.name("email")));
	    driver.findElement(By.name("email")).clear();
	    driver.findElement(By.name("email")).sendKeys("ppsvm10@hotmail.com");
	    new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
	    driver.findElement(By.name("password")).clear();
	    //Thread.sleep(3000);
	    new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
	    driver.findElement(By.name("password")).sendKeys("test1234");	     
	    new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit']")));
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
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



