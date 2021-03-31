package Collection.ListPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class test1 implements Iterable<Object>{

	@Override
	public Iterator<Object> iterator() {
		return null;
	}

}

class test2 implements Iterator<Object>{

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public Object next() {
		return null;
	}
	
	ArrayList<Object> ar = new ArrayList<Object>();
	
	
}



