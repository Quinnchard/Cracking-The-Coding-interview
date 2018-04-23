import java.util.Scanner;

/*
 * CS 1290
 * Homework 1: Cracking the Coding Interview
 * Problem 2.1
 * @author Matthew S Montoya
 * 
 */
public class Chapter2Problem1 {
	public static void main(String[] args) {
		/*Write code to remove duplicates from an unsorted linked list
		 */

		removeDuplicates();
	}	
	
	/*INITIAL QUESTIONS && Assumptions
	 * 
	 */

	private static void removeDuplicates() {
		Node head = null;
		head.data = 5;
		head.next.data = 2;
		head.next.next.data = 13;
		head.next.next.next.data = 1;
		Node temp = null;
		
		while(head!=null &&head.next!=null) {
			temp = head;
			while(temp.next!=null) {
				if(head.data == temp.next.data)
					temp.next = temp.next.next;
				else
					temp = temp.next;
			}
		}
	}
}
