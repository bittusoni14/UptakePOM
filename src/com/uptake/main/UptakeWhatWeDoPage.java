package com.uptake.main;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class UptakeWhatWeDoPage {
	WebDriver driver;
	public UptakeWhatWeDoPage(WebDriver driver){
		this.driver= driver;
	}
	public void verifyWhatWeDoPage(){
		String expectedTitle = "Uptake | What We Do";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

}
