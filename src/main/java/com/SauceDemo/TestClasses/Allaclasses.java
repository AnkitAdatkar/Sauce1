package com.SauceDemo.TestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.PomClasses.HomePagePomClass;
import com.SauceDemo.Utility.ScreenShotClass;

public class Allaclasses extends TestBaseClass {
	@Test
	public void LoginFunctionalityTest()
	{
	String expectedTitle="Swag Labs";
	String actualTitle=driver.getTitle();
	
	System.out.println("Verify Test Cases");
	Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test(priority=1)
	public void LogOutFunctionality() throws IOException
	{
	HomePagePomClass hp = new HomePagePomClass(driver);
	hp.clickMenuButton();
	System.out.println("Clicked on menu button");

	hp.clickLogOutButton();
	System.out.println("Clicked on logout button");
	
	ScreenShotClass.takeScreenshot(driver);

	System.out.println("apply validation");

	        String expectedUrl = "https://www.saucedemo.com/";
	        String actualUrl = driver.getCurrentUrl();

	Assert.assertEquals(actualUrl, expectedUrl);
	}
	
	@Test(priority=2)
	public void selectproductfunctionality()
	{
		HomePagePomClass hp = new HomePagePomClass(driver);
		hp.clickBagButton();
		System.out.println("click on bag button");

		System.out.println("Apply the validation");

	    String actualResult = hp.getTextFromCartButton();

	    String expectedResult ="ADD TO CART";

	    Assert.assertEquals(actualResult, expectedResult);
		}
	@Test(priority=3)
	public void mulproductfunctionality()
	{
		HomePagePomClass hp = new HomePagePomClass(driver);
		hp.addAllProduct();
		System.out.println("click on all products");
		
		
	    //validation
	System.out.println("apply the validation");

	   String actualResult = hp.getTextFromCartButton();
	   String expctedResult = "6";

	    Assert.assertEquals(actualResult, expctedResult);

	}
	
	
}

