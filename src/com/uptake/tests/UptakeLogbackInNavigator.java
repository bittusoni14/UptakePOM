package com.uptake.tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.uptake.main.UptakeHomePage;
import com.uptake.main.UptakeJoinUsPage;
import com.uptake.main.UptakeLogBackInPage;

//can be also called careerPageNavigator
public class UptakeLogbackInNavigator extends UptakeHomePageNavigator{
	
@Test
public void login(){
	UptakeHomePage uptakeHomePage = new UptakeHomePage(driver);
	uptakeHomePage.clickJoinUs();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	UptakeJoinUsPage uptakejoinuspage = new UptakeJoinUsPage(driver);
	uptakejoinuspage.logBackIn();
	UptakeLogBackInPage logbackinpage = new UptakeLogBackInPage(driver);
	logbackinpage.login("abhissoni8701" , "Password1");
	}
}
