package HACKATHON;

import java.util.Scanner;

/*
 * Q4. Given an array of integers check the Palindrome of the series. 
 */

public class Q4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size : ");
		int n = sc.nextInt();
		
		int[] array = new int[n];
		
		System.out.println("Enter the array elements of size " + n);		
		for (int i=0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println("Before checking palindrome, array elements are : ");
		for (int i=0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}
		System.out.println();
		System.out.println("Result of the integer numbers : ");
		for(int i=0; i<array.length; i++) {
			checkPalindrome(array[i]);
		}
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

}
