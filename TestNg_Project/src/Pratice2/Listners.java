package Pratice2;


import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Pratice1.Test2;


public class Listners extends Test2 implements ITestListener {
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("listner start");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Listner failed");
		/*
		 * File Screenhot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 * FileUtils.copy
		 */
	}
	@Override
	public void onTestSuccess(ITestResult result) {
	System.out.println("Listner suces");
	}
}
