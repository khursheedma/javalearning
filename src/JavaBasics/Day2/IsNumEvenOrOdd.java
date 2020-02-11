package JavaBasics.Day2;

import java.util.Scanner;

public class IsNumEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");

		int num = sc.nextInt();
		
		sc.close();
		
		if ( num % 2 == 0) {
			System.out.println("Given number " + num + " is even");
		}
		else {
			System.out.println("Given number " + num + " is odd");
		}

	}

}
