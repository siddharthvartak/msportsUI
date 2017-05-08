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


public class AccountSignupNegative {
  static WebDriver driver;
  
 

  @BeforeMethod(alwaysRun = true)

	  public void ti () throws MalformedURLException {
			//String hubURL = "http://172.16.1.118:6577/wd/hub";
			DesiredCapabilities capability = DesiredCapabilities.firefox();
			driver = new RemoteWebDriver(new URL("http://172.16.1.68:4444/wd/hub"), capability);
			driver.get("https://tournaments.o01.dev.playphone.cc/#/");
			

  }

  @Test
	public void SignupNegative () throws MalformedURLException {
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
	    new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//button[@data-pp-auto-id='floater-signup-button'])")));
		driver.findElement(By.xpath("(//button[@data-pp-auto-id='floater-signup-button'])")).click();
		try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-pp-auto-id='skip']")));
	    driver.findElement(By.xpath("//div[@data-pp-auto-id='skip']")).click();
	    try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-pp-auto-id='sign-with-email']")));
		//driver.findElement(By.xpath("//div[@id='account']/ng-component/div/div/div[6]/div/span[2]")).click();
		
		//Find Sign up with email element
		driver.findElement(By.xpath("//div[@data-pp-auto-id='sign-with-email']")).click();	
		try {
	          Thread.sleep(6000);
	      } catch (InterruptedException e) {
	          e.printStackTrace();
	      }
		 driver.findElement(By.xpath("//input[@data-pp-auto-id='sign-up-email-input']")).clear();  
		 driver.findElement(By.xpath("//input[@data-pp-auto-id='sign-up-email-input']")).sendKeys("ppsvm20@hotmail.com");
		 try {
	          Thread.sleep(6000);
	      } catch (InterruptedException e) {
	          e.printStackTrace();
	      }
		driver.findElement(By.xpath("//input[@data-pp-auto-id='sign-up-password-input']")).clear(); 
		 driver.findElement(By.xpath("//input[@data-pp-auto-id='sign-up-password-input']")).sendKeys("test1234");  
		 try {
	          Thread.sleep(6000);
	      } catch (InterruptedException e) {
	          e.printStackTrace();
	      }
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 try {
	          Thread.sleep(6000);
	      } catch (InterruptedException e) {
	          e.printStackTrace();
	      }
		 new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-pp-auto-id='error-message']")));
		 if(driver.findElements(By.xpath("//div[@data-pp-auto-id='error-message']")).size() != 0){
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

