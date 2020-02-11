package HACKATHON;

import java.util.Scanner;

/*
 * Q3. Given an array of integers, sort the integer values. 
 */

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size : ");
		int n = sc.nextInt();
		
		int[] array = new int[n];
		
		System.out.println("Enter the array elements of size " + n);
		
		for (int i=0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println("Before sorting array elements are : ");
		for (int i=0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}
		System.out.println();
		
		for(int i=0; i<array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j]= temp;
				}
			}
		}
		System.out.println("After sorting array elements are : ");
		for (int i=0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}
	}

}
