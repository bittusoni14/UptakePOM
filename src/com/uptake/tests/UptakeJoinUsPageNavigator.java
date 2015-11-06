package com.uptake.tests;

import org.testng.annotations.Test;

import com.uptake.main.UptakeJoinUsPage;
import com.uptake.main.UptakeHomePage;

public class UptakeJoinUsPageNavigator extends UptakeHomePageNavigator{
		
	@Test
	public void navigateToJoinUsPageAndVerify(){
		UptakeHomePage uptakeHomePage = new UptakeHomePage(driver);
		uptakeHomePage.clickJoinUs();
		UptakeJoinUsPage joinuspage = new UptakeJoinUsPage(driver);
		joinuspage.verifyJoinUsPage();
		}
}
