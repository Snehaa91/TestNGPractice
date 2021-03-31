package Collection.MapPackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class mapImplementation<E> {
	
	public void show() {
	Map<Integer,String> mp = new HashMap<Integer,String>();
	mp.put(100,"Amit");    
    mp.put(101,"Vijay");    
    mp.put(102,"Rahul"); 
    
    //Using Iterator and For Each loop
    Set st = mp.entrySet();
    Iterator<E> itr = st.iterator();
    while(itr.hasNext()) {
    	Map.Entry entry=(Map.Entry)itr.next();  
        System.out.println(entry.getKey()+" "+entry.getValue());  
    
    //using ComparingByKey
	mp.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
	
	}

	}
}
