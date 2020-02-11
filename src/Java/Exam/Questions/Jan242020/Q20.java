package Java.Exam.Questions.Jan242020;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/*
 * Q20: Java program to find the index of first non-repeating character in a given string.  
	Expected Output:Index of first non-repeating character in 'additional' is: 4 
 */

public class Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
				System.out.println("First duplicated char " + "'" + ch + "' is occurred " + charCount.get(ch) + " times");
				break;
			}
			
		}
	
		for (char ch : charSet) {
			if (charCount.get(ch) == 1) {
				System.out.println("First non-duplicated char " + "'" + ch + "' is occurred " + charCount.get(ch) + " time");
				System.out.println("Index of first non-duplicated char " + "'" + ch + "' " + "in string " + "'" + string1 + "' is "+ string1.indexOf(ch));
				break;
			}
			
		}

	}

}
