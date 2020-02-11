package BasicJavaExam;

import java.util.Scanner;

/*
 * write a program to calculate the square root of a number.
 */

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		sc.close();
		
		
		if ((num == 0) || (num == 1)) {
			System.out.println("Square root of a number " + num + " is: " + num);
		} else {
			
			int start = 1;
			int end = num;
			int result = 1;
			
			while (start <= end) {

				int mid = (start + end) / 2;
				
				if (mid * mid == num) {
					// System.out.println("Square root of a number " + num + " = " + mid);
					result = mid;
					break;
				}
				
				if (mid * mid < num) {
					start = mid + 1;
					result = mid;
				} else {
					end = mid - 1;
				}
			}
			System.out.println("Square root of a number " + num + " = " + result);
		}

	}

}
