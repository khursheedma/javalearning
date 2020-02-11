package Java.Day2.Assignments;

/*
 * Write Java program to swap two variable with out using third variable and without using addition operator
 */
import java.util.Scanner;

public class SwapTwoVars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the variable (a) value : ");
		int a = sc.nextInt();
		
		System.out.println("Enter the variable (b) value : ");
		int b = sc.nextInt();
		
		sc.close();
		
		Swap(a, b);
		
	}

	public static void Swap(int a, int b) {		
		
		System.out.println("Before swapping values are a = " + a + " b = " + b);
		
		a = a * b;
		b = a / b;
		a = a / b;
		
		System.out.println("After swapping values are a = " + a + " b = " + b);
	}

}