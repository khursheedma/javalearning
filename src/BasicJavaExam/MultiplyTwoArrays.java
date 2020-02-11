package BasicJavaExam;

/*
 * write a program to multiply two arrays.
 */

import java.util.Scanner;

public class MultiplyTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size: ");
		int arrSize = sc.nextInt();
		
		int []array1 = new int[arrSize];
		int []array2 = new int[arrSize];
		int []array3 = new int[arrSize];
		
		
		System.out.println("Enter the array1 elements: ");
		
		for (int i=0; i<arrSize; i++) {
			array1[i] = sc.nextInt();
		}
		
		System.out.println("Enter the array2 elements: ");
		
		for (int i=0; i<arrSize; i++) {
			array2[i] = sc.nextInt();
		}
		
		sc.close();
		
		System.out.println("Print the array1 elements: ");
		
		for (int i=0; i<arrSize; i++) {
			System.out.print(array1[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Print the array2 elements: ");
		
		for (int i=0; i<arrSize; i++) {
			System.out.print(array2[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Print the array1 * array2 elements: ");
		
		for (int i=0; i<arrSize; i++) {
			System.out.print(array1[i] * array2[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("Print the array1 * array2 elements by storing values in array3: ");
		
		for (int i=0; i<arrSize; i++) {
			array3[i] = array1[i] * array2[i];
		}
		
		for (int i=0; i<arrSize; i++) {
			System.out.print(array3[i] + " ");
		}

	}

}
