package BasicJavaExam;

import java.util.Scanner;

/*
 * Find largest and smallest elements of an array.
 */

public class LargestSmallestElement {

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
		
		int largest = array1[0];
		int smallest = array1[0];
		
		for (int i=1; i<arrSize; i++) {
			// comparison for larger one
			if (array1[i] > largest) {
				largest = array1[i];
			}
			// comparison for smaller one
			if (array1[i] < smallest) {
				smallest = array1[i];
			}
		}
		
		/*int smallest = array1[0];
		
		for (int i=1; i<arrSize; i++) {
			if (array1[i] < smallest) {
				smallest = array1[i];
			}
		}*/
		
		System.out.println("Largest element: " + largest);
		System.out.println("Smallest element: " + smallest);

	}

}
