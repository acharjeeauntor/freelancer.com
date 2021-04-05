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

public class TC_AP_002 extends BaseClass{

@Test(priority=1)
public void addPublicationWithEmptyInfo() throws InterruptedException, IOException {
	loginToFreelancer();
	DashboardPage dp = new DashboardPage(driver);
	dp.clickDashboardProfile();
	Thread.sleep(3000);
	dp.clickViewProfile();
	Thread.sleep(3000);
	AddPublication ap = new AddPublication(driver);
	ap.clickAddPublicationBtn();
	logger.info("Validation Start...");
	if(ap.saveBtnType().equals(false)) {
		logger.info("TC_AP_002 Passed");
		Assert.assertTrue(true);
	}else {
		logger.warn("TC_AP_002 Failed");
		captureScreen(driver,"addPublicationWithEmptyInfo");
		Assert.fail();
	}
	
} 
	
	
	
	
}
