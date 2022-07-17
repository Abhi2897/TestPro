package Pratice2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Before_After_testsuit {

	@BeforeSuite
	public void beforesuit() {
		System.out.println("hello");
	}
	@AfterClass
	public void aftersuit() {
		System.out.println("bye");
	}
}
