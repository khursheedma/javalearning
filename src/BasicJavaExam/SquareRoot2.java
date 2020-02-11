package BasicJavaExam;

import java.util.Scanner;

/*
 * write a program to calculate the square root of a number.
 */

public class SquareRoot2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		sc.close();
		
		if ((num == 0) || (num == 1)) {
			System.out.println("Square root of a number " + num + " is: " + num);
		} else {
			
			// for now this logic works for 2, 4, 9, 16, 25 ....and so on numbers
			for (int i = 2; i <= num / 2 + 1; i++) {
				if (i * i == num) {
					System.out.println("Square root of a number " + num + " = " + i);
					break;
				} 
			}
		}

	}

}
