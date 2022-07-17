package Pratice1;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Pratice2.Before_After_testsuit;

public class Test1 extends Before_After_testsuit{

	@Test
	public void function1() {
		System.out.println("Function 1 printed");
		
	}
	@Test
	public void function2() {
		Reporter.log("function 2 printed");
		System.out.println("function 2 printed");
		
	}
	@Test
	 public void function3() {
		Reporter.log("function 3 printed");
		 System.out.println("function 3 printed");
	 }
}
