package Listeners;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestClassThree {
	
	@BeforeSuite
	 public void bsuite1(){
	    System.out.println("BeforeSuite1 method started"); 
	 }
	 
	 @Test
	 public void test1(){
	 System.out.println("Test1 Method started");
	 }
	 
	 @AfterSuite
	 public void asuite1(){
	    System.out.println("AfterSuite1 method started"); 
	 }
	

}
