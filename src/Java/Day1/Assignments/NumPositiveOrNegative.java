package Java.Day1.Assignments;

/*
 * WJP to check if Number is Positive or Negative using IF statement
 */

import java.util.Scanner;

public class NumPositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to find whether it is a positive or negative: ");
		int num = sc.nextInt();
		
		sc.close();
		
		if (num > 0) {
			System.out.println("Given number " + "'" + num + "' is a positive");
		} else if (num < 0) {
			System.out.println("Given number " + "'" + num + "' is a negative");
		} else {
			System.out.println("Given number " + "'" + num + "' is a zero");
		}

	}

}
