package com.uptake.main;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class UptakeBlogPage {
	WebDriver driver;
	public UptakeBlogPage(WebDriver driver){
		this.driver=driver;
	}

	public void verifyBlogPage(){
		String expectedTitle = "Blog » Uptake";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("titles match");
	}
}
