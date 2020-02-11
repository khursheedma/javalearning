package Assesment;

import java.util.Scanner;

/*
 * Q1. Given an integer, n, perform the following conditional actions:
 * If n is odd, print Weird
 * If n is even and in the inclusive range of 2 to 5, print Not Weird
 * If n is even and in the inclusive range of 6 to 20, print Weird
 * If n is even and greater than 20, print Not Weird.
 */
public class Assesment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the integer number: ");
		int n = in.nextInt();
		
		in.close();
		
		if (n > 20 && n % 2 == 0) {
			System.out.println("Not weird");
		} else if ((n >= 6 && n <= 20) && (n % 2 == 0)) {
			System.out.println("Weird");
		} else if ((n >=2 && n <=5) && (n%2 ==0)) {
			System.out.println("Not Weird");
		} else {
			System.out.println("Weird");
		}
		
		

	}

}
