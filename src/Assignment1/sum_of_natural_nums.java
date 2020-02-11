package Assignment1;

import java.util.Scanner;

/*
 * WJP to calculate the sum of first 10 natural number using while loop.
 */

public class sum_of_natural_nums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of natural numbers to sum (first n)");
		int n = sc.nextInt();
		
		sc.close();
		
		int sum = 0;
		
		int i = 0;
		
		while (i <= n) {
			sum = sum + i;
			i += 1;
		}		
		System.out.println("Sum of natural " + n + " numbers: " + sum);
	}

}
