package com.uptake.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class UptakeHomePage {
	
	WebDriver driver;
	public UptakeHomePage(WebDriver driver){
		this.driver=driver;
	}
	private static final String WHATWEDO = "//a[contains(@href,'what-we-do')]"; 
	private static final String JOINUS = "//a[contains(@href,'https://careers-uptake.icims.com/job')]";
	private static final String BLOG = "//a[contains(@href,'ourblog')]";
	
	public void verifyHomePageTitle(){
	String expectedTitle = "Uptake | Home";
	String actualTitle = driver.getTitle();
	Assert.assertEquals(actualTitle, expectedTitle);
	}

	public void clickWhatWeDo(){
		driver.findElement(By.xpath(WHATWEDO)).click();
	}
	
	public void clickJoinUs(){
		driver.findElement(By.xpath(JOINUS)).click();
	}
	
	public void clickBlog(){
		driver.findElement(By.xpath(BLOG)).click();
	}

}
