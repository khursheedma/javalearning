package HACKATHON;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/*
 * Q18. WJP to display duplicate character in string 
 */

public class Q18 {

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
			if (charCount.get(ch) > 1) {
				System.out.println("First duplicate character is '" + ch + "' occured " +  charCount.get(ch) + " times");
				break;
			}
		}
		
		/*// for all duplicate characters
		for (char ch : charSet) {
			if (charCount.get(ch) > 1) {
				System.out.println("Duplicate character is '" + ch + "' occured " +  charCount.get(ch) + " times");
			}
		}	*/	
	}

}
