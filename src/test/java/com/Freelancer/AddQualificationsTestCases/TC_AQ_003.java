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

public class TC_AQ_003 extends BaseClass{
	String certificate = "Cyber Security & Ethical Hacking";


@Test(priority=1)
public void editQualification() throws InterruptedException, IOException {
	loginToFreelancer();
	DashboardPage dp = new DashboardPage(driver);
	dp.clickDashboardProfile();
	Thread.sleep(3000);
	dp.clickViewProfile();
	Thread.sleep(3000);
	AddQualifications aq= new AddQualifications(driver);
	aq.clickOptions();
	aq.clickEditBtn();
	logger.info("Edit Qualification Details");
	aq.setCertificate(certificate);
	aq.clickSaveBtn();
	Thread.sleep(2000);
	logger.info("Validation Start...");
	if(aq.getSavedCertificateName().contains(certificate)) {
		logger.info("TC_AQ_003 Passed");
		Assert.assertTrue(true);
	}else {
		logger.warn("TC_AQ_003 Failed");
		captureScreen(driver,"editQualification");
		Assert.fail();
	}
	
} 
	
	
	
	
}
