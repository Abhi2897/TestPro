package Pratice3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Report_Gen_TestNg {
	ExtentHtmlReporter ehr;
	ExtentReports extent;
	ExtentTest extenttest;
	ChromeDriver driver;

	@BeforeTest
	public void startup() {

		ehr = new ExtentHtmlReporter("report.html");
		extent = new ExtentReports();
		extent.attachReporter(ehr);
		extenttest = extent.createTest("Google_report");
	}
	@Test
	public void test() {

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDrivers\\chromedriver.exe");
		extenttest.info("Chrome driver window opened");
		driver = new ChromeDriver();
		extenttest.info("Google chrome is opening");
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Automation testing");
		driver.findElement(By.name("btnK")).click();

	}
	@AfterTest
	public void teardown() {
			extent.flush();
			driver.close();
			driver.quit();
	}
}
