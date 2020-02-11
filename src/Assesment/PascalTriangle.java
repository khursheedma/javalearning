package Assesment;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter number rows of a Pascal triangle: ");
		
		int n = in.nextInt();
		
		for (int i=1; i <= n; i++) {
			
			int c = 1;  // constant
			
			for (int j = 1; j <= i; j++) {
				
				System.out.print(c + " ");
				c = c * (i - j) / j;
			}
			System.out.println();
		}

	}

}
