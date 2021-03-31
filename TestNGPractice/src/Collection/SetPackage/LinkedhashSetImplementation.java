package Collection.SetPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class LinkedhashSetImplementation {
	
	public void display() {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(12);
		lhs.add(14);
		lhs.add(14);
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(25);
		arr.add(67);
		arr.add(67);
		arr.add(45);
		
		int[] ar = new int[4];
		ar[0]=23;
		ar[1]=3;
		ar[2]=2;
		ar[3]=2;
				
		for(Integer i1: lhs) {
			System.out.println(i1);
		}
		
		for(Integer ar1: arr) {
			System.out.println(ar1);
		}
		
		for(int a1:ar) {
			System.out.println(a1);
		}
	}

}
