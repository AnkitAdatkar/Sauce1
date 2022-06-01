package com.SauceDemo.TestClasses;

import org.testng.annotations.Test;

import com.SauceDemo.PomClasses.HomePagePomClass;

public class TC04MultipleProductFunctionality extends TestBaseClass {
@Test
public void mulproductfunctionality()
{
	HomePagePomClass hp = new HomePagePomClass(driver);
	hp.addAllProduct();
	System.out.println("click on all products");
	
	
    //validation
System.out.println("apply the validation");

   String actualResult = hp.getTextFromCartButton();
   String expctedResult = "6";

if(expctedResult.equals(actualResult))
   {
System.out.println("test case is passed");
   }
else
   {
System.out.println("Test case is failed");
   }

}
}
