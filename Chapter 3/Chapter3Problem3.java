import java.util.Scanner;

/*
 * CS 1290
 * Homework 1: Cracking the Coding Interview
 * Problem 2.1
 * @author Matthew S Montoya
 * 
 */
public class Chapter3Problem3 {
	public static void main(String[] args) {
		/*Create SetOfStacks that allows for push, pop, and peek operations
		 * 
		 */
		
		Stack setOfStacks = new Stack();
		
		System.out.println("What is the number you would like to use in the stack?");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();

		setOfStacks.push(num);
		setOfStacks.peek();
		setOfStacks.pop();
	}
}



