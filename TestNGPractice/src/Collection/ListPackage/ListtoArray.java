package Collection.ListPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListtoArray {
	
	public void show() {
	List<String> ll = new ArrayList<String>();
	ll.add("Sneha");
	ll.add("Kushwaha");
	ll.add("Good");
	ll.add("Girl");

	String[] arr = ll.toArray(new String[ll.size()]);
	System.out.println("Print Array "+ Arrays.toString(arr));
	System.out.println("Print List " + ll);
	}
	
	
	public void show1() {
		String[] arr1 = {"Priyanka","Kushwaha"};
		System.out.println(Arrays.toString(arr1));
		
		List<String> ll1 = new ArrayList<String>();
		for(String str: arr1) {
			ll1.add(str);
		}
		System.out.println("Printing Array to List" + ll1);
	}


}
