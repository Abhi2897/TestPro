package Pratice2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven_Test {

	@DataProvider (name ="testing")
	public Object[][] testdata(){
		
		return new Object[][] {{"coolabhishek.vns@gmail.com","8563884990a"},
				{"coolabhishej@hgmail.com","8547598566b"},
				{"coolabhishek.vns@gmail.com","8563884990@@abhishek"}
		};
	}
	@Test(dataProvider = "testing")
public void hitUrl(String id, String pass) {
	System.setProperty("webdriver.chrome.driver", "D:\\ChromeDrivers\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	//driver.get("https://www.instagram.com/accounts/login/?hl=en");
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys(id);
	driver.findElement(By.id("pass")).sendKeys(pass);
	//driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();
	driver.close();
	}
	
}
