/*
 * CS 1290
 * Homework 1: Cracking the Coding Interview
 * Problem 2,5
 * @author Matthew S Montoya
 * 
 */
import java.util.*;

public class Chapter2Problem5 {
	private static Scanner input;
	public static void main(String args[]) {
		
		/*Add elements from a linked list
		 */
		Node head = null;
		head.data = 5;
		head.next.data = 2;
		head.next.next.data = 13;
		head.next.next.next.data = 1;
		
		Node second = null;
		head.data = 7;
		head.next.data = 9;
		head.next.next.data = 27;
		head.next.next.next.data = 5;
		int carry =0;
		
		addInReverse(head, second, carry);
	}
	
	private static Node addInReverse(Node head, Node head2, int carry) {
		if(head==null && head2==null && carry==0)
			return null;
		Node result = null;
		int value = carry;
		if(head!=null)
			value+=carry;
		if(head2!=null)
			value+=head2.data;
		result.data = value%10;
		if(head!=null||head2!=null) {
			Node addMore = addInReverse(head==null?null:head.next, head2==null?null:head.next, value>=10?1:0);
			result.setNext(addMore);
		}
		
		return result;
	}
}