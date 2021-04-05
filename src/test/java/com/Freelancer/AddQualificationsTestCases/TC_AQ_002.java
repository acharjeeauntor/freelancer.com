package com.Freelancer.AddQualificationsTestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Freelancer.LoginTestCases.BaseClass;
import com.Freelancer.pageObjects.AddEducation;
import com.Freelancer.pageObjects.AddQualifications;
import com.Freelancer.pageObjects.DashboardPage;
import com.Freelancer.pageObjects.LoginPage;

public class TC_AQ_002 extends BaseClass{

@Test(priority=1)
public void addQualificationsWithEmptyInfo() throws InterruptedException, IOException {
	loginToFreelancer();
	DashboardPage dp = new DashboardPage(driver);
	dp.clickDashboardProfile();
	Thread.sleep(3000);
	dp.clickViewProfile();
	Thread.sleep(3000);
	AddQualifications aq= new AddQualifications(driver);
	aq.clickAddQualificationBtn();
	logger.info("Validation Start...");
	if(aq.saveBtnType().equals(false)) {
		logger.info("TC_AQ_002 Passed");
		Assert.assertTrue(true);
	}else {
		logger.warn("TC_AQ_002 Failed");
		captureScreen(driver,"addQualificationsWithEmptyInfo");
		Assert.fail();
	}
	
} 
	
	
	
	
}
