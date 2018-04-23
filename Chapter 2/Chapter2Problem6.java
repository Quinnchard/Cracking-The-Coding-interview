/*
 * CS 1290
 * Homework 1: Cracking the Coding Interview
 * Problem 2.6
 * @author Matthew S Montoya
 * 
 */
import java.util.*;

public class Chapter2Problem6 {
	private static Scanner input;
	public static void main(String args[]) {

		/*Determine if a linked list is a pallindrone
		 */
		Node head = null;
		head.data = 5;
		head.next.data = 2;
		head.next.next.data = 13;
		head.next.next.next.data = 1;


		isPallindrome(head);
	}

	private static boolean isPallindrome(Node head) {
		Node reversed = reverseAndClone(head);
		return isEqual(head, reversed);
	}

	private static Node reverseAndClone(Node head) {
		Node node = null;
		while(head!=null) {
			Node n = new Node(head.data);
			n.next = head;
			head = n;
			head = node.next;
		}
		return node;
	}

	private static boolean isEqual(Node one, Node two) {
		while(one!=null && two!=null) {
			if(one.data != two.data)
				return false;
			one = one.next;
			two = two.next;
		}
		return(one == null || two==null);
	}
}