package HACKATHON;

import java.util.Scanner;

/*
 * Q23. WJP to differentiate input as string, int or bool
 */

public class Q23 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string value : ");
		String str1 = sc.next();
		
		System.out.println("Enter the int value : ");
		int num = sc.nextInt();
		
		System.out.println("Enter the boolean value : ");
		boolean flag = sc.nextBoolean();
		
		System.out.println("Entered string, int and bool values are : " + "String value : " + str1 + " Num value : " + num + " Boolean value : " + flag);
	}

}