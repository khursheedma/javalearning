package BasicJavaExam;

/*
 * Write Java program to swap two variable with out using third variable.
 */

import java.util.Scanner;

public class SwapTwoVars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter a variable (a): ");
		int a = sc.nextInt();
		
		System.out.println("Enter a variable (b): ");
		int b = sc.nextInt();
		
		sc.close();
		
		System.out.println("Before swapping variables values : " + "a = " + a + ", b = " + b);
		
		a = a + b;
		b = a - b;
		a = a - b; 
		
		System.out.println("After swapping variable values : " + "a = " + a + ", b = " + b);

	}

}
