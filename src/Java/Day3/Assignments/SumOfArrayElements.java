package Java.Day3.Assignments;

import java.util.Scanner;

/*
 * Write a program that creates an array of 10 elements size. 
 * Your program should prompt the user to input numbers in array and then display the sum of all array elements.
 */

public class SumOfArrayElements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter array size: ");
		int arraySize = sc.nextInt();
		int[] arrayElements = new int[arraySize];
		
		System.out.println("Please enter arry of elements of size : " + arraySize);
		
		for (int i=0; i < arraySize; i++) {
			System.out.println("Enter the arrayElements[" + i + "] = ");
			arrayElements[i] = sc.nextInt();
		}
		
		sc.close();
		
		System.out.println("Printing entered array elements : ");
		
		for (int i=0; i < arraySize; i++) {
			System.out.print(arrayElements[i] + " ");
		}
		
		System.out.println();
		
		int sumOfArrayElements = 0;
		for (int i=0; i < arraySize; i++) {
			sumOfArrayElements = sumOfArrayElements + arrayElements[i];
		}
		System.out.println("Sum of array elements : " + sumOfArrayElements);
	}

}
