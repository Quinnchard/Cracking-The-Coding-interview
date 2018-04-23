import java.util.Scanner;

/*
 * CS 1290
 * Homework 1: Cracking the Coding Interview
 * Problem 1.3
 * @author Matthew S Montoya
 * 
 */
public class Chapter1Problem3 {
	private static Scanner input;
	public static void main(String[] args) {
		/*URL-ify: Write a method to replace all spaces in a string with "%20."
		 * Assume that the String has sufficient space at the end to hold the additional characters.
		 * Assume you're given the true length of the String (i.e. includes spaces)
		 */
		
		input = new Scanner(System.in);
		System.out.println("Enter a String (more than one word):");
		String str = input.nextLine();
		String url = replaceSpaces(str);
		System.out.println("The original String is: "+str);
		System.out.println("The new String is: "+url);
	}
	
	/*INITIAL QUESTIONS && Assumptions
	 * Can I use Java's built-in libraries? Yes
	 * 
	 */

	private static String replaceSpaces(String str) {
		return str.replaceAll(" ","%20");		
	}
}
