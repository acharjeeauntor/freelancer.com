package com.Freelancer.AddEducationTestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Freelancer.LoginTestCases.BaseClass;
import com.Freelancer.pageObjects.AddEducation;
import com.Freelancer.pageObjects.DashboardPage;
import com.Freelancer.pageObjects.LoginPage;

public class TC_AE_002 extends BaseClass{
	String country = "Bangladesh";
	String university = "Daffodil International University";
	String startDate = "2017";
	String endDate = "2021";

@Test(priority=1)
public void addEducationWithEmptyDegree() throws InterruptedException, IOException {
	loginToFreelancer();
	DashboardPage dp = new DashboardPage(driver);
	dp.clickDashboardProfile();
	Thread.sleep(3000);
	dp.clickViewProfile();
	Thread.sleep(3000);
	AddEducation ae= new AddEducation(driver);
	ae.clickAddEduBtn();
	Thread.sleep(3000);
	ae.selectCountry(country);
	ae.selectUniversity(university);
	ae.selectStartYear(startDate);
	ae.selectEndYear(endDate);
	logger.info("Validation Start...");
	if(ae.saveBtnType().equals(false)) {
		logger.info("TC_AE_002 Passed");
		Assert.assertTrue(true);
	}else {
		logger.warn("TC_AE_002 Failed");
		captureScreen(driver,"addEducationWithEmptyDegree");
		Assert.fail();
	}
	
} 
	
	
	
	
}
