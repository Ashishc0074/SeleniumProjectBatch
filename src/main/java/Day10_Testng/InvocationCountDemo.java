package Day10_Testng;

import org.testng.annotations.Test;

public class InvocationCountDemo {

	@Test(invocationCount = 7)
	public void test() {
		System.out.println("I am test Demo");
	}

}
