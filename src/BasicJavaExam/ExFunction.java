package BasicJavaExam;

/*
 * Explain function with and without parameter and return type with an example
 */

import java.util.Scanner;

public class ExFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter a variable (a): ");
		int a = sc.nextInt();
		
		System.out.println("Enter a variable (b): ");
		int b = sc.nextInt();
		
		sc.close();
		
		System.out.println("Before adding variables values : " + "a = " + a + ", b = " + b);
		
		System.out.println();
		
		add_variables(a, b);
		
		System.out.println();
		
		int c = add_variables_with_return(a, b);
		
		System.out.println("addition of two variables (function with a return statement): " + "a = " + a + ", b= " + b + " is  " + c);

	}

	private static void add_variables(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("addition of two variables (function without a return statement (void)) : " + "a = " + a + ", b= " + b + " is  " + (a+b));
	}

	public static int add_variables_with_return(int a, int b) {

		// TODO Auto-generated method stub
		return a + b;
	}

}
