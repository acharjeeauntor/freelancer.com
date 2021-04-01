package com.Freelancer.LoginTestCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import com.Freelancer.pageObjects.LoginPage;
import com.Freelancer.utilities.ReadConfig;





public class BaseClass {

	static ReadConfig readConfig = new ReadConfig();

	public String baseUrl = readConfig.getApplicationUrl();
	public String email = readConfig.getEmail();
	public String password = readConfig.getPassword();
	

	public static WebDriver driver;
	public static Logger logger;

	@Parameters("browser")
	@BeforeClass
	public void setUp(String br) {
		logger = Logger.getLogger("Freelancer.com");
		PropertyConfigurator.configure("Log4j.properties");

		if (br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", readConfig.getChromePath());
			driver = new ChromeDriver();

		} else if (br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", readConfig.getFirefoxPath());
			driver = new FirefoxDriver();
		}else if(br.equals("ie")) {
			System.setProperty("webdriver.ie.driver", readConfig.getIePath());
			driver = new InternetExplorerDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
		logger.info("URL is opened");

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	
	
	public void captureScreen(WebDriver driver,String tname) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"/Screenshots/"+tname+".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot Taken");
		
		
	}
	
public void loginToFreelancer() throws IOException, InterruptedException {
	LoginPage lp = new LoginPage(driver);
	driver.navigate().to("https://www.freelancer.com/login");
	Thread.sleep(3000);
	logger.info("Providing UserName and Password...");
	lp.setEmail(email);
	lp.setPass(password);
	lp.clickLogin();
	logger.info("Go to Dashboard....");
	Thread.sleep(5000);
	
	}
	
	
	
	
	
	
	
	
	
	
	
	public boolean isAlertPresent() { // method to check alert is present or not
		try {
			driver.switchTo().alert();
			return true;
		}catch(NoAlertPresentException e) {
			return false;
		}
	}
	
	
	public String randomestring()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return(generatedstring);
	}
	
	public static String randomeNum() {
		String generatedString2 = RandomStringUtils.randomNumeric(4);
		return (generatedString2);
	}
	

}
