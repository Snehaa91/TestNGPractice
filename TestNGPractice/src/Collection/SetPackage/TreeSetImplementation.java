package Collection.SetPackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetImplementation {
	
	public void show() {
	TreeSet<Books> ts = new TreeSet<Books>();
	Books b1 = new Books("Okay", 250, 1991);
	Books b2 = new Books("NotOkay", 550, 1992);
	Books b3 = new Books("ItsOkay", 750, 1993);
	Books b4 = new Books("LetsBeOkay", 950, 1994);
	Books b5 = new Books("OkayisNew", 750, 1995);
	
	ts.add(b1);
	ts.add(b2);
	ts.add(b3);
	ts.add(b4);
	ts.add(b5);
	
	for(Books bb:ts) {
		System.out.println(bb.name+bb.cost+bb.year);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		/*
		 * ts.add("Sneha"); ts.add("Sneha"); ts.add("Shweta"); ts.add("Abhishek");
		 * ts.add("Priyanka"); ts.add("Kamla"); ts.add("Garima"); ts.add("Namita");
		 * 
		 * // Iterated in ascending order
		 * 
		 * Iterator<String> it = ts.iterator(); while(it.hasNext()) {
		 * System.out.println(it.next()); }
		 * 
		 * System.out.println("***************************");
		 * 
		 * //Iterated in descending order Iterator<String> it1 =
		 * ts.descendingIterator(); while(it1.hasNext()) {
		 * System.out.println(it1.next()); }
		 * 
		 * System.out.println("***************************");
		 * 
		 * //Retrieve and remove the highest & lowest value. By default its ascending
		 * order hence these methods shows results accordingly.
		 * //System.out.println(ts.pollFirst()); //System.out.println(ts.pollLast());
		 * 
		 * System.out.println("***************************");
		 * 
		 * //Use of all the NavigableSet Interface operations
		 * 
		 * System.out.println("Initial Set: " + ts); System.out.println("Reverse Set: "
		 * +ts.descendingSet()); System.out.println("Head set: "+ts.headSet("Shweta",
		 * true)); System.out.println("Tail Set: "+ ts.tailSet("Shweta", true));
		 * System.out.println("SubSet: "+ts.subSet("Kamla", true, "Priyanka", true));
		 * 
		 * System.out.println("***************************");
		 * 
		 * //Uae of all the SortedSet Interface operations
		 * 
		 * System.out.println("Initial Set: "+ts);
		 * System.out.println("Head set: "+ts.headSet("Shweta"));
		 * System.out.println("Tail Set: "+ ts.tailSet("Shweta"));
		 * System.out.println("SubSet: "+ts.subSet("Kamla", "Priyanka"));
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
	
	
	
	
	
	}

}
