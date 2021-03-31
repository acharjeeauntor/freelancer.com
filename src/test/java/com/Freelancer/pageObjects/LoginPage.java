package com.Freelancer.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	public LoginPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//a[@href='/login']")
	WebElement loginlink;
	
	@FindBy(xpath="//input[@placeholder='Email or Username']")
	WebElement emailInput;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement passInput;
	
	
	@FindBy(xpath="//button[normalize-space()='Log In']")
	WebElement loginBtn;
	
	@FindBy(xpath="//div[normalize-space()='Please enter your username or email']")
	WebElement errorMsgEmail;

	@FindBy(xpath="//div[normalize-space()='Please enter your password']")
	WebElement errorMsgPass;
	
	@FindBy(xpath="//fl-banner-alert[@role='alert']")
	WebElement errorMsg;
	
	
	
	
	public void goToLogin() {
		loginlink.click();
	}
	
	public void setEmail(String e) {
		emailInput.sendKeys(e);
	}
	
	public void setPass(String p) {
		passInput.sendKeys(p);
	}
	
	
	public void clickLogin() {
		loginBtn.click();
	}
	
	public String validateEmail() {
		return errorMsgEmail.getText();
	}
	
	public String validatePass() {
		return errorMsgPass.getAttribute("innerHTML");
	}
	
	public String validateError() {
		return errorMsg.getAttribute("innerHTML");
	}
}
