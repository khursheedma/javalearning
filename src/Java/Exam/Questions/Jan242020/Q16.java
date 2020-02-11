package Java.Exam.Questions.Jan242020;

/*
 *  Q16: program to move every zero to the right side of a given array of integers. 
 *  Original array: [0, 8, 4, 0, 1, 9, 6, 0] 
 *  Result: [8, 4, 1, 9, 6, 0, 0, 0]
 */

public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {0, 8, 4, 0, 1, 9, 6, 0};

		System.out.println("Original Array : ");
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		int low = 0;
		int high = array.length -1;
		
		while (low <= high) {
			if (array[low] == 0) {
				for (int i = low; i < high; i++) {
					array[i] = array[i+1];
				}
				array[high] = 0;
			}
			low = low  + 1;
		}
		
		System.out.println("Resultant Array : ");
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
