package Java.Day3;

/*
 * Write a Java program to partition an given an array of integers into even number first and odd numbers second
 * Original array : [7,2,4,1,3,5,6,8,2,10]
 * After partition the said array becomes : [10, 2, 4, 2, 8, 6, 5, 3, 1, 7]
 * 
 *  fn1 = get the first odd numbers from left
 *  fn2 = get the last even number from right
 *  fn3 = swap numbers in array
 */

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1 = {7, 2, 4, 1, 3, 5, 6, 8, 2, 10};
		
		
		int low = 0;
		int high = array1.length -1;
		
		while (low <= high) {
			
			while ((array1[low] % 2 == 0) && (low <= high)) {
				low = low + 1;
			} 
			
			while ((array1[high] % 2 != 0) && (low <= high)) {
				high = high - 1;
			} 
			
			if (low <= high) {
				int temp = array1[low];
				array1[low] = array1[high];
				array1[high] = temp;
				low = low + 1;
				high = high -1;
			}
			
			
		}
		
		for (int i=0; i<array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
	}

}
