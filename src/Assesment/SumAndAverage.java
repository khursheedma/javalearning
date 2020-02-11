package Assesment;

import java.util.Scanner;

public class SumAndAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter number of elements: ");
		int nums = in.nextInt();
		int[] numArray = new int[nums];
		
		System.out.println("Enter the " + nums + " numbers");
		for (int i=0; i<nums; i++) {
			numArray[i] = in.nextInt();
		}
		System.out.println("Calculating sum and average of entered numbers ");
		int sum = 0;
		for (int i = 0; i < numArray.length; i++) {
			sum = sum + numArray[i];
		}
		System.out.println("Sum : " + sum);
		System.out.println("Average : " + sum/nums);
		
	}

}
