package com.Freelancer.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddQualifications {

	WebDriver ldriver;
	public AddQualifications(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//button[normalize-space()='Add Qualification']")
	WebElement addQualificationBtn;
	
	
	@FindBy(xpath="//input[@placeholder='Enter professional certificate or award']")
	WebElement certificate;
	
	
	@FindBy(xpath="//input[@placeholder='Enter conferring organization']")
	WebElement organization;
	
	@FindBy(xpath="//textarea[@placeholder='Describe your qualification']")
	WebElement summary;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-logged-in-shell[1]/div[1]/div[2]/app-user-profile-wrapper[1]/app-user-profile[1]/fl-bit[2]/fl-bit[2]/fl-container[1]/fl-grid[1]/fl-col[2]/fl-bit[4]/fl-bit[1]/app-user-profile-certifications[1]/fl-card[1]/fl-bit[1]/fl-bit[2]/app-user-profile-certifications-edit[1]/fl-grid[1]/fl-col[4]/fl-select[1]/fl-bit[1]/select[1]")
	WebElement start;
	
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement saveBtn;
	
	@FindBy(xpath="//fl-bit[@class='Title']")
	WebElement SavedCertificateName;
	
	
	@FindBy(xpath="//fl-link[@data-margin-bottom='small']//button[@type='button']")
	WebElement editBtn;
	
	@FindBy(xpath="//app-user-profile-editable-ui-drop-actions[@fltrackinglabel='UserProfileCertificationView']")
	WebElement options;
	
	@FindBy(xpath="//fl-link[2]//button[1]")
	WebElement deleteBtn;
	//html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/fl-callout-content[1]/div[1]/div[1]/fl-bit[1]/fl-link[2]/button[1]
	
	@FindBy(xpath="//button[normalize-space()='Confirm']")
	WebElement confirmBtn;
	
	@FindBy(xpath="//div[normalize-space()='No qualifications have been added.']")
	WebElement noQalification;
	
	
	
	
	public void clickAddQualificationBtn() {
		addQualificationBtn.click();
	}
	
	
	public String getNoQuaMsg() {
		return noQalification.getText();
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
	
	public String getSavedCertificateName() {
		return SavedCertificateName.getText();
	}
	
	public void setCertificate(String c) {
		certificate.sendKeys(c);
		
	}
	
	public void setOrganization(String o) {
		organization.sendKeys(o);
	}
	
	public void setSummary(String s) {
		summary.sendKeys(s);
	}
	
	public void editCertificateName(String c) {
		certificate.clear();
		certificate.sendKeys(c);
	}
	
	public void selectStartYear(String s) {
		Select se = new Select(start);
		se.selectByVisibleText(s);
	}
	
	
}
