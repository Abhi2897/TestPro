package Pratice1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class Working_Links {
	String message;

	@Test
	public void OpenLink() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://web.whatsapp.com/");
		Thread.sleep(10000);
		driver.findElement(
				By.xpath("//*[@id=\"pane-side\"]/div[1]/div/div/div[8]/div/div/div[2]/div[1]/div[1]/span/span"))
				.click();
		sendmessage();
		System.out.println("print the text" + sendmessage());
		driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div[2]")).sendKeys(message);
		driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div[3]/button/span")).click();
	}

	public String sendmessage() {
		Scanner sc = new Scanner(System.in);
		message = sc.next();
		return message;

	}
}
