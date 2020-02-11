package HACKATHON;

import java.util.Scanner;

/*
 * Q28. WJP to find factorial of a number using recursion 
 */

public class Q28 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		System.out.println("Factorial of a number using recursion " + num + " = " + FactorialRecMethod(num));

	}
	
	public static int FactorialRecMethod(int num) {
		
		if (num == 0) {
			return 1;  // base case
		} else {
			return num * FactorialRecMethod(num - 1);
		}
	}

}
