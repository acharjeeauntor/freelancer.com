package com.Freelancer.utilities;

import java.io.*;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
	public ReadConfig() {
		File src = new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}catch(Exception e) {
			System.out.println("Exception is "+e.getMessage());
		}
	}
	
	public String getApplicationUrl() {
		String url  = pro.getProperty("baseUrl");
		return url;
	}
	
	
	public String getChromePath() {
		String chromePath  = pro.getProperty("chromepath");
		return chromePath;
	}
	
	public String getFirefoxPath() {
		String firefoxPath  = pro.getProperty("firefoxpath");
		return firefoxPath;
	}
	
	public String getIePath() {
		String iePath  = pro.getProperty("iepath");
		return iePath;
	}
	
	public String getEmail() {
		String email  = pro.getProperty("email");
		return email;
	}
	
	public String getPassword() {
		String pass  = pro.getProperty("password");
		return pass;
	}
	
}
