package com.Freelancer.ForgotPassTestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Freelancer.LoginTestCases.BaseClass;
import com.Freelancer.pageObjects.LoginPage;

public class TC_FP_002 extends BaseClass{
	String errorMsg = "Oops,something went wrong.Please try again.";

@Test(priority=1)
public void forgotPassNonRegisteredEmail() throws InterruptedException, IOException {
	LoginPage lp = new LoginPage(driver);
	logger.info("Go to login page");
	lp.navigateLoginPage();
	Thread.sleep(5000);
	lp.clickForgotLink();
	Thread.sleep(5000);
	lp.setForgotEmail("acharjeeauntor@gmail.com");
	lp.clickNextBtn();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	logger.info("Email Validation Start....");
	
	if(lp.validateError().contains(errorMsg)) {
		logger.info("TC_FP_002 Pass");
		Assert.assertTrue(true);
	}else {
		logger.warn("TC_FP_002 Fail");
		captureScreen(driver,"forgotPassNonRegisteredEmail");
		Assert.fail();
	}
	
} 
	
	
	
	
}
