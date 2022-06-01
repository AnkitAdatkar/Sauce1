package com.SauceDemo.Utility;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners implements ITestListener {
public void onStart(ITestResult result)
{
	System.out.println("Test execution started");
}
public void onFinish(ITestResult result)
{
	System.out.println("test execution finish");
}
public void onTestSuccess(ITestResult result)
{
	System.out.println("test case is successful");
}
public void onTestFailure(ITestResult result)
{
	System.out.println("test case failed hence taking screenshot");
}
public void onTestStart(ITestResult result)
{
	System.out.println("sanity test started");
}
}
