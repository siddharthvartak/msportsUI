package com.playphone.msportsUI;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class WebDriverBuilder {
	private String seleniumGridUrl;
	private String browserCapability;
	private String versionCapability;
	private Platform platformCapability;
	
	private FirefoxProfile ffProfile;

	public void setSeleniumGridUrl(String seleniumGridUrl) {
		this.seleniumGridUrl = seleniumGridUrl;
	}

	public void setBrowserCapability(String browserCapability) {
		this.browserCapability = browserCapability;
	}
	
	public String getBrowserCapability() {
		return this.browserCapability;
	}

	public void setVersionCapability(String versionCapability) {
		this.versionCapability = versionCapability;
	}

	public void setPlatformCapability(Platform platformCapability) {
		this.platformCapability = platformCapability;
	}
	
	public void setFirefoxProf(FirefoxProfile profile) {
		this.ffProfile = profile;
	}
	
	public WebDriver buildDriver() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		if (browserCapability != null) {
			caps.setCapability(CapabilityType.BROWSER_NAME, browserCapability);
		}

		if (versionCapability != null) {
			caps.setCapability(CapabilityType.VERSION, versionCapability);
		}

		if (platformCapability != null) {
			caps.setCapability(CapabilityType.PLATFORM, platformCapability);
		}

		WebDriver driver = null;
		if (seleniumGridUrl != null) {
			URL selGrid = new URL(seleniumGridUrl);
			driver = new RemoteWebDriver(selGrid, caps);
			((RemoteWebDriver) driver).setFileDetector(new LocalFileDetector());
		} else if (browserCapability != null) {
			if (browserCapability.equalsIgnoreCase(BrowserType.CHROME)) {
				driver = new ChromeDriver(caps);
			} // else use firefox. Firefox is handled by default case later.
		}

		if (driver == null) {
			
			if (ffProfile == null) {
				ffProfile = new ProfilesIni().getProfile("default");
			}
			driver = new FirefoxDriver(new FirefoxBinary(), ffProfile, caps);
			
		}
		return driver;
	}
	
	
	
	
	@Test
	public void ti () throws InterruptedException {
	//10PM//	File ffpath = new File("/Applications/Firefox.app/Contents/MacOS/firefox-bin");
	//10PM//	FirefoxBinary ffBinary = new FirefoxBinary(ffpath);
	//10PM//	FirefoxProfile firefoxProfile = new FirefoxProfile();       
	//10PM//	WebDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);
		WebDriver driver;
		//System.setProperty("webdriver.gecko.driver", "/Users/siddharth/bin/geckodriver");
		//DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		//capabilities.setCapability("marionette", true);
		//WebDriver driver = new FirefoxDriver(capabilities);
		
		driver = new FirefoxDriver();
		String baseURL = "http://games.o01.dev.playphone.cc/#/?";
		
		driver.get(baseURL);
		//driver.manage().window().maximize();
		
		Thread.sleep(1000);
		driver.quit();
	

	}
	
	
	
	
	
	
}
