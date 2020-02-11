package Java.Day2.Assignments;

/*
 * WJP to find the factorial of a given number using recursive function
 */

import java.util.Scanner;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number 'n' to find the it's factorial value: ");
		
		int n = sc.nextInt();
		
		sc.close();
		
		int FactValueOfN = FactRecursion(n);
		
		System.out.println("Factorial of number " + "'" + n + "' = " + FactValueOfN);

	}

	public static int FactRecursion(int n) {
		
		if (n == 0) {   // base case
			return 1;
		} else {
			return n * FactRecursion(n-1); 		
		}
	}

}