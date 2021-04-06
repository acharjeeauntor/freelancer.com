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

public class TC_AExp_001 extends BaseClass{
	String title = "SQA";
	String company = "infixtech";
	String month = "May";
	String  year= "2020";
	String summary = "First Job";

@Test(priority=1)
public void addExprienceWithValidInfo() throws InterruptedException, IOException {
	loginToFreelancer();
	DashboardPage dp = new DashboardPage(driver);
	dp.clickDashboardProfile();
	Thread.sleep(3000);
	dp.clickViewProfile();
	Thread.sleep(3000);
	AddExperience aexp= new AddExperience(driver);
	aexp.clickAddExpBtn();
	logger.info("Providing Exprience Details...");
	aexp.setTitle(title);
	aexp.setCompany(company);
	aexp.selectStartMonth(month);
	aexp.selectStartYear(year);
	aexp.clickCheckBox();
	aexp.setSummary(summary);
	aexp.clickSaveBtn();
	logger.info("Validation Start...");
	if(aexp.getSavedTitle().contains(title)) {
		logger.info("TC_AExp_001 Passed");
		Assert.assertTrue(true);
	}else {
		logger.warn("TC_AExp_001 Failed");
		captureScreen(driver,"addExprienceWithValidInfo");
		Assert.fail();
	}
	
} 
	
	
	
	
}
