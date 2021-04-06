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

public class TC_AExp_002 extends BaseClass{

@Test(priority=1)
public void addExprienceWithEmptyInput() throws InterruptedException, IOException {
	loginToFreelancer();
	DashboardPage dp = new DashboardPage(driver);
	dp.clickDashboardProfile();
	Thread.sleep(3000);
	dp.clickViewProfile();
	Thread.sleep(3000);
	AddExperience aexp= new AddExperience(driver);
	aexp.clickAddExpBtn();
	logger.info("Validation Start...");
	Thread.sleep(2000);
	if(aexp.saveBtnType().equals(false)) {
		logger.info("TC_AExp_002 Passed");
		Assert.assertTrue(true);
	}else {
		logger.warn("TC_AExp_002 Failed");
		captureScreen(driver,"addExprienceWithEmptyInput");
		Assert.fail();
	}
	
} 
	
	
	
	
}
