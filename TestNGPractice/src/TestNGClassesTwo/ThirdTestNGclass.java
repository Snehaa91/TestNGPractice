package TestNGClassesTwo;

import org.testng.annotations.Test;

public class ThirdTestNGclass {
	

	@Test (priority=0, groups= {"Run1"})
	  public void mind() {
		  System.out.println("mind method");
	  }
	

	@Test (priority=1)
	  public void mindpower() {
		  System.out.println("mindpower method");
	  }

}
