package Java.Exam.Questions.Jan242020;

import java.util.Scanner;

// Q12: Write a Java program that accepts four integers from the user and prints equal if all four are equal, and not equal otherwise. 
// Sample Output: Input first number: 98 Input second number: 73 Input third number: 35 Input fourth number: 89 Numbers are not equal!

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entet an integer value a : ");
		int a = sc.nextInt();
		System.out.println("Entet an integer value b : ");
		int b = sc.nextInt();
		System.out.println("Entet an integer value c : ");
		int c = sc.nextInt();
		System.out.println("Entet an integer value d : ");
		int d = sc.nextInt(); 
		sc.close();
		
		if ((a == b) && (b== c) && (c==d)) {
			System.out.println("Numbers are equal!");
		} else {
			System.out.println("Numbers are not equal!");
		}
		

	}

}
