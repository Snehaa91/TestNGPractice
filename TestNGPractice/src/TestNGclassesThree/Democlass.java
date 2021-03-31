package TestNGclassesThree;

import org.testng.annotations.Test;

public class Democlass {
	
	@Test(dataProvider = "InputsRequired", dataProviderClass = DataProviderClass.class)
	public void sum(int val1, int val2) {
		int sumresult = val1+val2;
		System.out.println(sumresult);
	}
	
	@Test(dataProvider = "InputsRequired", dataProviderClass = DataProviderClass.class)
	public void multiply(int a, int b) {
		int productresult = a*b;
		System.out.println(productresult);
	}
	
	@Test(priority = 0)
	public void bisplay() {
		System.out.println("priority with 0");
	}
	
	@Test(priority = 1)
	public void ahow() {
		System.out.println("priority with 1");
	}

	@Test(enabled = false)
	public void ahow1() {
		System.out.println("priority with 1 of show1 method");
	}
	
	@Test
	public void concrete() {
		System.out.println("priority with no value - concrete");
	}
	
	@Test
	public void concrete1234() {
		System.out.println("priority with no value - 1234");
	}
	
}
