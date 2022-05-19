package com.Utilities;

import com.Pojo.BaseClass;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListenersTest extends BaseClass implements ITestListener{

	public void onTestStart(ITestResult Result) {
		System.out.println("Test get Started" +Result.getName());
	}
	
	public void onTestSuccess(ITestResult Result) {
		System.out.println(Result.getName()+"Test get Passed");
	}
	
	public void onTestFail(ITestResult Result) {
		try {
			Screenshot.getScreenshot(driver, Result.getName());
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println(Result.getName() + "Test get Failed");
	}
	
	public void onTestSkip(ITestResult Result) {
		System.out.println(Result.getName()+"Test get Skipped");
	}
}
