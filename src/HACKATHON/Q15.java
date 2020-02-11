package HACKATHON;

/*
 * Q15. Given a string print the unique words of the string.
 */

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap <String, Integer> wordCount = new HashMap<String, Integer>();
		System.out.println("enter the string: ");
		Scanner in = new Scanner(System.in);
		String string1 = in.nextLine();
		in.close();
		
		String[] strArrWords = string1.split("\\s+");
		
		for (String word : strArrWords) {
			if (wordCount.containsKey(word)) {
				wordCount.put(word, wordCount.get(word) + 1);
			}
			else
			{
				wordCount.put(word,  1);
			}
		}
		
		Set <String> wordSet = wordCount.keySet();
		
		for (String word : wordSet) {
			if (wordCount.get(word) == 1) {
				System.out.println("Unique word : '" + word + "' = " + wordCount.get(word));
			}
		}
	}
}
