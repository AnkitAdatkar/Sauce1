package com.SauceDemo.TestClasses;

import org.testng.annotations.Test;


public class TC01LoginFunctionality extends TestBaseClass {
    
			@Test
			public void LoginFunctionalityTest()
			{
			String expectedTitle="Swag Labs";
			String actualTitle=driver.getTitle();
			
			System.out.println("Verify Test Cases");
			if(expectedTitle.equals(actualTitle))
			{
				System.out.println("Test Case is Passed");
			}
			else
			{
				System.out.println("Test Case is passed");
			}
			}
			
}
