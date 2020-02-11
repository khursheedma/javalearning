package Java.Day10;

import java.util.Scanner;

public class RecursionEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the input : ");
		int n = sc.nextInt();
		
		System.out.println("Sum of n : " + function1(n));

	}
	
	public static int function1(int n) {
		if (n == 0) {
			return n;
		} else {
			return n + function1(n-1);
		}
		
	}

}
