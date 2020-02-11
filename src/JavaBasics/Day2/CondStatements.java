package JavaBasics.Day2;

import java.util.Scanner;

public class CondStatements {
	
	/*
	 * if else statement  (it check for the boolean condition)
	 * 1. if statement (single condition)
	 * 2. if else statement (two conditions)
	 * 3. if else if statement  (multiple conditions)
	 * 4. nested if statement  (condition inside condition)
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 20;
		if (age > 18) {
			System.out.println("Person is eligible to caste the vote");
		}
		else {
			System.out.println("Person is not eligible to caste the vote");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");

		int num = sc.nextInt();
		
		System.out.println("Enter your name: ");
		String name = sc.next();
		
		if ( num % 2 == 0) {
			System.out.println("Given number is even" + "Entered name is:" + name);
		}
		else {
			System.out.println("Given number is odd");
		}
		
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the first number: ");
		int b = sc.nextInt();
		
		System.out.println("Enter the first number: ");
		int c = sc.nextInt();
	
		 
		if (a > b && a > c)  {
			System.out.println( a + " is greater than "  +b+ " and " + c);
		} else if (b > c) {
			System.out.println( b + " is greater than "  +a+ " and " + c);
		} else {
			System.out.println( c + " is greater than "  +a+ " and " + b);
		}
		
		if (a > b) {
			if (a > c) {
				System.out.println(a + " is greater than "  +b+ " and " + c);
			} else if (b > c){
				System.out.println(b + " is greater than "  +a+ " and " + c);
			}
			else {
				System.out.println(c + " is greater than "  +a+ " and " + b);
			}
		}
	}
	
	// WJP to find first big, second big and third big number of three, take input from user

}
