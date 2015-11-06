package com.uptake.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class UptakeJoinUsPage {
	WebDriver driver;
	public UptakeJoinUsPage(WebDriver driver){
		this.driver=driver;
	}
	
	private static final String LOGBACKIN = "/descendant::div[@class='iCIMS_userMenuLink']/a";
	
	public void verifyJoinUsPage(){
		String expectedTitle = "Uptake | Join Us";
		String actualTitle = driver.getTitle();	
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	public void logBackIn(){
		driver.switchTo().defaultContent();
		driver.switchTo().frame("icims_content_iframe");
		driver.findElement(By.xpath(LOGBACKIN)).click();
	}

}
