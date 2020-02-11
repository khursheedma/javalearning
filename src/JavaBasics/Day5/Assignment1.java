package JavaBasics.Day5;

import java.util.Scanner;

public class Assignment1 {
	
	
	/*
	 *  Take inputs run time
	 *  
	 *  size of 2-D arrays
	 *  
	 *  add two arrays
	 * 
	 * take two diff, array from user at run time with user choice length and add both the array
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("enter the row size of the matrix");
		int rowSize = in.nextInt();
		
		System.out.println("enter the column size of the matrix");
		int colSize = in.nextInt();
		
		int[][] matrixA = new int[rowSize][colSize];
		int[][] matrixB = new int[rowSize][colSize];
		int[][] matrixC = new int[rowSize][colSize];
		
		System.out.println("enter matrix A elements of row " + rowSize + " and column " + colSize + " column ");
		
		for (int i = 0; i < matrixA.length; i++) {
			for (int j = 0; j < matrixA[0].length; j++) {
				System.out.println("enter matrix A row " + i + " col " + j);
				matrixA[i][j] = in.nextInt();
			}
		}
		
		System.out.println("enter matrix B elements of row " + rowSize + " and column " + colSize + " column ");
		
		for (int i = 0; i < matrixB.length; i++) {
			for (int j = 0; j < matrixB[0].length; j++) {
				System.out.println("enter matrix B row " + i + " col " + j);
				matrixB[i][j] = in.nextInt();
			}
		}
		
		System.out.println("Performing addition of two matrices and storing results in a matrix C");
		
		for (int i = 0; i < matrixC.length; i++) {
			for (int j = 0; j < matrixC[0].length; j++) {
				matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
			}
		}
		
		System.out.println("Print matrix A");
		
		for (int i = 0; i < matrixA.length; i++) {
			for (int j = 0; j < matrixA[0].length; j++) {
				System.out.print(matrixA[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Print matrix B");
		
		for (int i = 0; i < matrixB.length; i++) {
			for (int j = 0; j < matrixB[0].length; j++) {
				System.out.print(matrixB[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Print resultant matrix C after addition of two matrices A and B");
		
		for (int i = 0; i < matrixC.length; i++) {
			for (int j = 0; j < matrixC[0].length; j++) {
				System.out.print(matrixC[i][j] + " ");
			}
			System.out.println();
		}

	}

}
