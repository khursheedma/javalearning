package HACKATHON;

import java.util.Scanner;

/*
 * Q13. Given a string print the reverse of the string.(Input: Java Code Output: edoC avaJ) 
 */

public class Q13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to be reversed : ");
		String str1 = sc.nextLine();
		sc.close();
		
		// String str1 = "Java Code";
		
		System.out.println("str1 : " + str1);
		
		System.out.println("str1 len : " + str1.length());
		char[] str1CharArr = new char[str1.length()];
		
		str1CharArr = str1.toCharArray();
		
		System.out.println("Printing in array of chars format");
		for (int i=0; i <= str1CharArr.length - 1; i++) {
			System.out.print(str1CharArr[i]);
		}
		
		System.out.println();
		
		for (int i=0; i < str1CharArr.length / 2 + 1; i++) {
			char temp = str1CharArr[i];
			str1CharArr[i] = str1CharArr[str1CharArr.length - i - 1];
			str1CharArr[str1CharArr.length - i - 1] = temp;
		}
		System.out.println("Reversed string is : " + new String(str1CharArr));
	}

}
