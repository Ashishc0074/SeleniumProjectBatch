package Day11_Assertions;

import org.testng.annotations.Test;

public class GropuByDemo {

	@Test(groups = { "smoke" })
	public void tc1() {
		System.out.println("I am in tc1");
	}

	@Test(groups = { "sanity" })
	public void tc2() {
		System.out.println("I am in tc2");
	}

	@Test(groups = { "regression" })
	public void tc3() {
		System.out.println("I am in tc3");
	}

	@Test(groups = { "smoke", "sanity", "regression" })
	public void tc4() {
		System.out.println("I am in tc4");
	}

}
