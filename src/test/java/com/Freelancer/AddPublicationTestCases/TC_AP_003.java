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

public class TC_AP_003 extends BaseClass{
	String publication = "Cyber Security and Ethical hacking";


@Test(priority=1)
public void editPublication() throws InterruptedException, IOException {
	loginToFreelancer();
	DashboardPage dp = new DashboardPage(driver);
	dp.clickDashboardProfile();
	Thread.sleep(3000);
	dp.clickViewProfile();
	Thread.sleep(3000);
	AddPublication Ap = new AddPublication(driver);
	logger.info("Edit Publication Details");
	Ap.clickOptions();
	Ap.clickEditBtn();
	Ap.editPublicationName(publication);
	Ap.clickSaveBtn();
	Thread.sleep(2000);
	logger.info("Validation Start...");
	if(Ap.getSavedPublicationTitle().contains(publication)) {
		logger.info("TC_AP_003 Passed");
		Assert.assertTrue(true);
	}else {
		logger.warn("TC_AP_003 Failed");
		captureScreen(driver,"editPublication");
		Assert.fail();
	}
	
} 
	
	
	
	
}
