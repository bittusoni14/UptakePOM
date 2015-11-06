package com.uptake.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

//It can be also called careers page
public class UptakeLogBackInPage {

	WebDriver driver;
	public UptakeLogBackInPage(WebDriver driver){
		this.driver = driver;
	}
	private static final String LOGINNAME = "//input[@name='css_loginName']";	
	private static final String LOGINPASSWORD = "//input[@name='css_password']";
	private static final String LOGBACKIN = "//input[@name='css_loginButton']";
	
	
	public void verifyCareersPageTitle(){
		String expectedTitle = "Careers Center - Resume Submission";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		} 	
	public void login(String UserName, String Password){
		driver.switchTo().defaultContent();
		driver.switchTo().frame("icims_content_iframe");
		driver.findElement(By.xpath(LOGINNAME)).sendKeys(UserName);            
		driver.findElement(By.xpath(LOGINPASSWORD)).sendKeys(Password);
		driver.findElement(By.xpath(LOGBACKIN)).click();
		}
 
}
