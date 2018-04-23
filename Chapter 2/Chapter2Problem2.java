/*
 * CS 1290
 * Homework 1: Cracking the Coding Interview
 * Problem 2.2
 * @author Matthew S Montoya
 * 
 */
public class Chapter2Problem2 {
	public static void main(String[] args) {
		/*Implement an algorithm to find the kth to last element of a singly linked list
		 */
		Node head = null;
		Node temp = null;
		int k_value = 0;
		int k = findKtoLastElement(head, temp, k_value);
		System.out.println("The position is: "+k);
	}	
	
	/*INITIAL QUESTIONS && Assumptions
	 * 
	 */

	private static int findKtoLastElement(Node head, Node temp, int k_value) {
		if(head==null)
			return -1;
		
		int pos = findKtoLastElement(head,temp, k_value);
		if(head.data==k_value) {
			System.out.println("The data is: "+head.data);
			return pos;
		}
		return -1;
	}
}