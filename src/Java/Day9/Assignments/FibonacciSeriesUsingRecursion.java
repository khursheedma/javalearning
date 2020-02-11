package Java.Day9.Assignments;
/*
 * WJP to print Fibonacci series using java recursion 
 * f(n) = f(n-2) + f(n-1) where n is a integer number
 * Sample series : 
 * if n = 4
 * 	0 1 1 2  (assuming series begins from 0 (zero)
 */
import java.util.Scanner;

public class FibonacciSeriesUsingRecursion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of fibonacci series elements to be printed using recursion : ");
		int n = sc.nextInt();
		sc.close();
		
		for (int i=0; i < n; i++) {
			System.out.print(fib_rec(i) + " ");
		}
	}
	
	public static int fib_rec(int n) {
		
		if ((n==0) || (n==1)) {
			return n;
		} else {
			return fib_rec(n-2) + fib_rec(n-1);
		}
	}
}
