package JavaBasics.Day4;

import java.util.Scanner;

/*
 * Loops in Java
 * 
 * 1.  do while loop:
 * do 
 * {
 *	// operation
 * 	increment/decrement
 * 
 * } while (condition)
 * 
 * 
 * 2.  while loop :
 * while <condition>
 * {
 *  // operation
 *   increment/decrement
 * }
 * 
 * 
 * 3. for loop
 * 
 * 
 */
 
 
public class Loops_Exs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// do...while loop example
		System.out.println("do...while loop example");
		int a = 1;  // try with a = 11 and observe the results
		do {
			System.out.println(a);
			a++;
		} while (a <= 10);
		
		// while loop example
		System.out.println("while... loop example");
		int b =1;  // try with b = 11 and observe with results, compare do...while,  while...
		
		while (b <= 10) {
			System.out.println(b);
			b++;
		}
		
		// for loop example
		System.out.println("for loop example");
		for (int c = 1; c <= 10; c++) {
			System.out.println(c);
			
			// System.out.print(c + " ");
		}
		
		System.out.println("nested for loop");
		
		for (int i = 1; i<=5; i++) {
			for (int j =1; j<=5; j++) {
			// System.out.println("*");
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("nested for loop, exercise");
		
		for (int i = 1; i<=5; i++) {
			for (int j =1; j<=i; j++) {
			// System.out.println("*");
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("nested for loop, exercise2");
		
		for (int i = 5; i>=1; i--) {
			for (int j =1; j<=i; j++) {
			// System.out.println("*");
				System.out.print(i + " ");	
				}
			System.out.println();
		}	

	}

}
