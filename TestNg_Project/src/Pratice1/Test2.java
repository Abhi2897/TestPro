package Pratice1;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Test2 {
	@Test
	public void login() throws IOException{							
		Date currentdate = new Date();
		String screenshotname = currentdate.toString().replace(" ","_").replace(":", "-");
		
	String title = "Electronics, Cars, Fashion, Collectibles & More | eBay";
	String Buttontext = "Searching";
	System.setProperty("webdriver.chrome.driver", "D:\\ChromeDrivers\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://www.ebay.com");
	String tit = driver.getTitle();
	/*
	 * if(tit.
	 * equalsIgnoreCase("Electronics, Cars, Fashion, Collectibles & More | eBay")) {
	 * System.out.println("test case passed"); } else
	 * System.out.println("Tets case fsiled");
	 */
	Assert.assertEquals(title, tit);
	String buttonverifytext = driver.findElement(By.id("gh-btn")).getAttribute("value");
	System.out.println("button text is"+ buttonverifytext);
	if(Buttontext.equalsIgnoreCase(buttonverifytext)) {
		System.out.print("PASS");
	}else {
		System.out.println("this line is executing");
		 TakesScreenshot ts = (TakesScreenshot) driver;
		    File source = ts.getScreenshotAs(OutputType.FILE);
		  //	FileUtils.copyFile(source,new File(".//Screenshots//" +screenshotname + ".png"));
			

	}
	//driver.close();
	//Assert.assertEquals(Buttontext, buttonverifytext);
}
	
}
