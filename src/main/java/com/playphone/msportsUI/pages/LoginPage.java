package com.playphone.msportsUI.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//div[@data-pp-auto-id='login-with-email']")
	WebElement loginWithEmail;
	
	@FindBy(xpath="//input[@data-pp-auto-id='email-input-field']")
	WebElement emailInputField;
	
	@FindBy(xpath="//input[@data-pp-auto-id='pw-input-field']")
	WebElement passwordInputField;
	
	@FindBy(xpath="//button[@data-pp-auto-id='login-with-email']")
	WebElement loginSubmit;
	
	@FindBy(xpath="//a[@data-pp-auto-id='forgot-password-login-page']")
	WebElement forgotPasswordLoginPage;
	
	@FindBy(xpath="//span[@data-pp-auto-id='login-with-facebook']")
	WebElement loginWithFacebook;
	
	@FindBy(xpath="//span[@data-pp-auto-id='login-with-google']")
	WebElement loginWithGoogle;
	
	@FindBy(xpath="//a[@data-pp-auto-id='signup-link']")
	WebElement signupLink;
	
	@FindBy(xpath=".//*[@id='email']")
	WebElement facebookEmailField;
	
	@FindBy(xpath=".//*[@id='pass']")
	WebElement facebookPasswordField;
	
	@FindBy(xpath=".//*[@id='loginbutton']")
	WebElement facebookLoginButton;
	
	@FindBy(xpath=".//*[@id='identifierId']")
	WebElement googleEmailField;
	
	@FindBy(xpath=".//*[@id='identifierNext']")
	WebElement nextEmailGoogleButton;
	
	@FindBy(xpath=".//*[@id='password']/div[1]/div/div[1]/input")
	WebElement googlePasswordField;
	
	@FindBy(xpath=".//*[@id='passwordNext']/div[2]")
	WebElement nextPasswordGoogleField;
	
	


public LoginPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
		
}

public void emailLogin() {
	loginWithEmail.click();
}
public void enterEmail(String email) {
	emailInputField.clear();
	emailInputField.sendKeys(email);
}
public void enterPassword(String password) {
	passwordInputField.clear();
	passwordInputField.sendKeys(password);
}
public void submitClick() {
	loginSubmit.click();
}
public void clickForgotPasswordLoginPage() {
	forgotPasswordLoginPage.click();
}
public void clickLoginWithFacebook() {
	loginWithFacebook.click();
}
public void clickLoginWithGoogle() {
	loginWithGoogle.click();
}
public void clickSignupLink() {
	signupLink.click();
}
public void enterFacebookEmail(String email) {
	facebookEmailField.clear();
	facebookEmailField.sendKeys(email);
}
public void enterFacebookPassword(String password) {
	facebookPasswordField.clear();
	facebookPasswordField.sendKeys(password);
}
public void clickFacebookLoginButton() {
	facebookLoginButton.click();
}
public void enterGoogleEmailField(String email) {
	googleEmailField.clear();
	googleEmailField.sendKeys(email);
}
public void enterGooglePasswordField(String password) {
	googlePasswordField.clear();
	googlePasswordField.sendKeys(password);
}
public void clickNextEmailGoogleButton() {
	nextEmailGoogleButton.click();
}
public void clickNextPasswordGoogleButton() {
	nextPasswordGoogleField.click();
	
}
public void resetPasswordButton() {
	loginSubmit.click();
	
	
}
}
