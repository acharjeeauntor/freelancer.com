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

public class TC_AQ_004 extends BaseClass{
	String noQuaMsg = "No qualifications have been added.";

@Test(priority=1)
public void deleteQualification() throws InterruptedException, IOException {
	loginToFreelancer();
	DashboardPage dp = new DashboardPage(driver);
	dp.clickDashboardProfile();
	Thread.sleep(3000);
	dp.clickViewProfile();
	Thread.sleep(3000);
	AddQualifications aq= new AddQualifications(driver);
	aq.clickOptions();
	aq.clickDeleteBtn();
	aq.clickConfirmBtn();
	logger.info("Validation Start...");
	Thread.sleep(2000);
	if(aq.getNoQuaMsg().contains(noQuaMsg)) {
		logger.info("TC_AQ_004 Passed");
		Assert.assertTrue(true);
	}else {
		logger.warn("TC_AQ_004 Failed");
		captureScreen(driver,"deleteQualification");
		Assert.fail();
	}
	
} 
	
	
	
	
}
