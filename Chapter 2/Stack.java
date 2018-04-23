public class Stack {
	private static Node top;
	private static int count;
	
	public Stack() {
		top = null;
		count = 0;
	}
	
	public static boolean isEmpty(){
		return (top ==null);
	}
	
	public void push(int newItem){
		top = new Node(newItem, top);
		count++;
	}
	
	public static int pop(){
		if (isEmpty()){
			System.out.println("Incomplete expression");
			return -1;
		}else{
			Node temp = top;
			top = top.next;
			count--;
			return temp.data;
		}
	}
	
	void popAll(){
		top = null;
		count = 0;
	}
	
	public int peek(){
		if (isEmpty()){
			System.out.println("Trying to peek when stack is empty");
			return -1;
		}else{
			return top.data;
		}
	}
	
	public int stackSize(){
		return count;
	}
}