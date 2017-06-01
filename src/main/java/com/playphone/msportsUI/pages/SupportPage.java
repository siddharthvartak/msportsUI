package com.playphone.msportsUI.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SupportPage {
	WebDriver driver;
	
	@FindBy(xpath="//div[@data-pp-auto-id='gotoFAQ']")
	WebElement gotoFAQ;
	
	@FindBy(xpath="//div[@data-pp-auto-id='gotoCommunity']")
	WebElement gotoCommunity;
	
	@FindBy(xpath="//div[@data-pp-auto-id='gotoFeedback']")
	WebElement gotoFeedback;
	
	@FindBy(xpath="//div[@data-pp-auto-id='gotoPrivacy']")
	WebElement gotoPrivacy;
	
	@FindBy(xpath="//div[@data-pp-auto-id='gotoTerms']")
	WebElement gotoTerms;
	
	@FindBy(xpath="//div[@data-pp-auto-id='gotoContact']")
	WebElement gotoContact;
	
	
	public SupportPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	public void clickGotoFAQ() {
	    gotoFAQ.click();
	}
	public void clickGotoCommunity() {
		gotoCommunity.click();
	}
	public void clickGotoFeedback() {
		gotoFeedback.click();
	}
	public void clickGotoPrivacy() {
		gotoPrivacy.click();
	}
	public void clickGotoTerms() {
		gotoTerms.click();
	}
	public void clickGotoContact() {
		gotoContact.click();
	}

}

