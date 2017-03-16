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

public class LoginClickPlayNow {
	static WebDriver driver;
	 // private String baseUrl;
	 

	  @BeforeMethod(alwaysRun = true)

		  public void ti () throws MalformedURLException {
				//String hubURL = "http://172.16.1.118:6577/wd/hub";
				DesiredCapabilities capability = DesiredCapabilities.firefox();
				driver = new RemoteWebDriver(new URL("http://192.168.0.108:5555/wd/hub"), capability);
				driver.get("https://tournaments.o01.dev.playphone.cc/#/");
				
		//WebDriver driver;  
		//System.setProperty("webdriver.gecko.driver", "/Users/siddharth/Documents/workspace/geckodriver");
	    //driver = new FirefoxDriver();
	    //baseUrl = "http://tournaments.olympus01.playphone.cc/";
	    //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void loginclickPlaynow () throws MalformedURLException {
		  
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
		    new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//button[@type='button'])[3]")));
		    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		    try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		    new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@data-pp-auto-id='Login']")));
			driver.findElement(By.xpath("//button[@data-pp-auto-id='Login']")).click();
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
		    new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(By.name("email")));
		    driver.findElement(By.name("email")).clear();
		    
		    driver.findElement(By.name("email")).sendKeys("randomuser321@hotmail.com");
		    new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
		    driver.findElement(By.name("password")).clear();
		    //Thread.sleep(3000);
		    new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
		    driver.findElement(By.name("password")).sendKeys("test1234");	     
		    new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit']")));
		    driver.findElement(By.xpath("//button[@type='submit']")).click();
		    /*try {
	            Thread.sleep(4000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		    
		    new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-pp-auto-id='skip']")));
		    driver.findElement(By.xpath("//div[@data-pp-auto-id='skip']")).click();*/
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
			    driver.findElement(By.xpath(".//button[@data-pp-auto-id='play-now-button-0']")).sendKeys(Keys.ENTER);
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
			    /*new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@class='proxy']")));
			    driver.switchTo().frame(driver.findElement(By.className("proxy")));
			    
			    try {
		            Thread.sleep(6000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }*/
			    driver.navigate().back();
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
			    /*new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-pp-auto-id='icon-sdk-ui']")));
			    driver.findElement(By.xpath("//div[@data-pp-auto-id='icon-sdk-ui']")).click();
			    try {
		            Thread.sleep(3000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }*/
			    
			    
			    
			    /*//Modified
			    if( driver.findElement(By.xpath("//div[contains(@class, 'more-info-button')][@data-pp-auto-id='FAQ']")).isDisplayed()){
			    	System.out.println("Element is Visible");
			    	}else{
			    	System.out.println("Element is InVisible");
			    	}*/
			    	 

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


