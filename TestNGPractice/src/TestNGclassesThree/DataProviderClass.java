package TestNGclassesThree;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
	
	@DataProvider (name = "InputsRequired")
	public Object[][] dpmethod(Method m){
		switch (m.getName()) {
		case "sum" :
		return new Object[][] {{40, 50}, {40, 50}};
		case "multiply" :
		return new Object[][] {{2, 50}, {4, 50}};	
		}
	return null;	
		  //2 round of execution
	}
	
	
	
	
	

}
