package com.playphone.msportsUI.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserProfilePage {
	WebDriver driver;
	
	@FindBy(xpath="//a[@data-pp-auto-id='msports-change-password-icon']")
	WebElement changePassword;
	
	@FindBy(xpath="//input[@data-pp-auto-id='myprofile-current-password']")
	WebElement currentPassword;
	
	@FindBy(xpath="//input[@data-pp-auto-id='password-input-field']")
	WebElement newPassword;
	
	@FindBy(xpath="//input[@data-pp-auto-id='confirmPassword-input-field']")
	WebElement confirmNewPassword;
	
	@FindBy(xpath="//*[@id='my-profile-change-password']/section[2]")
	WebElement saveButton;
	
	@FindBy(xpath="//a[@data-pp-auto-id='msports-delete-icon']")
	WebElement msportsDeleteButton;
	
	@FindBy(xpath="//input[@data-pp-auto-id='password-input-field']")
	WebElement passwordInputField;
	
	@FindBy(xpath="//button[@data-pp-auto-id='delete-green-button']")
	WebElement deleteGreenButton;
	
	@FindBy(xpath="//input[@data-pp-auto-id='enter-full-name']")
	WebElement enterFirstName;
	
	@FindBy(xpath="//input[@data-pp-auto-id='enter-user-name']")
	WebElement enterUserName;
	
	@FindBy(xpath="//button[@data-pp-auto-id='msports-logout-icon']")
	WebElement msportsLogoutIcon;
	
	
	public UserProfilePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

}
	public void clickChangePassword() {
		changePassword.click();
	}	
	public void enterCurrentPassword(String currentpassword) {
		currentPassword.clear();
		currentPassword.sendKeys(currentpassword);
	}
	public void enterNewPassword(String newpassword) {
		newPassword.clear();
		newPassword.sendKeys(newpassword);
	}
	public void enterConfirmPassword(String confirmpassword) {
		confirmNewPassword.clear();
		confirmNewPassword.sendKeys(confirmpassword);
	}
	public void clickSaveButton() {
		saveButton.click();
	}
	public void clickMsportsDeleteButton() {
		msportsDeleteButton.click();
	}
	public void clickPasswordInputField(String password) {
        passwordInputField.clear();
		passwordInputField.sendKeys(password);
	}
	public void clickDeleteButton() {
		deleteGreenButton.click();
	}
	public void enterFirstName(String name) {
		enterFirstName.clear();
		enterFirstName.sendKeys(name);
	}
	public void enterUserName(String username) {
		enterUserName.clear();
		enterUserName.sendKeys(username);
	}
	public void msportsLogoutIcon() {
		msportsLogoutIcon.click();
	}
	
	
	
}