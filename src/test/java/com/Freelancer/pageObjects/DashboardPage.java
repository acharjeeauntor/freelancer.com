package com.Freelancer.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	WebDriver ldriver;
	public DashboardPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//fl-button[@fltrackinglabel='UserSettings']//button[@type='button']")
	WebElement dashboardProfile;
	
	@FindBy(xpath="//app-menu-item[@trackinglabel='Account-ViewProfile']")
	WebElement viewProfile;
	
	
	
	
	public void clickDashboardProfile() {
		dashboardProfile.click();
	}
	

	
	public void clickViewProfile() {
		viewProfile.click();
	}
	
}
