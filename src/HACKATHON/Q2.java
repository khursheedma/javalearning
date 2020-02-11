package HACKATHON;

import java.util.Scanner;

/*
 * Q2. write a program to find factorial (Non Recursive) 
 */

public class Q2 {

	public static void main(String[] args) {
		
		int fact; // to store result of the factorial value
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to find the factorial value by using non-recursive method : ");
		int num = sc.nextInt();
		sc.close();
		
		if (num == 0) {
			fact = 1;
		} else {
			fact = 1;
			for (int i = 1; i <= num; i++) {
				fact = fact * i;
			}
		}
		System.out.println("Factorial value of '" + num + "' = " + fact);
	}

}
