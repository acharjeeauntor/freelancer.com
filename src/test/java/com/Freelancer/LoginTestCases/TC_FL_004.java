package com.Freelancer.LoginTestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Freelancer.pageObjects.LoginPage;

public class TC_FL_004 extends BaseClass{

	String email="<script>alert(\"hi\")</script>";
	String pass="<script>alert(\"hi\")</script>";
	String errorMsg = "Incorrect username or password.";

@Test(priority=1)
public void loginWithInvalidInput() throws InterruptedException, IOException {
	LoginPage lp = new LoginPage(driver);
	logger.info("Go to login and Providing valid Input....");
	lp.goToLogin();
	Thread.sleep(7000);
	lp.setEmail(email);
	lp.setPass(pass);
	lp.clickLogin();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	logger.info("login Validation Start....");
	if(lp.validateError().contains(errorMsg)) {
		logger.info("TC_FL_0024 Pass");
		Assert.assertTrue(true);
	}else {
		logger.warn("TC_FL_004 Fail");
		captureScreen(driver,"loginWithInvalidInput");
		Assert.fail();
	}
	
} 
	
	
	
	
	
}
