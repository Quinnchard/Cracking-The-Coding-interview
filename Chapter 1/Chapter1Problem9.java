import java.util.Scanner;

/*
 * CS 1290
 * Homework 1: Cracking the Coding Interview
 * Problem 1.3
 * @author Matthew S Montoya
 * 
 */
public class Chapter1Problem9 {
	private static Scanner input;
	private static Scanner input2;	

	public static void main(String[] args) {
		/*String Rotation: Assume a method isSubstring() exists which checks if one word is a substring of another
		 * Given 2 Strings, s1,s2, write code to check if s2 is a rotation of s1, using ONLY one call to isSubstring
		 * E.g. "waterbottle" is a rotation of "erbottlewat"
		 * 
		 */

		stringRotation();
	}

	/*INITIAL QUESTIONS && Assumptions
	 * Does uppercase/lowercase matter? I will assume NO
	 * Do we have to take spaces into consideration? I will assume YES; can ONLY be words
	 * We're given 2 strings. For the sake of this problem, I will asusme the strings will be user input
	 */

	private static void stringRotation() {
		String str = getWordOne();
		String str2 = getWordTwo();
		boolean isRotation = checkRotation(str, str2);

	}

	private static String getWordOne() {
		input = new Scanner(System.in);
		System.out.println("Enter a word:");
		String str = input.nextLine();
		if(str.contains(" ")) {
			System.out.println("We can only use a single word; no spaces allowed");
			getWordOne();
		}
		return str.toLowerCase();
	}

	private static String getWordTwo() {
		input2 = new Scanner(System.in);
		System.out.println("Enter the second word:");
		String str = input2.nextLine();
		if(str.contains(" ")) {
			System.out.println("We can only use a single word; no spaces allowed");
			getWordTwo();
		}
		return str.toLowerCase();
	}

	private static boolean checkRotation(String str, String str2) {
		str2 = str2+str2;
		if(str.isSubstring(str2))
			return true;
		return false;
	}

}
