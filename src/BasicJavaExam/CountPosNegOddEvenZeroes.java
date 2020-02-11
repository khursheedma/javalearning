package BasicJavaExam;

import java.util.Scanner;

/*
 * Take 20 integer inputs from user and print the following:
	Number of positive numbers
	Number of negative numbers
	Number of odd numbers
	Number of even numbers
	Number of zeroes

 */

public class CountPosNegOddEvenZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size: ");
		int arrSize = sc.nextInt();
		
		int []array1 = new int[arrSize];
		
		System.out.println("Enter the array1 elements: ");
		
		for (int i=0; i<arrSize; i++) {
			array1[i] = sc.nextInt();
		}
		
		sc.close();
		
		System.out.println("Print the array1 elements: ");
		
		for (int i=0; i<arrSize; i++) {
			System.out.print(array1[i] + " ");
		}
		
		System.out.println();
		
		int countPositive = 0;
		int countNegative = 0;
		int countOdd = 0;
		int countEven = 0;
		int countZeroes = 0;
		
		for (int i=0; i<arrSize; i++) {
			if (array1[i] > 0) {
				countPositive++;
			}
			if (array1[i] < 0) {
				countNegative++;
			}
			if (array1[i] % 2 !=  0) {
				countOdd++;
			}
			
			//if (array1[i] % 2 ==  0) {
			//	countEven++;
			//}
			
			// if zero should not be included in even count 
			if ((array1[i] % 2 ==  0) && (array1[i] !=0)) {
				countEven++;
			}
			
			if (array1[i] ==  0) {
				countZeroes++;
			}
		}

		System.out.println("Positive number count: " + countPositive);
		System.out.println("Negative number count: " + countNegative);
		System.out.println("Odd number count: " + countOdd);
		System.out.println("Even number count: " + countEven);
		System.out.println("Zeroes count: " + countZeroes);
	}

}
