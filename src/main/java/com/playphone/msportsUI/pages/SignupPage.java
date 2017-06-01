package com.playphone.msportsUI.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//span[@data-pp-auto-id='sign-up-with-email']")
	WebElement signupWithEmail;
	
	@FindBy(xpath="//input[@data-pp-auto-id='sign-up-email-input']")
	WebElement signupEmailInput;
	
	@FindBy(xpath="//input[@data-pp-auto-id='sign-up-password-input']")
	WebElement signupPasswordInput;
	
	@FindBy(xpath="//input[@data-pp-auto-id='sign-up-username-input']")
	WebElement signupUsernameInput;
	
	@FindBy(xpath="//button[@data-pp-auto-id='create-account-button']")
	WebElement createAccountButton;
	
	@FindBy(xpath="//span[@data-pp-auto-id='sign-with-google']")
	WebElement signWithGoogle;
	
	@FindBy(xpath="//input[@id='identifierId']")
	WebElement gmailEmailInput;
	
	@FindBy(xpath=".//*[@id='identifierNext']")
	WebElement emailClickNext;
	
	@FindBy(xpath=".//*[@id='password']/div[1]/div/div[1]/input")
	WebElement gmailPasswordInput;
	
	@FindBy(xpath="//div[@id='passwordNext']")
	WebElement passwordClickNext;
	
	@FindBy(xpath="//span[@data-pp-auto-id='sign-with-facebook']")
	WebElement signWithFacebook;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement facebookEmailInput;
	
	@FindBy(xpath="//*[@id='pass']")
	WebElement facebookPasswordInput;
	
	@FindBy(xpath="//*[@id='loginbutton']")
	WebElement facebookLoginButton;
	
	
	
	
	
	
	public SignupPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
    public void clickSignupWithEmail() {
    	signupWithEmail.click();
    }
    public void enterSignupEmailInput(String email) {
    	signupEmailInput.clear();
    	signupEmailInput.sendKeys(email);
    }
    public void enterSignupPasswordInput(String password) {
    	signupPasswordInput.clear();
    	signupPasswordInput.sendKeys(password);
    }
    public void enterSignupUsernameInput(String username) {
    	signupUsernameInput.clear();
    	signupUsernameInput.sendKeys(username);
    }
    public void clickCreateAccountButton() {
    	createAccountButton.click();
    }
    public void clickSignWithGoogle() {
    	signWithGoogle.click();
    }
    public void enterGmailEmailInput(String email) {
    	gmailEmailInput.clear();
    	gmailEmailInput.sendKeys(email);
    }
    public void clickEmailNext() {
    	emailClickNext.click();
    }
    public void enterGmailPassword(String password) {
    	gmailPasswordInput.clear();
    	gmailPasswordInput.sendKeys(password);
    }
    public void clickPasswordNext() {
    	passwordClickNext.click();
    }
    public void clickSignWithFacebook() {
    	signWithFacebook.click();
    }
    public void enterFacebookEmail(String email) {
    	facebookEmailInput.clear();
    	facebookEmailInput.sendKeys(email);
    }
    public void enterFacebookPassword(String password) {
    	facebookPasswordInput.clear();
    	facebookPasswordInput.sendKeys(password);
    }
    public void clickFacebookLoginButton() {
    	facebookLoginButton.click();
    }
    
}

