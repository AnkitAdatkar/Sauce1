package com.SauceDemo.PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePomClass {
	  //webelement find
    //actions on Webelement
	
	//1. Here We declared WebDriver 
	
	private WebDriver driver;
	
	//we will not using this
//	WebElementuserName = driver.findElement(By.xpath("----"));
//	userName.sendKeys("standard_user");
	
	//annonations --> @ --> method only-functionality
	
	//selenium import
	
	//2.we will find elements by using @FindBY
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username;
	
	
	//actions on element -method
	public void sendUsername()
	{
		username.sendKeys("standard_user");
	}
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
public void sendPassword()
     {
	password.sendKeys("secret_sauce");
     }
	
	
	
@FindBy(xpath="//input[@id='login-button']")
	private WebElement loginButton;
	
	
	public void clickLoginButton()
	{
		loginButton.click();
	}
	
	//constructor Declaere
	public LoginPagePomClass (WebDriver driver)
	{
		//global=local
		this.driver=driver;
		
		//selenium class
		PageFactory.initElements(driver, this);
	}
}
