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

public class TC_AQ_001 extends BaseClass{
	String certificate = "Cyber Security";
	String organization = "Arena Web Security";
	String summary = "This is my first Cyber Security Traning.";
	String startYear = "2020";
	

@Test(priority=1)
public void addQualificationsWithValidInfo() throws InterruptedException, IOException {
	loginToFreelancer();
	DashboardPage dp = new DashboardPage(driver);
	dp.clickDashboardProfile();
	Thread.sleep(3000);
	dp.clickViewProfile();
	Thread.sleep(3000);
	AddQualifications aq= new AddQualifications(driver);
	aq.clickAddQualificationBtn();
	logger.info("providing Qualification Details");
	aq.setCertificate(certificate);
	aq.setOrganization(organization);
	aq.setSummary(summary);
	aq.selectStartYear(startYear);
	aq.clickSaveBtn();
	Thread.sleep(2000);
	logger.info("Validation Start...");
	if(aq.getSavedCertificateName().equals(certificate)) {
		logger.info("TC_AQ_001 Passed");
		Assert.assertTrue(true);
	}else {
		logger.warn("TC_AQ_001 Failed");
		captureScreen(driver,"addQualificationsWithValidInfo");
		Assert.fail();
	}
	
} 
	
	
	
	
}
