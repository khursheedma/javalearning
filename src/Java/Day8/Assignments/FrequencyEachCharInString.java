package Java.Day8.Assignments;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/*
 * Find the frequency of each character in a given string  
 * String: "Java is an object oriented programming language" 
 */

public class FrequencyEachCharInString {

	public static void main(String[] args) {

		HashMap <Character, Integer> charCount = new HashMap<Character, Integer>();
		System.out.println("enter the string: ");
		Scanner in = new Scanner(System.in);
		String string1 = in.nextLine();
		in.close();
		
		char[] strChar = string1.toCharArray();
		
		for (char ch : strChar) {
			if (charCount.containsKey(ch)) {
				charCount.put(ch, charCount.get(ch) + 1);
			}
			else
			{
				charCount.put(ch,  1);
			}
		}
		
		Set <Character> charSet = charCount.keySet();
		
		for (char ch : charSet) {
				System.out.println("Character '" + ch + "' " + " occurred " + charCount.get(ch) + " times");
		}		
	}
}