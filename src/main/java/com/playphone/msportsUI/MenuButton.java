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

public class MenuButton {
	static WebDriver driver;
	  private String baseUrl;
	 

	  @BeforeMethod

		  public void ti () throws MalformedURLException {
				//String hubURL = "http://172.16.1.118:6577/wd/hub";
				DesiredCapabilities capability = DesiredCapabilities.firefox();
				driver = new RemoteWebDriver(new URL("http://172.16.1.118:6577/wd/hub"), capability);
				driver.get("http://tournaments.olympus-stage.playphone.cc/");
				
		//WebDriver driver;  
		//System.setProperty("webdriver.gecko.driver", "/Users/siddharth/Documents/workspace/geckodriver");
	    //driver = new FirefoxDriver();
	    //baseUrl = "http://tournaments.olympus01.playphone.cc/";
	    //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void test () throws MalformedURLException {
		    driver.get(baseUrl + "/#/");
		    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		    //Thread.sleep(3000);
		    /*driver.findElement(By.xpath("//button[@type='button']")).click();
		    //Thread.sleep(3000);
		    driver.findElement(By.xpath("//span[@data-pp-auto-id='login-with-google'][contains(text(),'Log in with Email')]")).click();
		    //(".//*[@id='play-now-button-1']")).click();
		    driver.findElement(By.name("email")).clear();
		    //Thread.sleep(3000);
		    driver.findElement(By.name("email")).sendKeys("svm099@hotmail.com");
		    //Thread.sleep(3000);
		    driver.findElement(By.name("password")).clear();
		    //Thread.sleep(3000);
		    driver.findElement(By.name("password")).sendKeys("test1234");
		    //Thread.sleep(3000);
		    driver.findElement(By.xpath("//button[@type='submit']")).click();
		    //Thread.sleep(3000);*/
	  }

	  @AfterMethod
	public void tearDown() throws MalformedURLException {
		  //Thread.sleep(4000);
	    driver.quit();
	    
	    }
	  }



