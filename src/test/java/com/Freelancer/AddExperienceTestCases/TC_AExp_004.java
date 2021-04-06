package com.Freelancer.AddExperienceTestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Freelancer.LoginTestCases.BaseClass;
import com.Freelancer.pageObjects.AddEducation;
import com.Freelancer.pageObjects.AddExperience;
import com.Freelancer.pageObjects.DashboardPage;
import com.Freelancer.pageObjects.LoginPage;

public class TC_AExp_004 extends BaseClass{
	String noExpMsg = "No experiences have been added.";

@Test(priority=1)
public void deleteExperience() throws InterruptedException, IOException {
	loginToFreelancer();
	DashboardPage dp = new DashboardPage(driver);
	dp.clickDashboardProfile();
	Thread.sleep(3000);
	dp.clickViewProfile();
	Thread.sleep(3000);
	AddExperience aexp= new AddExperience(driver);
	aexp.clickOptions();
	aexp.clickDeleteBtn();
	aexp.clickConfirmBtn();
	logger.info("Validation Start...");
	Thread.sleep(2000);
	if(aexp.getNoExpMsg().contains(noExpMsg)) {
		logger.info("TC_AExp_004 Passed");
		Assert.assertTrue(true);
	}else {
		logger.warn("TC_AExp_004 Failed");
		captureScreen(driver,"deleteExperience");
		Assert.fail();
	}
	
} 
	
	
	
	
}
