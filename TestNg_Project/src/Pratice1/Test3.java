package Pratice1;

import org.testng.annotations.Test;

public class Test3 {

@Test(groups="a")
public void cat() {
		
		System.out.println("priting cat");
	}
	@Test(groups="b")
	public void ball() {
	
	System.out.println("priting ball");
}
	@Test(groups={"a","b"})
	public void dog() {
	
	System.out.println("priting dog1");
}
	@Test (groups = {"c","a"})
	public void bat() {
	
	System.out.println("priting bat1");
}
	@Test(groups = {"c","b"})
	public void tennis() {
	
	System.out.println("priting tennis1");
}
}

