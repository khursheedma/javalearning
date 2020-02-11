package Java.Exam.Questions.Jan242020;

/*
 *  Q17: program to partition an given array of integers into even number first and odd number second 
 *  Expected Output Original array: [7, 2, 4, 1, 3, 5, 6, 8, 2, 10]
 *  After partition the said array becomes: [10, 2, 4, 2, 8, 6, 5, 3, 1, 7]
 */

public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {7, 2, 4, 1, 3, 5, 6, 8, 2, 10};
		
		
		int low = 0;
		int high = array.length -1;
		
		System.out.println("Original Array : ");
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		
		while (low <= high) {
			
			while ((array[low] % 2 == 0) && (low <= high)) {
				low = low + 1;
			} 
			
			while ((array[high] % 2 != 0) && (low <= high)) {
				high = high - 1;
			} 
			
			if (low <= high) {
				int temp = array[low];
				array[low] = array[high];
				array[high] = temp;
				low = low + 1;
				high = high -1;
			}
			
			
		}
		System.out.println("Resultant Array : ");
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
