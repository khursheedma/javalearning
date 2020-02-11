package JavaBasics.Day2;

import java.util.Scanner;

public class LargestOf3Nums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the first number: ");
		int b = sc.nextInt();
		
		System.out.println("Enter the first number: ");
		int c = sc.nextInt();
		
		method1(a, b, c);
		
		method2(a, b, c);

	}

	private static void method2(int a, int b, int c) {
		// TODO Auto-generated method stub
		
		System.out.println("Print using method 2");
		 
		if (a > b && a > c)  {
			System.out.println( a + " is greater than "  +b+ " and " + c);
		} else if (b > c) {
			System.out.println( b + " is greater than "  +a+ " and " + c);
		} else {
			System.out.println( c + " is greater than "  +a+ " and " + b);
		}
	}

	private static void method1(int a, int b, int c) {
		// TODO Auto-generated method stub
		
		System.out.println("Print using method 1");
		
		if (a > b) {
			if (a > c) {
				System.out.println(a + " is greater than "  +b+ " and " + c);
			} else{
				System.out.println(c + " is greater than "  +a+ " and " + b);
			}
		}
		else if (b > c){
			System.out.println(b + " is greater than "  +a+ " and " + c);
		} else {
			System.out.println(c + " is greater than "  +a+ " and " + b);
		}
	}

}
