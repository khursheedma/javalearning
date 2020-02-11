package HACKATHON;

import java.util.Scanner;

/*
 * Q20. WJP to find total number of repeated integers, uppercase and lowercase character in the give string
 * (repetition of Q17)
 */

public class Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to count the integers, uppe rcase and lower case characters : ");
		String str1 = sc.nextLine();
		sc.close();
		
		System.out.println("str1 : " + str1);
		System.out.println("str1 len : " + str1.length());
		char[] str1CharArr = new char[str1.length()];
		str1CharArr = str1.toCharArray();
		
		int countDigits = 0;
		int upperCaseLetters = 0;
		int lowerCaseLetters = 0;
		
		// using for-each statement
		for (char ch : str1CharArr) {
			
			if (Character.isDigit(ch)) {
				countDigits += 1;
			} 
			
			if (Character.isUpperCase(ch)) {
				upperCaseLetters += 1;
			}
			
			if (Character.isLowerCase(ch)) {
				lowerCaseLetters += 1;
			}
		}
	
		System.out.println("No of digits: " + countDigits);
		System.out.println("No of upper case chars : " + upperCaseLetters);
		System.out.println("No of lower case chars : " + lowerCaseLetters);
	}

}
