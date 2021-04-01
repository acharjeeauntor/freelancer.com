package com.Freelancer.LoginTestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Freelancer.pageObjects.LoginPage;

public class TC_FL_003 extends BaseClass{
	String errorMsgEmail= "Please enter your username or email";
	String errorMsgPass= "Please enter your password";

@Test(priority=1)
public void loginWithEmptyInput() throws InterruptedException, IOException {
	LoginPage lp = new LoginPage(driver);
	logger.info("Go to login and Providing valid Input....");
	lp.goToLogin();
	Thread.sleep(7000);
	lp.clickLogin();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	logger.info("login Validation Start....");
	//System.out.println(lp.validatePass());
	if(lp.validateEmail().contains(errorMsgEmail)&&lp.validatePass().contains(errorMsgPass)) {
		logger.info("TC_FL_003 Pass");
		Assert.assertTrue(true);
	}else {
		logger.warn("TC_FL_003 Fail");
		captureScreen(driver,"loginWithEmptyInput");
		Assert.fail();
	}
	
} 
	
	
	
	
}
