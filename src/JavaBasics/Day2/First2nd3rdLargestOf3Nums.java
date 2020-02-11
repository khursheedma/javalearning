package JavaBasics.Day2;

import java.util.Scanner;

public class First2nd3rdLargestOf3Nums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		
		System.out.println("Enter the third number: ");
		int c = sc.nextInt();
		
		method1(a, b, c);
		sc.close();
	}

	private static void method1(int a, int b, int c) {
		// TODO Auto-generated method stub
		
		System.out.println("Print using method 1");
		 
		if (a > b && a > c)  {
			System.out.println( a + " is first largest ");
			if (b > c) {
				System.out.println(b + " is second largest ");
				System.out.println(c + " is third largest ");
			} else {
				System.out.println(c + " is second largest ");
				System.out.println(b + " is third largest ");
			}
		} else if (b > c) {
			System.out.println( b + " is first largest ");
			if (a > c) {
				System.out.println(a + " is second largest ");
				System.out.println(c + " is third largest ");
			} else {
				System.out.println(c + " is second largest ");
				System.out.println(a + " is third largest ");
			}
		} else {
			System.out.println( c + " is first largest ");
			if (a > b) {
				System.out.println(a + " is second largest ");
				System.out.println(b + " is third largest ");
			} else {
				System.out.println(b + " is second largest ");
				System.out.println(a + " is third largest ");
			}
		}
	}

}
