package com.Freelancer.ForgotPassTestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Freelancer.LoginTestCases.BaseClass;
import com.Freelancer.pageObjects.LoginPage;

public class TC_FP_004 extends BaseClass{
	String errorMsg="Please enter your email address.";

@Test(priority=1)
public void forgotPassEmptyEmailInput() throws InterruptedException, IOException {
	LoginPage lp = new LoginPage(driver);
	logger.info("Go to login page");
	lp.navigateLoginPage();
	Thread.sleep(5000);
	lp.clickForgotLink();
	Thread.sleep(5000);
	lp.clickNextBtn();
	logger.info("Email Validation Start....");
	if(lp.validateForgotError().contains(errorMsg)) {
		logger.info("TC_FP_004 Pass");
		Assert.assertTrue(true);
	}else {
		logger.warn("TC_FP_004 Fail");
		captureScreen(driver,"forgotPassEmptyEmailInput");
		Assert.fail();
	}
	
} 
	
	
	
	
}
