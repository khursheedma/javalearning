package Java.Day2.Assignments;

import java.util.Scanner;

/*
 * WJP to calculate the sum of first 10 natural number using while loop.
 */

public class SumOfNaturalNums {

	public static void main(String[] args) {
		
		/*Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of natural numbers to sum (first n)");
		int n = sc.nextInt();
		
		sc.close();*/
		
		SumOfNatualNums(10);  // we can un-comment above code and pass 'n' value instead of '10' for generic purpose
	}

	public static void SumOfNatualNums(int n) {
		
		int sum = 0;  	// initialized sum value
		
		int i = 0;  	// initialized i value, considering from 0 (zero)
		
		while (i <= n) {   	// checking for validity of condition
			sum = sum + i;  // summation of natural numbers
			i += 1;			// incrementing i value with 1
		}		
		System.out.println("Sum of first '" + n + "' natural numbers: " + sum);
	}

}
