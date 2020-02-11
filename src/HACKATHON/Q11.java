package HACKATHON;

/*
 * Q11. How to Split String in java?  
 * 
 * Answer :
 * 
 * Splits this string around matches of the given regular expression.
 * This method works as if by invoking the two-argument split method with the given expression and a limit argument of zero. 
 * Trailing empty strings are therefore not included in the resulting array.
 */

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "hello! how are you";
		
		System.out.println("Example 1: based on the space");
		String[] str1 = s1.split("\\s+");
		
		for (int i=0; i < str1.length; i++) {
			System.out.println(str1[i]);
		}
		System.out.println();
		
		System.out.println("Example 2: based on the '!' symbol/character");
		String[] str2 = s1.split("!");
		
		for (int i=0; i < str2.length; i++) {
			System.out.println(str2[i]);
		}
	}

}
