package Collection.ListPackage;

public class stackLinkedList {
	Node head;
	
	class Node{
		int value;
		Node next;
	}
	
	stackLinkedList(){
		head = null;
	}

	//Create methods
	//1. push method
	public void push(int value) {
		Node extrahead = head; //head pehle ese hi ek extrahead naam ko point kiya
		head = new Node(); // yha head se linked node banaya (jisme value and pointer bahenge)
		head.value = value; //value ko dala usi head se linked value field ko
		head.next = extrahead; //fir o extrahead head jo tha usko next pointer se link kr diya -> 1st time null/earth hi hoga
	}
	
	public int pop() {
		if (head==null) {
			System.out.println("stack is empty");
		}
		int value = head.value; 
		head = head.next; //piche wale node ko point krega pehla linkage todke
		return value;
	}
	
	public static void printstacklist(Node head) {
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
	
}
