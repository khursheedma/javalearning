package Assignment1;

import java.util.Scanner;

/*
 * write a Java program to print fibonacci series using for loop
 */
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the number of fibonacci numbers to print");
			int n = sc.nextInt();
			
			sc.close();
			
			int f1 = 0;
			int f2 = 1;
			
			System.out.print("Requested for " + n + " size of fibonacci series");
			System.out.println();
			
			System.out.print(f1 + " " + f2);
			
			for (int i = 3; i <= n; i++) {
				int f3 = f1 + f2;
				System.out.print(" " + f3);
				f1 = f2;
				f2 = f3;
			}
	}

}
