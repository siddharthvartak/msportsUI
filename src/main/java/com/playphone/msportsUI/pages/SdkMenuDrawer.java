package com.playphone.msportsUI.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SdkMenuDrawer {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[@data-pp-auto-id='new-tournament']")
	WebElement newTournament;
	
	@FindBy(xpath="//a[@data-pp-auto-id='my-tournaments']")
	WebElement myTournaments;
	
	@FindBy(xpath="//a[@data-pp-auto-id='games']")
	WebElement games;
	
	@FindBy(xpath="//a[@data-pp-auto-id='invite-friend']")
	WebElement inviteFriend;
	
	@FindBy(xpath="//a[@data-pp-auto-id='how-to-play']")
	WebElement howToPlay;
	
	@FindBy(xpath="//a[@data-pp-auto-id='support']")
	WebElement support; 
	
	@FindBy(xpath="//div[@data-pp-auto-id='spins']")
	WebElement Spins;
	
	@FindBy(xpath="//button[@data-pp-auto-id='login']")
	WebElement menuButtonLogin;
	
	@FindBy(xpath="//button[@data-pp-auto-id='signup']")
	WebElement menuButtonSignup;
	
	@FindBy(xpath="//div[@data-pp-auto-id='cards']")
	WebElement menuDrawerCards;
	
	@FindBy(xpath="//div[@data-pp-auto-id='cash-wallet']")
	WebElement menuDrawerWallet;
	
	public SdkMenuDrawer(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void clickNewTournament() {
		newTournament.click();
	}
	public void myTournaments() {
		myTournaments.click();
	}
	public void clickGames() {
		games.click();
	}
	public void clickInviteFriend() {
		inviteFriend.click();
	}
	public void clickHowToPlay() {
		howToPlay.click();
	}
	public void clickSupport() {
		support.click();
	}
	public void clickSpins() {
		Spins.click();
	}
	public void clickMenuButtonLogin() {
		menuButtonLogin.click();
	}
	public void clickMenuButtonSignup() {
		menuButtonSignup.click();
	}
	public void clickMenuDrawerCards() {
		menuDrawerCards.click();
	}
	public void clickMenuDrawerWallet() {
		menuDrawerWallet.click();
	}
	
	
	

}
