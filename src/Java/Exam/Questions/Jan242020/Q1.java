package Java.Exam.Questions.Jan242020;

import java.util.Scanner;

// Q1: Consider there is a 3 Boolean variable called a, b, c. Check if at least two out of three Boolean's are true

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean a, b, c, result;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter boolean value for a : ");
		a = sc.nextBoolean();
		System.out.println("Enter boolean value for b : ");
		b = sc.nextBoolean();
		System.out.println("Enter boolean value for c : ");
		c = sc.nextBoolean();
	
		
		if ( a && b) {
			result = true;
		} else if ( b && c) {
			result = true;
		} else if (a && c) {
			result = true;
		} else {
			result = false;
		}
		
		System.out.println("Result is : " + result);

	}

}
