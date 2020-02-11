package HACKATHON;

import java.util.Scanner;

/*
 * Q22. WJP to convert int to string 
 */

public class Q22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer : ");
		int num = sc.nextInt();
		String str1 = Integer.toString(num);
		sc.close();
		
		System.out.println("Conversion of int to string using Integer.toString(num) : " + str1);

	}

}
