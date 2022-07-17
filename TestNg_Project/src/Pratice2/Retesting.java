package Pratice2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Retesting {

	@Test(retryAnalyzer = Retesting_failed_TC.class)
	 public void test2() {
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.ebay.com");
		    Assert.fail();
	 }

}
