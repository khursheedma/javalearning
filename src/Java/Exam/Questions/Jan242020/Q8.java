package Java.Exam.Questions.Jan242020;

import java.util.Scanner;

// Q8 : Write a Java program to count the letters, spaces, numbers and other characters of an input string. 

public class Q8 {

	public static void main(String[] args) {		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to count the letters, spaces, digits and other characters : ");
		String str1 = sc.nextLine();
		sc.close();
		
		System.out.println("str1 : " + str1);
		System.out.println("str1 len : " + str1.length());
		char[] str1CharArr = new char[str1.length()];
		str1CharArr = str1.toCharArray();
		
		int countDigits = 0;
		int countLetters = 0;
		int countSpaces = 0;
		int upperCaseLetters = 0;
		int lowerCaseLetters = 0;
		
		// using for-each statement
		for (char ch : str1CharArr) {
			
			if (Character.isDigit(ch)) {
				countDigits += 1;
			} 
			
			if (Character.isLetter(ch)) {
				countLetters += 1;
			} 
			
			if (Character.isSpaceChar(ch)) {
				countSpaces += 1;
			} 
			
			if (Character.isUpperCase(ch)) {
				upperCaseLetters += 1;
			}
			
			if (Character.isLowerCase(ch)) {
				lowerCaseLetters += 1;
			}
		}
	
		System.out.println("No of digits: " + countDigits);
		System.out.println("No of letters: " + countLetters);
		System.out.println("No of spaces: " + countSpaces);
		System.out.println("No of upper case chars : " + upperCaseLetters);
		System.out.println("No of lower case chars : " + lowerCaseLetters);

	}

}
