package Collection.ListPackage;

import java.util.LinkedList;

public class LinkedlistIteration {
	
	Node head;
	
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public void action() {
		
		Node n = head; //first node always head
		while(n!=null) { //untill the node is pointed to null or earth
			System.out.println(n.data); //print the data
			n = n.next; //then move to next node and save it in n again
		}
		
		
	/*LinkedList<String> ll = new LinkedList<String>();
	//add data to linked list
	ll.add("Sneha");
	ll.add("Kushwaha");
	ll.add(2, "Automation");
	ll.add(3, "Engineer");
	
	System.out.println(ll);
	
	ll.addFirst("Mrs");
	ll.addLast("Awsome");
	ll.get(3);
	ll.set(4, "Hai");
	ll.remove("Mrs");
	
	System.out.println("Clone" + ll.clone());
	System.out.println(ll);
	}*/
}
}