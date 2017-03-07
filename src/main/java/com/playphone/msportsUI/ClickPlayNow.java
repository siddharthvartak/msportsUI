package com.playphone.msportsUI;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ClickPlayNow {
  static WebDriver driver;
  private String baseUrl;
 

  @BeforeMethod(alwaysRun = true)

	  public void ti () throws MalformedURLException {
			//String hubURL = "http://172.16.1.118:6577/wd/hub";
			DesiredCapabilities capability = DesiredCapabilities.firefox();
			driver = new RemoteWebDriver(new URL("http://172.16.1.68:4444/wd/hub"), capability);
			driver.get("http://tournaments.olympus-stage.playphone.cc/#/");
			

  }
  
  @Test
 	public void PlayNowButtonClick () throws MalformedURLException {
 	  	//new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//button[@type='button'])[3]")));
 	  	//driver.get(baseUrl + "/#/?theme=basic");
	    driver.findElement(By.xpath(".//button[@data-pp-auto-id='play-now-button-2']")).sendKeys(Keys.ENTER);
	   // new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//img[contains(@src, 'http://sdk.olympus-stage.playphone.cc/dist/assets/msports-logo-not-text@3x.png')]")));
	   // driver.findElement(By.xpath(".//img[contains(@src, 'http://sdk.olympus-stage.playphone.cc/dist/assets/msports-logo-not-text@3x.png')]")).click();
	   //   new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(text(),'Play Now')]")));
	  //button[contains(text(),'Play Now')]
	    
	    //  driver.findElement(By.xpath(".//img[contains(@src, 'http://sdk.olympus-stage.playphone.cc/dist/assets/msports-logo-not-text@3x.png')]")).click();
	   
	    //Find Play now button
 		 if(driver.findElements(By.xpath("//button[contains(text(),'Play Now')]")).size() != 0){
 		    	System.out.println("Element is Present");
 		    	}else{
 		    	System.out.println("Element is Absent");
 		    	}
 		 
 	
 		 
   }

 	@AfterMethod(alwaysRun = true)
 	public void tearDown() throws Exception {
 		driver.quit();

 	}
 	
 }

