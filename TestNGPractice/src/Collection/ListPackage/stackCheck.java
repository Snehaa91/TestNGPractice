package Collection.ListPackage;

public class stackCheck { //Stack implementation using Array
	
	int size;
	int arr[];
	int top;
	
	stackCheck(int size){
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
		}
	
	//Check if Stack is empty
	public boolean isEmpty() {
		return (top==-1);
	}
	
	//Check if Stack is full
	public boolean isFull() {
	    return (size-1==top);
	}
	
	//Write peek method which will help you to return the top value
	public int peek() {
		if(!this.isEmpty()) {
			return arr[top];
		}
		System.out.println("Stack is empty");
		return -1;
	}
	
	//Write push method which will help to add the element in the stack
	public void push(int element) {
		if(!this.isFull()) {
			top++;
			arr[top] = element;
			System.out.println("Element added:" +element);
		}
		else {
			System.out.println("Stack is full");
		}
	}

	//Write pop method which will retrieve the top element and reduce the size to -1
	public int pop() {
		if(!isEmpty()) {
			int returnedelement = top;
			top--;
			System.out.println("Popped element" + arr[returnedelement]);
			return arr[returnedelement];
		}
		else {
			System.out.println("Stack is empty");
			return -1;
		}
	}
}






