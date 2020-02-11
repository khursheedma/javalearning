package Java.Exam.Questions.Jan242020;

import java.util.HashMap;
import java.util.Scanner;

// Q2: Given an array prints the unique numbers and also print the number of occurrences of duplicate numbers.

public class Q2_toDebug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
Scanner in = new Scanner(System.in);
		
		System.out.println("Enter number of elements: ");
		int n = in.nextInt();
		
		int []intArray = new int[n];
		
		System.out.println("Enter integer array elements of size " + n + ": ");
		
		for (int i=0; i < n; i++) {
			intArray[i] = in.nextInt();
		}
		
		in.close();
		
		System.out.println("Print array elements: ");
	
		for (int i =0; i<n; i++) {
			System.out.print(intArray[i] + " ");
		}
		
		System.out.println();
		
		HashMap <Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (Integer i: intArray) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}
		
		for (Integer numKey: map.keySet()) {
			System.out.println(numKey + " ->Occurred " + map.get(numKey) + " time(s)");
		}
		
		// needs to debug below code later
		
		/*for (Integer numKey: map.keySet()) {
			if (map.get(numKey) == 1) {
				System.out.println("First unique number is : " + map.get(numKey));
				break;
			}
		}

		for (Integer numKey: map.keySet()) {
			if (map.get(numKey) > 1) {
				System.out.println("First repeated number is : " + map.get(numKey));
				break;
			}
		}*/

	}

}
