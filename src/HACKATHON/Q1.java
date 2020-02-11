package HACKATHON;

import java.util.Scanner;

/*
 * Q1. Consider there is a 3 Boolean variable called a, b, c. Check if at least two out of three Booleans are true
 */
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the boolean value of a : ");
		boolean a = sc.nextBoolean();
		System.out.println("enter the boolean value of b : ");
		boolean b = sc.nextBoolean();
		System.out.println("enter the bool value of c : ");
		boolean c = sc.nextBoolean();
		sc.close();
		
		boolean result;
		
		if (a == true && b == true) {
			result = true;
		} else if (b == true && c == true) {
			result = true;
		} else if (a == true && c == true) {
			result = true;
		} else {
			result = false;
		}
		
		System.out.println("a = " + a + " b = " + b + " c = " + c + " Result = " + result);
	}

}
