package com.playphone.msportsUI;

import org.testng.annotations.AfterClass;
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


public class AccountSignup {
  static WebDriver driver;
  private String baseUrl;
 

  @BeforeMethod(alwaysRun = true)

	  public void ti () throws MalformedURLException {
			//String hubURL = "http://172.16.1.118:6577/wd/hub";
			DesiredCapabilities capability = DesiredCapabilities.firefox();
			driver = new RemoteWebDriver(new URL("http://192.168.0.115:6577/wd/hub"), capability);
			driver.get("http://tournaments.olympus-stage.playphone.cc/#/");
			

  }

  @Test
	public void NewAccountSignup () throws MalformedURLException {
	  	new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//button[@type='button'])[3]")));
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//button[@type='button'])[2]")));
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@id='account']/ng-component/div/div/div[6]/div/span[2]")));
		driver.findElement(By.xpath("//div[@id='account']/ng-component/div/div/div[6]/div/span[2]")).click();
		//new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//span[@data-pp-auto-id='sign-with-email'][contains(text(), 'Sign up with Email')]")));
		//driver.findElement(By.xpath("//span[@data-pp-auto-id='sign-with-email'][contains(text(), 'Sign up with Email')]")).sendKeys(Keys.ENTER);;
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//button[@type='button'])[3]")));
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//button[@type='button'])[2]")));
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		// Thread.sleep(3000);
		
		 driver.findElement(By.name("email")).clear();  
		 driver.findElement(By.name("email")).sendKeys("ppsvm100@hotmail.com");
		driver.findElement(By.name("password")).clear();
		 
		 driver.findElement(By.name("password")).sendKeys("test1234");
		  
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		  
		 driver.findElement(By.xpath("//div[@id='auth']/div/div/button")).click();  
		 
	}

  /*
	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		driver.quit();

	}*/
	
}


