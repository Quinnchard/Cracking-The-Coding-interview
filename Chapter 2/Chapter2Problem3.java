/*
 * CS 1290
 * Homework 1: Cracking the Coding Interview
 * Problem 2.3
 * @author Matthew S Montoya
 * 
 */
public class Chapter2Problem3 {
	private static Node head;

	public static void main(String[] args) {
		head = null;
		head.data =6;
		head.next.data = 7;
		head.next.next.data =8;
		boolean canBeDeleted = deleteNode(head);
		if(canBeDeleted)
			System.out.println("Deletion is possible ");
		else
			System.out.println("Deletion will failed.");	
	}	
	
	/*INITIAL QUESTIONS && Assumptions
	 * Middle means any element that is not the first element
	 * 
	 */

	private static boolean deleteNode(Node node) {
		if(node==null || node.next==null)
			return false;
		node.data=node.next.data;
		node.next=node.next.next;
		return true;
	}
}