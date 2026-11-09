package Day11_Assertions;

import org.testng.annotations.Test;

public class ClassTwo {
	@Test
	public void tc2() throws InterruptedException {
		System.out.println("I am tc2");
		Thread.sleep(5000);
	}
}
