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
	
	@FindBy(xpath="//div[@data-pp-auto-id='play-now-button-0']")
	WebElement playNow0;
	
	@FindBy(xpath="//div[@data-pp-auto-id='play-now-button-1']")
	WebElement playNow1;
	
	@FindBy(xpath="//div[@data-pp-auto-id='play-now-button-2']")
	WebElement playNow2;
	
	@FindBy(xpath="//div[@data-pp-auto-id='play-now-button-3']")
	WebElement playNow3;
	
	@FindBy(xpath="//div[@data-pp-auto-id='play-now-button-4']")
	WebElement playNow4;
	
	@FindBy(xpath="//div[@data-pp-auto-id='play-now-button-5']")
	WebElement playNow5;
	
	@FindBy(xpath="//div[@data-pp-auto-id='play-now-button-6']")
	WebElement playNow6;
	
	@FindBy(xpath="//div[@data-pp-auto-id='play-now-button-12']")
	WebElement playNow12;
	
	@FindBy(xpath="//button[@data-pp-auto-id='floater-signup-button']")
	WebElement signupFloaterButton;
	
	@FindBy(xpath="//div[@data-pp-auto-id='outer-menu-button']")
	WebElement outerMenuButton;
	
	@FindBy(xpath="//a[@data-pp-auto-id='signup']")
	WebElement bottomSignUp;
	
	@FindBy(xpath="//a[@data-pp-auto-id='signin']")
	WebElement bottomSignIn;
	
	@FindBy(xpath="//a[@data-pp-auto-id='gotoSupportsPage']")
	WebElement bottomSupportsPage;
	
	@FindBy(xpath="//span[@data-pp-auto-id='icon-msports-facebook']")
	WebElement bottomFacebookIcon;
	
	@FindBy(xpath="//span[@data-pp-auto-id='icon-msports-googleplus']")
	WebElement bottomGoogleIcon;
	
	@FindBy(xpath="//div[@data-pp-auto-id='msports-home-button']")
	WebElement msportsHomeButton;
	
	@FindBy(xpath="//i[@data-pp-auto-id='3-dots-menu']")
	WebElement threeDotsMenu;
	
	@FindBy(xpath="//a[@data-pp-auto-id='icon-msports-logout']")
	WebElement iconMsportsLogout;
	
	@FindBy(xpath="//a[@data-pp-auto-id='nav-bar-user-avatar']")
	WebElement navBarUserAvatar;
	
	@FindBy(xpath="//div[@data-pp-auto-id='nav-bar-spins']")
	WebElement navBarSpins;
	
	@FindBy(xpath="//div[@data-pp-auto-id='nav-bar-cards']")
	WebElement navBarCards;
	
	@FindBy(xpath="//div[@data-pp-auto-id='nav-bar-wallet']")
	WebElement navBarWallet;
	
	
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
			
}
	public void clickSkip() {
      skip.click();
}
	public void clickLoginButton() {
		floaterLoginButton.click();
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
	public void clickPlayNow0() {
		playNow0.click();
	}
	public void clickPlayNow1() {
		playNow1.click();
	}
	public void clickPlayNow2() {
		playNow2.click();
	}
	public void clickPlayNow3() {
		playNow3.click();
	}
	public void clickPlayNow4() {
		playNow4.click();
	}
	public void clickPlayNow5() {
		playNow5.click();
	}
	public void clickPlayNow6() {
		playNow6.click();
	}
	public void clickPlayNow12() {
		playNow2.click();
	}
	public void clickFloaterSignUp() {
		signupFloaterButton.click();
	}
	public void clickOuterMenuButton() {
		outerMenuButton.click();
	}
	public void clickBottomSignUp() {
		bottomSignUp.click();
	}
	public void clickBottomSignIn() {
		bottomSignIn.click();
	}
	public void clickGoToSupportsPage() {
		bottomSupportsPage.click();
	}
	public void clickBottomFacebookIcon() {
		bottomFacebookIcon.click();
	}
	public void clickBottomGooglePlusIcon() {
		bottomGoogleIcon.click();
	}
	public void clickMsportsHomeButton() {
		msportsHomeButton.click();
	}
	public void clickThreeDotsMenu() {
		threeDotsMenu.click();
	}
	public void clickIconMsportsLogout() {
		iconMsportsLogout.click();
	}
	public void clickNavBarUserAvatar() {
		navBarUserAvatar.click();
	}
    public void clickNavBarSpins() {
	    navBarSpins.click();
	}
    public void clickNavBarCards() {
    	navBarCards.click();
    }
    public void clickNavBarWallet() {
    	navBarWallet.click();
    }
}
	
	
