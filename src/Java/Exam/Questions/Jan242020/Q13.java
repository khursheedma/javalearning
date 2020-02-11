package Java.Exam.Questions.Jan242020;

/*
 * Q13:program to find the numbers greater than the average of the numbers of a given array.  
 * Expected Output: Original Array: [1, 4, 20, 7, 25, 35, 100] 
 * The average of the said array is: 20.0 The numbers in the said array that are greater than the average are: 20 35 100 
 */

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1, 4, 20, 7, 25, 35, 100};
		
		int sum = 0;
		float avg;
		
		for (int i=0; i < array.length; i++) {
			sum = sum + array[i];
		}
		avg = (float) sum / array.length;
		
		System.out.println("Sum = " + sum + " Average = " + avg);
		
		for (int i=0; i < array.length; i++) {
			if (array[i] > avg) {
				System.out.print(array[i] + " ");
			}
		}
	}

}
