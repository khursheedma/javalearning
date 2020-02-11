package PreReqAssignments;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter array size: ");
		int arraySize = in.nextInt();
		
		int[] array = new int[arraySize];
		
		System.out.println("Enter array elements of size : " + arraySize);
		for (int i=0; i<arraySize; i++) {
			array[i] = in.nextInt();
		}
		
		in.close();
		
		System.out.println("Print array before sort ");
		for (int i=0; i<arraySize; i++) {
			System.out.println(array[i]);
		}
		
		for (int i=0; i<arraySize; i++) {
			for (int j=i+1; j<arraySize; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
				
			}
		}
		
		System.out.println("Print array after sort ");
		for (int i=0; i<arraySize; i++) {
			System.out.println(array[i]);
		}

	}

}
