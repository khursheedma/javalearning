package JavaBasics;

import java.util.Scanner;

public class ArithmeticOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in  = new Scanner(System.in);
		
		System.out.println("Enter a value for variable 1 (a)");
		int a = in.nextInt();
		
		System.out.println("Enter a value for variable 2 (b)");
		int b = in.nextInt();
		
		System.out.println("Entered values are : " + a + " , " + b);
		int c = a + b;
		System.out.println("Additon of " + a + ","  + b +  " = " + c);
		
		int d = a - b;
		System.out.println("Subtraction " + a + " from "  + b +  " = " + d);
		
		int e = a * b;
		System.out.println("Multiplication of " + a + " , "  + b +  " = " + e);
		
		int f = a /  b;
		System.out.println("Division of " + a + " , "  + b +  " = " + f);
	}

}
