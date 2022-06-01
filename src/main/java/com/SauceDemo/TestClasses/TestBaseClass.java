package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


import com.SauceDemo.PomClasses.LoginPagePomClass;
import com.SauceDemo.Utility.ScreenShotClass;

public class TestBaseClass { 
	 public WebDriver driver;
	Logger log;
	@Parameters("browserName")
	
	 @BeforeMethod
	 
		public void SetUp(String browserName) throws IOException
		{
		 if(browserName.equals("chrome"))
		 {
			 
			System.setProperty("webdriver.chrome.driver","./drivers1/chromedriver.exe" );
	        driver = new ChromeDriver();
	         log=Logger.getLogger("Saucedemo");
	        PropertyConfigurator.configure("log4j.properties");
		 }
	 else
	 {
		 System.setProperty("webdriver.gecko.driver","./drivers1/geckodriver.exe" );
	        driver = new FirefoxDriver();
	 }
		
	     log.info("broswer is opened");
			driver.manage().window().maximize();
			log.info("broswer is maximized");
			
			driver.get("https://www.saucedemo.com/");
			log.info("URL is opened");
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			//login
			LoginPagePomClass lp=new LoginPagePomClass(driver);
			lp.sendUsername();
			System.out.println("User Name Entered");
			lp.sendPassword();
			System.out.println("Password Entered");
			
			lp.clickLoginButton();
			
			ScreenShotClass.takeScreenshot(driver);
			
			System.out.println("Click on Login Button");
		}
	 @AfterMethod
		public void TearDownMethod()
		{
		driver.quit();
		System.out.println("Login Successful");
		
		
		
	}
}
