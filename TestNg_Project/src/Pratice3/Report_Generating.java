package Pratice3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class Report_Generating {
	
	public static void main (String[]args){
		
		ExtentHtmlReporter ehr = new ExtentHtmlReporter("report.html");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(ehr);
		ExtentTest test = extent.createTest("Google test report");
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDrivers\\chromedriver.exe");
		test.info("Chrome driver window opened");
		ChromeDriver driver = new ChromeDriver();
		
		test.info("Navigate to google");
		driver.get("http://www.google.com");
		test.log(Status.PASS, "google chrome is opened");
		driver.findElement(By.name("q")).sendKeys("Automation testing");
		test.pass("typed automation testing");
		driver.findElement(By.name("btnK")).click();
		test.log(Status.INFO, "done");
		driver.close();
		driver.quit();
		test.pass("testcase passed");

		extent.flush();
	}

}
