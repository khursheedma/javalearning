package Java.Day8.Assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
 * Write a program to get the position of a particular element in an Array List? 
 */

public class ArrayListElementPosition {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the elements to add in array list : ");
		int n = sc.nextInt();
		
		System.out.println("Add '" + n + "' elements in array list");
		
		for (int i=0; i<n; i++) {
			System.out.println("Enter the element : ");
			int ele = sc.nextInt();
			al.add(ele);
		}
		
		Iterator<Integer> it = al.iterator();
		System.out.println("Array list elements are : ");
		
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		
		System.out.println("Enter the position of the element to find : ");
		int pos = sc.nextInt();
		sc.close();
		System.out.println("element at position " + pos + " is : " + al.get(pos));

	}

}
