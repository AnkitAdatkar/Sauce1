package practice;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.SauceDemo.Utility.Listners.class)
public class Sample {
@Test
public void verifylogin()
{
	Assert.assertTrue(true);
	System.out.println("title is passed");
}
@Test
public void verifyTitle()
{
	Assert.assertTrue(false);
}
}
