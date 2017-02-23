package com.playphone.msportsUI;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;

public class TestNGtest {
	private WebDriver driver;
	private WebDriver driver2;
	@BeforeTest
	  public void beforeTest() throws MalformedURLException {
		String hubURL = "http://172.16.1.118:6577/wd/hub";
		DesiredCapabilities capability = DesiredCapabilities.firefox();
		WebDriver driver = new RemoteWebDriver(new URL(hubURL), capability);
		driver.get("http://games.o01.dev.playphone.cc/#/");
	  }
	
	@Test
  public void f() throws InterruptedException {
		WebDriver driver = null;
		String baseUrl = null;
		driver.get(baseUrl + "/#/");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@type='button']")).click();
	    Thread.sleep(3000);
  }
  

  @AfterTest
  public void afterTest() {
  }

}
