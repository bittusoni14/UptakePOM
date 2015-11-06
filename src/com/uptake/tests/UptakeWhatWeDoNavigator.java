package com.uptake.tests;

import org.testng.annotations.Test;

import com.uptake.main.UptakeHomePage;
import com.uptake.main.UptakeWhatWeDoPage;

public class UptakeWhatWeDoNavigator extends UptakeHomePageNavigator {
	
	@Test
	public void navigateToWhatWeDoPageAndVerify(){
		UptakeHomePage uptakeHomePage = new UptakeHomePage(driver);
		uptakeHomePage.clickWhatWeDo();
		UptakeWhatWeDoPage whatwedopage = new UptakeWhatWeDoPage(driver);
		whatwedopage.verifyWhatWeDoPage();
	}
	

}
