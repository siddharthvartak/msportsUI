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


public class AccountSignUpWithGoogle {
  static WebDriver driver;
   
 

  @BeforeMethod(alwaysRun = true)

	  public void ti () throws MalformedURLException {
			//String hubURL = "http://172.16.1.118:6577/wd/hub";
			DesiredCapabilities capability = DesiredCapabilities.firefox();
			driver = new RemoteWebDriver(new URL("http://172.16.1.68:4444/wd/hub"), capability);
			driver.get("https://tournaments.o01.dev.playphone.cc/#/");
			

  }

  @Test
	public void NewAccountSignup () throws MalformedURLException {
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
	  	new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//button[@type='button'])[3]")));
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		try {
	          Thread.sleep(3000);
	      } catch (InterruptedException e) {
	          e.printStackTrace();
	      }
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//button[@type='button'])[2]")));
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		try {
	          Thread.sleep(3000);
	      } catch (InterruptedException e) {
	          e.printStackTrace();
	      }
		//new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@id='account']/ng-component/div/div/div[6]/div/span[2]")));
		//driver.findElement(By.xpath("//div[@id='account']/ng-component/div/div/div[6]/div/span[2]")).click();
		
		//Find Sign up with email element
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@data-pp-auto-id='sign-with-google']")));
		driver.findElement(By.xpath("//span[@data-pp-auto-id='sign-with-google']")).click();		
		 try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		 
		 
		 driver.findElement(By.xpath(".//*[@id='Email']")).clear();
		 driver.findElement(By.xpath(".//*[@id='Email']")).click();
		// driver.findElement(By.name("email")).clear(); 
		// driver.findElement(By.name("email")).click();
		 //Randomly generate email IDs
		/* Random randomGenerator = new Random();  
		    int randomInt = randomGenerator.nextInt(10000); 
		   
		    driver.findElement(By.name("email")).sendKeys("msportsTestUser"+ randomInt +"@gmail.com");
		    try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }*/
		 
		 
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("testuser3076@gmail.com");
		try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		 driver.findElement(By.xpath(".//*[@id='next']")).click();
		 try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		
		driver.findElement(By.xpath(".//*[@id='Passwd']")).clear();
		 driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("mikimiki");
		 
		//driver.findElement(By.name("password")).clear(); 
		// driver.findElement(By.name("password")).sendKeys("test1234");  
		 driver.findElement(By.xpath(".//*[@id='signIn']")).click();
		 try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		 new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-pp-auto-id='skip']")));
		    driver.findElement(By.xpath("//div[@data-pp-auto-id='skip']")).click();
		   
		    new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-pp-auto-id='skip-for-now']")));
		    driver.findElement(By.xpath("//div[@data-pp-auto-id='skip-for-now']")).click();
		    try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		 //driver.findElement(By.xpath("//div[@id='auth']/div/div/button")).click();
		 new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@data-pp-auto-id='floater-menu-button']")));
		//Find menu button
		 driver.findElement(By.xpath("//button[@data-pp-auto-id='floater-menu-button']")).click();
		 if(driver.findElements(By.xpath("//button[@data-pp-auto-id='floater-menu-button']")).size() != 0){
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



