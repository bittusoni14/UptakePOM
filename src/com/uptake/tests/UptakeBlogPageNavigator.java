package com.uptake.tests;

import org.testng.annotations.Test;

import com.uptake.main.UptakeBlogPage;
import com.uptake.main.UptakeHomePage;

public class UptakeBlogPageNavigator extends UptakeHomePageNavigator {
	
	@Test
	public void navigateToBlogPageAndVerify(){
		UptakeHomePage uptakeHomePage = new UptakeHomePage(driver);
		uptakeHomePage.clickBlog();
		UptakeBlogPage blogpage = new UptakeBlogPage(driver);
		blogpage.verifyBlogPage();
		}

	
}
