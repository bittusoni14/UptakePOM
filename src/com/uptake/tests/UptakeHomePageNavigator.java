package com.uptake.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import com.uptake.main.UptakeHomePage;

public class UptakeHomePageNavigator {
	
	private static final String URL = "http://uptake.com";
	WebDriver driver;
	
	@BeforeTest
	public void setbaseURL(){
	driver = new FirefoxDriver();		 
    driver.get(URL);
     	}
	@BeforeMethod
	public void verifyHomePage(){
	UptakeHomePage uptakeHomePage = new UptakeHomePage(driver);
	uptakeHomePage.verifyHomePageTitle();
	}

	@AfterTest
	public void endSession(){
	driver.quit();
	}
}
