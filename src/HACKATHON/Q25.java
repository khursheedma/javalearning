package HACKATHON;

import java.util.Scanner;

/*
 * Q25. Write a program for binary search. And 5 i/p has to take from user as binary elements.
 */

public class Q25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size : ");
		int n = sc.nextInt();
		
		int[] array = new int[n];
		
		System.out.println("Enter the array elements of size " + n);
		
		for (int i=0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		
		SortArray(array);

		System.out.println("After sorting array elements are : ");
		for (int i=0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}
		System.out.println();
		
		System.out.println("Enter an element to search : ");
		int ele = sc.nextInt();
		BinraySearch(array, ele);
	}

	public static void BinraySearch(int[] array, int ele) {
		
		int low = 0;
		int high = array.length - 1;
		
		while (low <= high) {
			int mid = (low + high) / 2;
			
			if (array[mid] == ele) {
				System.out.println("Element has found : " + array[mid]);
				break;
			}
			
			if (array[mid] < ele) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
	}

	public static int[] SortArray(int[] array) {
		
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
		return array;
	}
}