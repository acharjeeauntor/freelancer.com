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

public class TC_AExp_003 extends BaseClass{
	String title = "QE";


@Test(priority=1)
public void editExprience() throws InterruptedException, IOException {
	loginToFreelancer();
	DashboardPage dp = new DashboardPage(driver);
	dp.clickDashboardProfile();
	Thread.sleep(3000);
	dp.clickViewProfile();
	Thread.sleep(5000);
	AddExperience aexp= new AddExperience(driver);
	aexp.clickOptions();
	aexp.clickEditBtn();
	logger.info("Providing Exprience Details...");
	aexp.editTitle(title);
	aexp.clickSaveBtn();
	logger.info("Validation Start...");
	Thread.sleep(2000);
	if(aexp.getSavedTitle().contains(title)) {
		logger.info("TC_AExp_003 Passed");
		Assert.assertTrue(true);
	}else {
		logger.warn("TC_AExp_003 Failed");
		captureScreen(driver,"editExprience");
		Assert.fail();
	}
	
} 
	
	
	
	
}
