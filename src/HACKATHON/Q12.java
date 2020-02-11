package HACKATHON;

import java.util.Scanner;

/*
 * Q12. Write a program to check palindrome (MalayalaM) for both numbers and string?
 */

public class Q12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the integer number : ");
		int num = sc.nextInt();
		
		System.out.println("Enter the string : ");
		String str1 = sc.next();
		
		sc.close();
		
		checkPalindrome(num);
		checkPalindromeString(str1);
	}
	
	public static void checkPalindrome(int num) {
		
		int originalNum = num;
		
		int sumNum = 0;
		
		while (num != 0) {
			int reminder = num % 10;
			sumNum = sumNum * 10 + reminder;
			num = num / 10;
		}
		
		if (originalNum == sumNum) {
			System.out.println("Given number '" + originalNum + "' a is Palindrome");
		} else {
			System.out.println("Given num '" + originalNum + "' is NOT a Palindrome");
		}
	}
	
	public static void checkPalindromeString(String str1) {
		
		String originalString = str1;
		
		char[] strCharArr = str1.toCharArray();
		
		String str2 = "";
		
		for (int i=strCharArr.length - 1; i >= 0; i--) {
			str2 = str2 + strCharArr[i];
		}
		
		if (originalString.equals(str2)) {
			System.out.println("Given string '" + originalString + "' is a Palindrome");
		} else {
			System.out.println("Given string '" + originalString + "' is NOT a Palindrome");
		}
	}
}
