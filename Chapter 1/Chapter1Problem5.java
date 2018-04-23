import java.io.InputStream;
import java.util.HashSet;
import java.util.Scanner;

/*
 * CS 1290
 * Homework 1: Cracking the Coding Interview
 * Problem 1.5
 * @author Matthew S Montoya
 * 
 */
public class Chapter1Problem5 {
	private static Scanner input;
	private static Scanner input2;	


	public static void main(String[] args) {
		/*One Away: 3 types of edits (addChar, removeChar, replaceChar). 
		 * Given 2 strings, write a function to check if the are one/zero edits away.
		 */

		Boolean answer=oneAway();
		System.out.println("Are the strings 0/1 edits away?\n"+answer);
	}

	/*INITIAL QUESTIONS && Assumptions
	 * Does uppercase/lowercase matter? I will assume NO
	 * Do we have to take spaces into consideration? I will assume YES; can ONLY be words
	 */

	private static boolean oneAway() {
		String str = getWordOne();
		String str2 = getWordTwo();
		Boolean bool = checkEdits(str.toLowerCase(), str2.toLowerCase());
		return bool;
	}

	private static String getWordOne() {
		input = new Scanner(System.in);
		System.out.println("Enter a word:");
		String str = input.nextLine();
		if(str.contains(" ")) {
			System.out.println("We can only use a single word; no spaces allowed");
			getWordOne();
		}
		return str;
	}

	private static String getWordTwo() {
		input2 = new Scanner(System.in);
		System.out.println("Enter the second word:");
		String str = input2.nextLine();
		if(str.contains(" ")) {
			System.out.println("We can only use a single word; no spaces allowed");
			getWordTwo();
		}
		return str;
	}

	private static Boolean checkEdits(String str, String str2) {
		//Let's assume the words are just missing a char
		if(Math.abs(str.length()-str2.length()) == 1) {
			//concatenate the strings
			String str3 = str+str2;
			int maxLength = 0;
			if(str.length()>str2.length())
				maxLength = str.length();
			else
				maxLength = str2.length();

			HashSet <String> set = new HashSet <String>();
			//add concatenated string to a set
			set.add(str3);
			if (set.size() == maxLength)
				return true;
		}

		//let's assume the words are the same size
		char[] str_chars = str.toCharArray();
		char[] str2_chars = str2.toCharArray();
		int maxLength=0;
		if(str.length()>str2.length())
			maxLength = str.length();
		else
			maxLength = str2.length();
		//check each individual character
		boolean trigger = true;
		for(int i=0; i<maxLength; i++) {
			if(str_chars[i] != str2_chars[i]) {
				if(trigger==true)
					trigger = false;
				else
					return false;
			}
		}
		return true;
	}
}