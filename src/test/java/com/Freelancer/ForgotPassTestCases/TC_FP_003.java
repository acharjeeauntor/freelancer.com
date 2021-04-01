package com.Freelancer.ForgotPassTestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Freelancer.LoginTestCases.BaseClass;
import com.Freelancer.pageObjects.LoginPage;

public class TC_FP_003 extends BaseClass{

	String email="<script>alert(\"hi\")</script>";
	String errorMsg = "Please enter a valid email address.";

@Test(priority=1)
public void forgotPassInvalidEmail() throws InterruptedException, IOException {
	LoginPage lp = new LoginPage(driver);
	logger.info("Go to login page");
	lp.navigateLoginPage();
	Thread.sleep(5000);
	lp.clickForgotLink();
	Thread.sleep(5000);
	lp.setForgotEmail(email);
	lp.clickNextBtn();
	logger.info("Email Validation Start....");
	if(lp.validateForgotError().contains(errorMsg)) {
		logger.info("TC_FP_003 Pass");
		Assert.assertTrue(true);
	}else {
		logger.info("TC_FP_003 Fail");
		captureScreen(driver,"forgotPassInvalidEmail");
		
	}
	
} 
	
	
	
	
	
}
