package Collection.ListPackage;

import java.util.Enumeration;
import java.util.Vector;

public class TwoDVector {
	
	public void show() {
		Vector<Integer> vec1 = new Vector<Integer>();
		vec1.add(20);
		vec1.add(30);
		vec1.add(40);
		vec1.add(50);
		
		Enumeration e = vec1.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		/*Vector obj = new Vector();
		obj.add(vec1);
		
		for(int i = 0; i<vec1.size();i++) {
			Integer idata = (Integer)((Vector) obj.get(0)).get(i);
			System.out.println(idata);*/
		
		
	}

}
