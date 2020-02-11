package Java.Day2.Assignments;

import java.util.Scanner;
/*
 * write a Java program to print fibonacci series using for loop
 */
public class fibonacci {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number to print the fibonacci sequence/series: ");
			int n = sc.nextInt();
			sc.close();
			
			Fibonacci_Series_Func(n);
			
	}

	public static void Fibonacci_Series_Func(int n) {
		
		int f1 = 0;  // count 1, starting from 0 value 
		int f2 = 1;  // count 2
		
		System.out.print("Requested for " + n + " elements of fibonacci series");
		System.out.println();
		
		System.out.print(f1 + " " + f2);
		// count from 3
		for (int count = 3; count <= n; count++) {
			int f3 = f1 + f2;  // fibonacci series formula is f(n) = f(n-2) + f(n-1)
			System.out.print(" " + f3);
			f1 = f2;  // change f1 <-- f2
			f2 = f3;  // change f2 <-- f3
		}
	}

}