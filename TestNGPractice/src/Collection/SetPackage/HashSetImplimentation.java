package Collection.SetPackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class HashSetImplimentation{
          //HashSet class is used to create a collection that uses a hash table for storage.
	      //Unordered because doesn't maintain insertion order, no duplicate, non-synchronized, null values allowed,
	
	   public void show() {
		   HashSet<String> hs = new HashSet<String>();
		   hs.add("Sneha");
		   hs.add("Sneha");
		   hs.add("Abhishek");
		   hs.add("Shweta");
		   hs.add("Priyanka");
		   
		   //Using forEach method of Set
		   hs.forEach(names -> System.out.println(names));
		   
		   System.out.println("************************");
		   
		   //Using Iterator of Set
		   Iterator<String> it = hs.iterator();
		   while(it.hasNext()) {
			 System.out.println(it.next());
			}
		   
		   System.out.println("************************");
		   
		   //Using for loop
		   for(String str1: hs) {
			   System.out.println(str1.toString());
		   }
		   
		   System.out.println("************************");
		   
		   //Adding other collection data in HashSet
		   ArrayList<String> al = new ArrayList<String>();
		   al.add("Okay");
		   al.add("Fine");
		   
		   HashSet<String> st = new HashSet<String>(al);
		   st.add("Lets Do it");
		   
		   Iterator it2 = st.iterator();
		   while(it2.hasNext()) {
			   System.out.println(it2.next());
		   }
		   
		   System.out.println("************************");
		   
		   //Use Book class to add elements in HashSet
		   	   
		/*
		 * HashSet<BooksClass> hs2 = HashSet<BooksClass>(); BooksClass b1 = new
		 * BooksClass("Micel", 250, 1991); BooksClass b2 = new BooksClass("Nicel", 250,
		 * 1991); BooksClass b3 = new BooksClass("Ticel", 250, 1991);
		 * 
		 * hs2.add(b1); hs2.add(b2); hs2.add(b3);
		 * 
		 * for(BooksClass res5:hs2) { System.out.println(res5.name +" "+res5.cost+
		 * " "+res5.year); }
		 */
		   
		   
		   
		   
		   
		   
		   
		   
		   }
	
	
}
