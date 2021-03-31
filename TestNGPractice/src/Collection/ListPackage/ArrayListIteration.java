package Collection.ListPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public void array1() {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Sneha");
		ar.add("Kushwaha");
		ar.add("Good");
		ar.add("Girl");
		
		System.out.println(ar.get(3));
		System.out.println(ar.size());
		
		Collections.sort(ar); //here Collections class is used to sort the list
		
		//Way of Iterating the ArrayList
		
		//1. Using for loop
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println("*************************");
		
		//2. Using for-each loop
		for(String arrayresult:ar) {
			System.out.println(arrayresult);
		}
		
		System.out.println("*************************");
		
		//3. Using Iterator 
		Iterator<String> it = ar.iterator();
		while(it.hasNext()) {
			String result = it.next();
			System.out.println(result);
		}
		
		System.out.println("*************************");
		
		//4. Using Iterator -> foreachRemaining loop and lamdba expression in Java 8
		it.forEachRemaining(show -> {
			System.out.println(show);
		});
		
		System.out.println("*************************");
		
		//5. Using Iterator -> ListIterator (both direction hence trying to print in backward direction
		ListIterator<String> lt = ar.listIterator(ar.size());		
		while(lt.hasPrevious()) {
			String show1 = lt.previous();
			System.out.println(show1);
		
		}
		
		System.out.println("*************************");
		
		//6. Using lambda expression
		ar.forEach(show -> {
			System.out.println(show);
		});
		
		System.out.println("*************************");
		
		//ar.removeIf(str-> str.contains("Sneha"));
		//ar.clear();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		
		Employee e1 = new Employee("Priyanka",21,"MechanicalEngineer");
		Employee e2 = new Employee("Shweta", 24, "MedicalCOder");
		
		ArrayList<Employee> ar2 = new ArrayList<Employee>();
		ar2.add(e1);
		ar2.add(e2);
		
		//User iterator to traverse the values.
		Iterator<Employee> it = ar2.iterator();
	    while(it.hasNext()) {
	    	Employee emp = it.next();
	    	System.out.println(emp.name);
	    	System.out.println(emp.age);
	    	System.out.println(emp.dept);
	    }
	    
	    ArrayList<String> ar1 = new ArrayList<String>();
	    ar1.add("23");
	    ar1.add("34");
	    ar1.add("50");
	    ar1.add("Good");
	    
	    //addAll method
	    System.out.println(ar.addAll(ar1));  //return boolean value
	    for(int i=0; i<ar.size();i++) {
	    	System.out.println(ar.get(i));
	    }
	    
	    //removeAll method
	    System.out.println(ar.removeAll(ar1));  //return boolean value
	    for(int i=0; i<ar.size();i++) {
	    	System.out.println(ar.get(i));
	    }
	    
	    //removeIf method
	     ar
	    
	    //retainAll method
	    System.out.println(ar.retainAll(ar1));
	    for(int i=0; i<ar.size();i++) {
	    	System.out.println(ar.get(i));
	    }
	}
	
*/
	
	
	
	
	}}