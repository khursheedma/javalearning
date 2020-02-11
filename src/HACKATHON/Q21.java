package HACKATHON;

import java.util.Scanner;

/*
 * Q21. WJP to convert string to int 
 */

public class Q21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str1 = sc.next();
		int num = Integer.parseInt(str1);
		
		System.out.println("Conversion of string to int using Integer.parseInt(str1) : " + num);

	}

}
