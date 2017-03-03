package com.playphone.msportsUI;

import com.google.common.io.Closeables;
import util.EnvironmentInfoProvider;
import util.WebDriverBuilder;
import org.openqa.selenium.remote.*;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public abstract class Base {
	
	protected WebDriver driver;
	protected String url;
	protected String browserType;
	
	public Base() {
		Properties property = new Properties();
		InputStream input = null;
		try {
			input = this.getClass().getResourceAsStream("/com/playphone/devportal/environment.properties");
			property.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			Closeables.closeQuietly(input);
		}
		url = property.getProperty("website");

		if (url == null) {
			throw new RuntimeException("URL is not available. This should never happen.");
		}
	}
	@BeforeMethod
	public void setUp(ITestContext context) throws Exception {
		String selGridUrl = null;
		WebDriverBuilder wdb = new WebDriverBuilder();
		browserType = EnvironmentInfoProvider.getSpecifiedBrowser(context);
		if (browserType == null) {
			browserType = BrowserType.FIREFOX;
		}
		wdb.setBrowserCapability(browserType);

		selGridUrl = EnvironmentInfoProvider.getURL(context);
		wdb.setSeleniumGridUrl(selGridUrl);

		driver = wdb.buildDriver();
		
		// open browser
		driver.get(url);

		// implicit wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// maximize browser size
		driver.manage().window().maximize();
	}

	public WebDriver getDriver() {
		return driver;
	}

	public String getEnvironmentUrl() {
		return url;
	}
	

}
