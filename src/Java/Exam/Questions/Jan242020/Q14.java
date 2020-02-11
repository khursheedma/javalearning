package Java.Exam.Questions.Jan242020;

/*
 * WJP to print an array after changing the rows and columns of a given two-dimensional array. 
 * Original Array: 40 20 60 10 20 50 After changing the rows and columns of the said array:Output:10 40 20 20 50 60 
 */

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] array = {{40, 20, 60}, {10, 20, 50}};
		int[][] resultArray = new int [array[0].length][array.length];		
		
		System.out.println("Original array : ");
		for (int i=0; i < array.length; i++) {
			for (int j=0; j < array[0].length; j++) {
				System.out.print(array[i][j] + " ");
			}
		}
		
		System.out.println();
		
		for (int i=0; i < array.length; i++) {
			for (int j=0; j < array[0].length; j++) {
				resultArray[j][i] = array[i][j];
			}
		}
		
		System.out.println("Resultant array after transpose (changing the row and columns) : ");
		for (int i=0; i < resultArray.length; i++) {
			for (int j=0; j < resultArray[0].length; j++) {
				System.out.print(resultArray[i][j] + " ");
			}
		}
		System.out.println();
		
		System.out.println("Resultant array : ");
		for (int i=0; i < resultArray.length; i++) {
			for (int j=resultArray[0].length - 1; j >=0 ; j--) {
				System.out.print(resultArray[i][j] + " ");
			}
		}
		
	}

}
