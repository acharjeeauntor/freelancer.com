package com.Freelancer.LoginTestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Freelancer.pageObjects.LoginPage;

public class TC_FL_002 extends BaseClass{

@Test(priority=1)
public void loginWithValidInput() throws InterruptedException, IOException {
	LoginPage lp = new LoginPage(driver);
	logger.info("Go to login and Providing valid Input....");
	lp.goToLogin();
	Thread.sleep(7000);
	lp.setEmail(email);
	lp.setPass(password);
	lp.clickLogin();
	Thread.sleep(7000);
	logger.info("login Validation Start....");
//	System.out.println(driver.getCurrentUrl());
	if(driver.getCurrentUrl().equals("https://www.freelancer.com/dashboard")) {
		logger.info("TC_FL_002 Pass");
		Assert.assertTrue(true);
	}else {
		logger.warn("TC_FL_002 Fail");
		captureScreen(driver,"loginWithValidInput");
		Assert.fail();
	}
	
} 
	
	
	
	
}
