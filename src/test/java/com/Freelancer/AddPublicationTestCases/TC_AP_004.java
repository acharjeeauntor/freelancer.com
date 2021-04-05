package com.Freelancer.AddPublicationTestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Freelancer.LoginTestCases.BaseClass;
import com.Freelancer.pageObjects.AddEducation;
import com.Freelancer.pageObjects.AddPublication;
import com.Freelancer.pageObjects.AddQualifications;
import com.Freelancer.pageObjects.DashboardPage;
import com.Freelancer.pageObjects.LoginPage;

public class TC_AP_004 extends BaseClass{
	String noPublicationMsg = "No publications have been added.";

@Test(priority=1)
public void deletePublication() throws InterruptedException, IOException {
	loginToFreelancer();
	DashboardPage dp = new DashboardPage(driver);
	dp.clickDashboardProfile();
	Thread.sleep(3000);
	dp.clickViewProfile();
	Thread.sleep(3000);
	AddPublication Ap = new AddPublication(driver);
	logger.info("Edit Publication Details");
	Ap.clickOptions();
	Ap.clickDeleteBtn();
	Ap.clickConfirmBtn();
	Thread.sleep(2000);
	logger.info("Validation Start...");
	if(Ap.getNoPublicationMsg().contains(noPublicationMsg)) {
		logger.info("TC_AP_004 Passed");
		Assert.assertTrue(true);
	}else {
		logger.warn("TC_AP_004 Failed");
		captureScreen(driver,"deletePublication");
		Assert.fail();
	}
	
} 
	
	
	
	
}
