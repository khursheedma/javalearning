package Assesment;

/*
 * 
 * Q2. Given an integer, N, print its first 10 multiples. 
 * Each multiple N x i (where 1<= i <= 10) should be printed on a new line in the form: N x i = result.
 * 
 */

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the integer number: ");
		int n = in.nextInt();
		in.close();
		
		for (int i=1; i<=10; i++) {
			System.out.println(n + " x " + i + " = " + n * i);
		}

	}

}
