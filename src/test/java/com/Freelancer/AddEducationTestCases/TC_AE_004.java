package com.Freelancer.AddEducationTestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Freelancer.LoginTestCases.BaseClass;
import com.Freelancer.pageObjects.AddEducation;
import com.Freelancer.pageObjects.DashboardPage;
import com.Freelancer.pageObjects.LoginPage;

public class TC_AE_004 extends BaseClass{
	String noEduMsg = "No education information has been added.";

@Test(priority=1)
public void deleteEducation() throws InterruptedException, IOException {
	loginToFreelancer();
	DashboardPage dp = new DashboardPage(driver);
	dp.clickDashboardProfile();
	Thread.sleep(3000);
	dp.clickViewProfile();
	Thread.sleep(3000);
	AddEducation ae= new AddEducation(driver);
	ae.clickOptions();
	ae.clickDeleteBtn();
	ae.clickConfirmBtn();
	logger.info("Validation Start...");
	Thread.sleep(2000);
	if(ae.getNoEduMsg().contains(noEduMsg)) {
		logger.info("TC_AE_004 Passed");
		Assert.assertTrue(true);
	}else {
		logger.warn("TC_AE_004 Failed");
		captureScreen(driver,"deleteEducation");
		Assert.fail();
	}
	
} 
	
	
	
	
}
