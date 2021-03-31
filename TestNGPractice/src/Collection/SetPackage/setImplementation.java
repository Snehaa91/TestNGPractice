package Collection.SetPackage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class setImplementation {
	
	public void show() {
		Set<Integer> ss1 = new HashSet<Integer>();
		ss1.add(20);
		ss1.add(20);
		ss1.add(30);
		ss1.add(40);
		ss1.add(50);
		System.out.println(ss1); //it will print only once - because no duplication are allowed
		
		Set<Integer> ss2 = new HashSet<Integer>();
		ss2.add(60);
		ss2.add(70);
		ss2.add(30);
		ss2.add(20);
		ss2.add(80);
		ss2.add(90);
		System.out.println(ss2);
		
		Set<Integer> ssfinal = new HashSet<Integer>(ss1);
		System.out.println(ssfinal.addAll(ss2)); //Union check
		System.out.println(ssfinal);
		System.out.println(ssfinal.removeAll(ss2)); //Difference check
		System.out.println(ssfinal);
		System.out.println(ssfinal.retainAll(ss2)); //Intersection check
		System.out.println(ssfinal);
		
	}

}
