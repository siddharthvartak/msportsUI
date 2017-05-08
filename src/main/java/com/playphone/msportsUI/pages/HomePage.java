package com.playphone.msportsUI.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver; 
	
	@FindBy(xpath="//div[@data-pp-auto-id='skip']")
	WebElement skip;
	
	@FindBy(xpath="//button[@data-pp-auto-id='floater-login-button']")
	WebElement floaterLoginButton;
	
	@FindBy(xpath="//div[@data-pp-auto-id='login-with-email']")
	WebElement loginWithEmail;
	
	@FindBy(xpath="//input[@data-pp-auto-id='email-input-field']")
	WebElement emailInputField;
	
	@FindBy(xpath="//input[@data-pp-auto-id='pw-input-field']")
	WebElement passwordInputField;
	
	@FindBy(xpath="//button[@data-pp-auto-id='login-with-email']")
	WebElement loginSubmit;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
			
}
	public void

}
