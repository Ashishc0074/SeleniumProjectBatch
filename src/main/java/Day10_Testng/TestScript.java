package Day10_Testng;

import org.testng.annotations.Test;

public class TestScript {

	@Test(priority = 1)
	public void cmethod() {
		System.out.println("c method");
	}

	@Test(priority = 2)
	public void amethod() {
		System.out.println("a method");
	}

	@Test(priority = 3)
	public void bmethod() {
		System.out.println("b method");
	}

}
