package com.Freelancer.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddEducation {

	WebDriver ldriver;
	public AddEducation(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//button[normalize-space()='Add Education']")
	WebElement addEdu;
	
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-logged-in-shell[1]/div[1]/div[2]/app-user-profile-wrapper[1]/app-user-profile[1]/fl-bit[2]/fl-bit[2]/fl-container[1]/fl-grid[1]/fl-col[2]/fl-bit[4]/fl-bit[1]/app-user-profile-educations[1]/fl-card[1]/fl-bit[1]/fl-bit[2]/app-user-profile-educations-edit[1]/fl-grid[1]/fl-col[1]/fl-select[1]/fl-bit[1]/select[1]")
	WebElement country;
	
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-logged-in-shell[1]/div[1]/div[2]/app-user-profile-wrapper[1]/app-user-profile[1]/fl-bit[2]/fl-bit[2]/fl-container[1]/fl-grid[1]/fl-col[2]/fl-bit[4]/fl-bit[1]/app-user-profile-educations[1]/fl-card[1]/fl-bit[1]/fl-bit[2]/app-user-profile-educations-edit[1]/fl-grid[1]/fl-col[2]/fl-select[1]/fl-bit[1]/select[1]")
	WebElement university;
	
	@FindBy(xpath="//input[@placeholder='Enter your degree']")
	WebElement degree;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-logged-in-shell[1]/div[1]/div[2]/app-user-profile-wrapper[1]/app-user-profile[1]/fl-bit[2]/fl-bit[2]/fl-container[1]/fl-grid[1]/fl-col[2]/fl-bit[4]/fl-bit[1]/app-user-profile-educations[1]/fl-card[1]/fl-bit[1]/fl-bit[2]/app-user-profile-educations-edit[1]/fl-grid[1]/fl-col[4]/fl-select[1]/fl-bit[1]/select[1]")
	WebElement start;
	
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-logged-in-shell[1]/div[1]/div[2]/app-user-profile-wrapper[1]/app-user-profile[1]/fl-bit[2]/fl-bit[2]/fl-container[1]/fl-grid[1]/fl-col[2]/fl-bit[4]/fl-bit[1]/app-user-profile-educations[1]/fl-card[1]/fl-bit[1]/fl-bit[2]/app-user-profile-educations-edit[1]/fl-grid[1]/fl-col[5]/fl-select[1]/fl-bit[1]/select[1]")
	WebElement end;
	
	//@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-logged-in-shell[1]/div[1]/div[2]/app-user-profile-wrapper[1]/app-user-profile[1]/fl-bit[2]/fl-bit[2]/fl-container[1]/fl-grid[1]/fl-col[2]/fl-bit[4]/fl-bit[1]/app-user-profile-educations[1]/fl-card[1]/fl-bit[1]/fl-bit[2]/app-user-profile-educations-edit[1]/fl-grid[1]/fl-col[8]/app-user-profile-editable-ui-action-row[1]/fl-bit[1]/fl-bit[1]/fl-button[2]/button[1]")
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement saveBtn;
	
	@FindBy(xpath="//fl-heading[@class='Heading ng-star-inserted']")
	WebElement SavedDegree;
	
	
	@FindBy(xpath="//fl-link[@data-margin-bottom='small']//button[@type='button']")
	WebElement editBtn;
	
	//app-user-profile-editable-ui-drop-actions[@fltrackinglabel='UserProfilePublicationView']
	@FindBy(xpath="//*[name()='path' and contains(@d,'M4.2222222')]")
	WebElement options;
	
	@FindBy(xpath="//fl-link[2]//button[1]")
	WebElement deleteBtn;
	
	@FindBy(xpath="//button[normalize-space()='Confirm']")
	WebElement confirmBtn;
	
	@FindBy(xpath="//div[normalize-space()='No education information has been added.']")
	WebElement noEdu;
	
	
	
	
	public void clickAddEduBtn() {
		addEdu.click();
	}
	
	public String getNoEduMsg() {
		return noEdu.getText();
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
	
	public String getSavedDegree() {
		return SavedDegree.getText();
	}
	
	public void selectCountry(String c) throws InterruptedException {
		Select se = new Select(country);
		se.selectByVisibleText(c);
		
	}
	
	public void selectUniversity(String u) {
	
		Select se = new Select(university);
		se.selectByVisibleText(u);
	}
	
	public void setDegree(String d) {
		degree.sendKeys(d);
	}
	
	public void editDegree(String d) {
		degree.clear();
		degree.sendKeys(d);
	}
	
	public void selectStartYear(String s) {
		start.click();
		Select se = new Select(start);
		se.selectByVisibleText(s);
	}
	
	public void selectEndYear(String e) {
		end.click();
		Select se = new Select(end);
		se.selectByVisibleText(e);
	}
	
}
