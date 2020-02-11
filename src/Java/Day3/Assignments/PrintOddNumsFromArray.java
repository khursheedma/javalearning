package Java.Day3.Assignments;

/*
 *  Given an array of integers, print only odd numbers array[]={3,8,6,14,5,17,19} 
 */

public class PrintOddNumsFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {3,8,6,14,5,17,19};
		
		System.out.println("Printing only odd numbers : ");
		
		for (int i=0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				System.out.print(array[i] + " ");
			}
		}
	}

}
