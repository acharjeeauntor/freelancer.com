package com.Freelancer.AddEducationTestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Freelancer.LoginTestCases.BaseClass;
import com.Freelancer.pageObjects.AddEducation;
import com.Freelancer.pageObjects.DashboardPage;
import com.Freelancer.pageObjects.LoginPage;

public class TC_AE_003 extends BaseClass{
	String degree = "Computer Science & Engineering";


@Test(priority=1)
public void editEducation() throws InterruptedException, IOException {
	loginToFreelancer();
	DashboardPage dp = new DashboardPage(driver);
	dp.clickDashboardProfile();
	Thread.sleep(3000);
	dp.clickViewProfile();
	Thread.sleep(3000);
	AddEducation ae= new AddEducation(driver);
	ae.clickOptions();
	ae.clickEditBtn();
	ae.editDegree(degree);
	ae.clickSaveBtn();
	logger.info("Validation Start...");
	Thread.sleep(2000);
	if(ae.getSavedDegree().contains(degree)) {
		logger.info("TC_AE_003 Passed");
		Assert.assertTrue(true);
	}else {
		logger.warn("TC_AE_003 Failed");
		captureScreen(driver,"editEducation");
		Assert.fail();
	}
	
} 
	
	
	
	
}
