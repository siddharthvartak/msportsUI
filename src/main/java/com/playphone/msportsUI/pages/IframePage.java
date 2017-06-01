package com.playphone.msportsUI.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IframePage {
	
	WebDriver driver;
	
	@FindBy(xpath="//iframe[@class='sdk-app']")
	WebElement iframeClass;
	
	@FindBy(xpath="//button[@data-pp-auto-id='playTournament']")
	WebElement playTournament;
	
	@FindBy(xpath="//div[@data-pp-auto-id='FAQ']")
	WebElement iFrameFAQ;
	
	@FindBy(xpath="//button[@data-pp-auto-id='inner-menu-button']")
	WebElement innerMenuButton;
	
	@FindBy(xpath="//div[@data-pp-auto-id='icon-sdk-ui']")
	WebElement iconSdkUi;
	
	
	
	
	
	public IframePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		
	public void clickPlayTournament() {
		playTournament.click();
		}
	public void clickFAQ() {
		iFrameFAQ.click();
	}
	public void clickInnerMenuButton() {
		innerMenuButton.click();
	}
	public void clickIconSdkUi() {
		iconSdkUi.click();
	}
	
			
	}


