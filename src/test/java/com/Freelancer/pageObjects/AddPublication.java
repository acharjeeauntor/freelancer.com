package com.Freelancer.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddPublication {

	WebDriver ldriver;
	public AddPublication(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//button[normalize-space()='Add Publication']")
	WebElement addPublicationBtn;
	
	
	@FindBy(xpath="//input[@placeholder='Enter the publication title']")
	WebElement publication;
	
	
	@FindBy(xpath="//input[@placeholder='Enter the publisher']")
	WebElement publisher;
	
	@FindBy(xpath="//textarea[@placeholder='Enter a description of the publication']")
	WebElement summary;
	
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement saveBtn;
	
	@FindBy(xpath="//fl-bit[@class='Title']")
	WebElement SavedPublicationTitle;
	
	
	@FindBy(xpath="//fl-link[@data-margin-bottom='small']//button[@type='button']")
	WebElement editBtn;
	
	@FindBy(xpath="//fl-callout-trigger[@title='More Actions']")
	WebElement options;
	
	@FindBy(xpath="//fl-link[2]//button[1]")
	WebElement deleteBtn;
	//html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/fl-callout-content[1]/div[1]/div[1]/fl-bit[1]/fl-link[2]/button[1]
	
	@FindBy(xpath="//button[normalize-space()='Confirm']")
	WebElement confirmBtn;
	
	@FindBy(xpath="//div[normalize-space()='No publications have been added.']")
	WebElement noPublication;
	
	
	
	
	public void clickAddPublicationBtn() {
		addPublicationBtn.click();
	}
	
	
	public String getNoPublicationMsg() {
		return noPublication.getText();
	}
	
	
	public void clickEditBtn() {
		editBtn.click();
	}
	
	public void clickDeleteBtn() {
		deleteBtn.click();
	}
	
	public void clickConfirmBtn() {
		confirmBtn.click();
	}
	
	public void clickOptions() {
		options.click();
	}
	
	public void clickSaveBtn() {
		saveBtn.click();
	}
	
	public Boolean saveBtnType() {
		return saveBtn.isEnabled();
	}
	
	public String getSavedPublicationTitle() {
		return SavedPublicationTitle.getText();
	}
	
	public void setPublication(String c) {
		publication.sendKeys(c);
		
	}
	
	public void setPublisher(String o) {
		publisher.sendKeys(o);
	}
	
	public void setSummary(String s) {
		summary.sendKeys(s);
	}
	
	public void editPublicationName(String c) {
		publication.clear();
		publication.sendKeys(c);
	}
	
	
}
