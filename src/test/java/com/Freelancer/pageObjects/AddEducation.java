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
	
	@FindBy(xpath="//app-menu-item[@trackinglabel='Account-ViewProfile']")
	WebElement viewProfile;
	
	@FindBy(xpath="//fl-bit[@data-focus='true']//select[@class='NativeElement ng-untouched ng-pristine ng-invalid']")
	WebElement country;
	
	
	@FindBy(xpath="//fl-select[@placeholder='Select university/college']//select[@class='NativeElement ng-untouched ng-pristine ng-invalid']")
	WebElement university;
	
	
	@FindBy(xpath="//input[@placeholder='Enter your degree']")
	WebElement degree;
	
	@FindBy(xpath="//fl-select[@fltrackinglabel='EducationEditStartYear']//select[@class='NativeElement ng-untouched ng-pristine ng-invalid']")
	WebElement start;
	
	
	@FindBy(xpath="//select[@class='NativeElement ng-untouched ng-pristine ng-invalid']")
	WebElement end;
	
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement saveBtn;
	
	@FindBy(xpath="//fl-heading[@class='Heading ng-star-inserted']")
	WebElement SavedDegree;
	
	
	
	
	
	
	public void clickAddEduBtn() {
		addEdu.click();
	}
	

	
	public void clickViewProfile() {
		viewProfile.click();
	}
	
	
	public void clickSaveBtn() {
		saveBtn.click();
	}
	
	public String getSavedDegree() {
		return SavedDegree.getAttribute("innerHTML");
	}
	
	public void selectCountry(String c) {
		country.click();
		Select se = new Select(country);
		se.selectByVisibleText(c);
	}
	
	public void selectUniversity(String u) {
		university.click();
		Select se = new Select(university);
		se.selectByVisibleText(u);
	}
	
	public void setDegree(String d) {
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
