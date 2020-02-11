package Java.Day1.Assignments;

import java.util.Scanner;

/*
 * WJP to make a calculator using switch case in Java(Include all arithmetic operators +,-,* and /).
 */

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number a: ");
		int a = sc.nextInt();
		System.out.println("Enter the number b: ");
		int b = sc.nextInt();
		System.out.println("Enter the arithemetic operator +, -, * or / : ");
		String op = sc.next();
		sc.close();
		
		switch (op) {
		case "+" :
			System.out.println("'" + op + "' operation has been performed : " + a + " " + op + " " + b + " = " + (a+b));
			break;
		case "-" :
			System.out.println("'" + op + "' operation has been performed : " + a + " " + op + " " + b + " = " + (a-b));
			break;
		case "*" :
			System.out.println("'" + op + "' operation has been performed : " + a + " " + op + " " + b + " = " + (a*b));
			break;
		case "/" :
			System.out.println("'" + op + "' operation has been performed : " + a + " " + op + " " + b + " = " + (a/b));
			break;
		default:
			System.out.println("Entered the incorrect arithemetic operator -> '" + op + "' Please enter the valid operator such as +, -, * or /");
		}
	}
}