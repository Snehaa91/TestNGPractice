package Listeners;

import org.testng.annotations.*;

@Listeners(value = ListenerFour.class)
public class TestClassFour {
	
	@Test
	public void firstmethod() {
		System.out.println("1st method");
	}

	@Test
	public void secondmethod() {
		System.out.println("2nd Method");
	}
	
	@BeforeTest
	public void btest() {
		System.out.println("Before Test method");
	}
	
	@AfterTest
	public void atest() {
		System.out.println("After Test method");
	}
	
}
