package com.Freelancer.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddExperience {

	WebDriver ldriver;
	public AddExperience(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//button[normalize-space()='Add Experience']")
	WebElement addExp;
	
	
	@FindBy(xpath="//input[@placeholder='Enter your position or title']")
	WebElement title;
	
	
	@FindBy(xpath="//input[@placeholder='Enter company name']")
	WebElement company;
	
	@FindBy(xpath="//textarea[@placeholder='Describe your work experience']")
	WebElement summary;
	
	@FindBy(xpath="//label[normalize-space()=\"I'm currently working here\"]")
	WebElement checkBox;
	
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-logged-in-shell[1]/div[1]/div[2]/app-user-profile-wrapper[1]/app-user-profile[1]/fl-bit[2]/fl-bit[2]/fl-container[1]/fl-grid[1]/fl-col[2]/fl-bit[4]/fl-bit[1]/app-user-profile-experiences[1]/fl-card[1]/fl-bit[1]/fl-bit[2]/app-user-profile-experiences-edit[1]/fl-grid[1]/fl-col[3]/fl-bit[1]/fl-select[1]/fl-bit[1]/select[1]")
	WebElement startMonth;
	
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-logged-in-shell[1]/div[1]/div[2]/app-user-profile-wrapper[1]/app-user-profile[1]/fl-bit[2]/fl-bit[2]/fl-container[1]/fl-grid[1]/fl-col[2]/fl-bit[4]/fl-bit[1]/app-user-profile-experiences[1]/fl-card[1]/fl-bit[1]/fl-bit[2]/app-user-profile-experiences-edit[1]/fl-grid[1]/fl-col[3]/fl-bit[1]/fl-select[2]/fl-bit[1]/select[1]")
	WebElement startYear;
	
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement saveBtn;
	
	@FindBy(xpath="//fl-bit[@class='Title']")
	WebElement SavedTitle;
	
	//div[contains(text(),'Edit')]
	@FindBy(xpath="//fl-link[@data-margin-bottom='small']//button[@type='button']")
	WebElement editBtn;
	
	@FindBy(xpath="//div[@data-name='ui-show-more-h']")
	WebElement options;
	
	@FindBy(xpath="//fl-link[2]//button[1]")
	WebElement deleteBtn;
	
	@FindBy(xpath="//button[normalize-space()='Confirm']")
	WebElement confirmBtn;
	
	@FindBy(xpath="//div[normalize-space()='No experiences have been added.']")
	WebElement noExp;
	
	
	
	
	public void clickAddExpBtn() {
		addExp.click();
	}
	
	public String getNoExpMsg() {
		return noExp.getText();
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
	
	public String getSavedTitle() {
		return SavedTitle.getText();
	}
	
	public void setTitle(String c)  {
		title.sendKeys(c);
	}
	
	public void setCompany(String u) {
		company.sendKeys(u);
	}
	
	public void setSummary(String d) {
		summary.sendKeys(d);
	}
	
	public void editTitle(String d) {
		title.clear();
		title.sendKeys(d);
	}
	
	public void clickCheckBox() {
		checkBox.click();
	}
	
	public void selectStartMonth(String s) {
		Select se = new Select(startMonth);
		se.selectByVisibleText(s);
	}
	
	public void selectStartYear(String e) {
		Select se = new Select(startYear);
		se.selectByVisibleText(e);
	}
	
}
