package com.SauceDemo.TestClasses;

import java.io.IOException;
import org.testng.annotations.Test;

import com.SauceDemo.PomClasses.HomePagePomClass;
import com.SauceDemo.Utility.ScreenShotClass;

public class TC02LogOutFunctionality extends TestBaseClass {
	
		//homePage
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

		if(expectedUrl.equals(actualUrl))
		        {
			System.out.println("test case is passed");
		        }
		else
		        {
			System.out.println("test case if failed");
		        }
		}
		
		

 }


