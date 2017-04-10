package com.playphone.msportsUI;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteAccount {
	
	static WebDriver driver;
	 // private String baseUrl;
	 

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
			//new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@id='account']/ng-component/div/div/div[6]/div/span[2]")));
			//driver.findElement(By.xpath("//div[@id='account']/ng-component/div/div/div[6]/div/span[2]")).click();
			
			//Find Sign up with email element
			new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-pp-auto-id='sign-with-email']")));
			driver.findElement(By.xpath("//div[@data-pp-auto-id='sign-with-email']")).click();		
			try {
	            Thread.sleep(6000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

			 driver.findElement(By.xpath("//input[@data-pp-auto-id='sign-up-email-input']")).clear();  
			 //driver.findElement(By.name("email")).sendKeys("ppsvm24@hotmail.com");
			 try {
		            Thread.sleep(1000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
			 
			 driver.findElement(By.xpath("//input[@data-pp-auto-id='sign-up-email-input']")).clear(); 
			 driver.findElement(By.xpath("//input[@data-pp-auto-id='sign-up-email-input']")).click();
			 try {
		            Thread.sleep(6000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
			 //Randomly generate email IDs
			 Random randomGenerator = new Random();  
			    int randomInt = randomGenerator.nextInt(10000); 
			   
			    driver.findElement(By.xpath("//input[@data-pp-auto-id='sign-up-email-input']")).sendKeys("msportsTestUser"+ randomInt +"@gmail.com");
			    try {
		            Thread.sleep(6000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
			 
			 
			// driver.findElement(By.name("email")).sendKeys("ppsvm19@hotmail.com");

			driver.findElement(By.xpath("//input[@data-pp-auto-id='sign-up-password-input']")).clear(); 
			 driver.findElement(By.xpath("//input[@data-pp-auto-id='sign-up-password-input']")).sendKeys("test1234"); 
			 try {
		            Thread.sleep(3000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
			 driver.findElement(By.xpath("//button[@data-pp-auto-id='create-account-button']")).click();
			 try {
		            Thread.sleep(10000);
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
			    new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@data-pp-auto-id='nav-bar-user-avatar']")));
			    driver.findElement(By.xpath("//a[@data-pp-auto-id='nav-bar-user-avatar']")).click();
			    try {
		            Thread.sleep(4000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
			    new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@data-pp-auto-id='msports-delete-icon']")));
			    driver.findElement(By.xpath("//a[@data-pp-auto-id='msports-delete-icon']")).click();
			    try {
		            Thread.sleep(4000);
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
			    driver.findElement(By.xpath("//input[@data-pp-auto-id='password-input-field']")).clear(); 
				driver.findElement(By.xpath("//input[@data-pp-auto-id='password-input-field']")).sendKeys("test1234"); 
				 try {
			            Thread.sleep(3000);
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }
				 new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@data-pp-auto-id='delete-green-button']")));
				    driver.findElement(By.xpath("//button[@data-pp-auto-id='delete-green-button']")).click();
				    try {
			            Thread.sleep(4000);
			        } catch (InterruptedException e) {
			            e.printStackTrace();
			        }
			    
	  }
			    
			    @AfterMethod(alwaysRun = true)
				public void tearDown() throws Exception {
					driver.quit();

				}
				
			}

