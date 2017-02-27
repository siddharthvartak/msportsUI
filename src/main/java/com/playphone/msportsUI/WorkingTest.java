package com.playphone.msportsUI;

import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;

public class WorkingTest {


@Test

public void ti () throws MalformedURLException {
String hubURL = "http://172.16.1.68:4444/wd/hub";
DesiredCapabilities capability = DesiredCapabilities.firefox();
WebDriver driver = new RemoteWebDriver(new URL(hubURL), capability);
driver.get("http://games.o01.dev.playphone.cc/#/");



driver.quit();


}


}


