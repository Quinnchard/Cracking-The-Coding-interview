/*
 * CS 1290
 * Homework 1: Cracking the Coding Interview
 * Problem 3.5
 * @author Matthew S Montoya
 * 
 */
import java.util.*;

public class Chapter3Problem5 {
	private static Scanner input;
	public static void main(String args[]) {
		
		/*Write code to remove duplicates from an unsorted linked list
		 */
		
		Stack firstStack = new Stack();
		Stack secondStack = new Stack();
		input = new Scanner(System.in);
		System.out.println("How many numbers would you like in this stack?");
		int numberInStack = input.nextInt();
		int response;
		
		for(int i=0; i<numberInStack; i++) {
			System.out.println("Enter number "+i+1);
			response = input.nextInt();
			firstStack.push(response);        	
		}

		secondStack = arrange(firstStack);
		System.out.println("Numbers in order-- ");

		while (!Stack.isEmpty()) {
			System.out.print(Stack.pop()+" ");
		} 
	}

	
	public static Stack arrange(Stack firstStack) {
		Stack bufferStack = new Stack();
		while(!Stack.isEmpty()) {
			int temp = Stack.pop();
			while(!Stack.isEmpty() && bufferStack.peek() > temp) {
				firstStack.push(Stack.pop());
			}
			bufferStack.push(temp);
		}
		return bufferStack;
	}
}