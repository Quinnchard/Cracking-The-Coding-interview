import java.util.HashSet;
import java.util.Scanner;

/*
 * CS 1290
 * Homework 1: Cracking the Coding Interview
 * Problem 1.1
 * @author Matthew S Montoya
 * 
 */
public class Chapter1Problem1 {
	private static Scanner input;

	public static void main(String[] args) {
		/*Is Unique: Implement an algorithm to determine if a string has all unique characters
		 */
		
		input = new Scanner(System.in);
		System.out.println("Enter a word:");
		String str = input.nextLine();
		boolean isUnique = isUnique(str);	//with data structures
		System.out.println("The String is unique: "+isUnique);
	}
	
	/*INITIAL QUESTIONS && Assumptions
	 * Do spaces count? I will assume no
	 * Do uppercase/lowercase letters count as duplicates? I will assume no
	 * 
	 */

	private static boolean isUnique(String str) {

		int originalStrengthLength = str.length();
		System.out.println(str);
		
		//lets use a HashSet for identifying unique Strings
		HashSet <String> set = new HashSet <String>();
		for(String str2: set)
			set.add(str2);
		int uniqueStringLength = set.size();
		
		//return if the string sizes are the same
		return (originalStrengthLength == uniqueStringLength);	
	}
}
