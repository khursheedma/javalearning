package BasicJavaExam;

/*
 *  Write a Java program to check if a given number is prime or not.
 */

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		boolean isPrime = false;
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		sc.close();
		
		if ((num == 0) || (num == 1)) {
			isPrime = false;
		} else {
			for (int i = 2; i <= num / 2 + 1; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				} 
				isPrime = true;
			}
		}
		
		if (isPrime) {
			System.out.println("Given number " + num + " is a prime number");
		} else {
			System.out.println("Given number " + num + " is NOT a prime number");
		}

	}

}
