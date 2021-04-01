package com.Freelancer.AddEducationTestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Freelancer.LoginTestCases.BaseClass;
import com.Freelancer.pageObjects.AddEducation;
import com.Freelancer.pageObjects.DashboardPage;
import com.Freelancer.pageObjects.LoginPage;

public class TC_AE_001 extends BaseClass{
	String country = "Bangladesh";
	String university = "Daffodil International University";
	String degree = "Bsc. in CSE";
	String startDate = "2017";
	String endDate = "2021";

@Test(priority=1)
public void addEducation() throws InterruptedException, IOException {
	loginToFreelancer();
	DashboardPage dp = new DashboardPage(driver);
	dp.clickDashboardProfile();
	Thread.sleep(3000);
	dp.clickViewProfile();
	Thread.sleep(3000);
	AddEducation ae= new AddEducation(driver);
	ae.clickAddEduBtn();
	ae.selectCountry(country);
	ae.selectUniversity(university);
	ae.setDegree(degree);
	ae.selectStartYear(startDate);
	ae.selectEndYear(endDate);
	ae.clickSaveBtn();
	System.out.println(ae.getSavedDegree());
	if(ae.getSavedDegree().contains(degree)) {
		logger.info("TC_AE_001 Pass");
		Assert.assertTrue(true);
	}else {
		logger.warn("TC_AE_001 Fail");
		captureScreen(driver,"addEducation");
		Assert.fail();
	}
	
} 
	
	
	
	
}
