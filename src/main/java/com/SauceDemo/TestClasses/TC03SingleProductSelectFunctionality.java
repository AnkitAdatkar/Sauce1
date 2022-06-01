package com.SauceDemo.TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.PomClasses.HomePagePomClass;

public class TC03SingleProductSelectFunctionality extends TestBaseClass {
@Test()
public void selectproductfunctionality()
{
	HomePagePomClass hp = new HomePagePomClass(driver);
	hp.clickBagButton();
	System.out.println("click on bag button");

	System.out.println("Apply the validation");

    String actualResult = hp.getTextFromCartButton();

    String expectedResult ="1";

    Assert.assertEquals(actualResult, expectedResult);
    hp.clickMenuButton();
    System.out.println("click on menu button");
    
    hp.clickLogOutButton();
    System.out.println("click on logout button");
	}
}
