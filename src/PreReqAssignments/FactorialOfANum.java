package PreReqAssignments;

import java.util.Scanner;

public class FactorialOfANum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fact;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number to find a factorial");
		int num = in.nextInt();
		
		in.close();
		
		if (num == 0) {
			fact = 1;
		}
		
		fact = 1;
		
		for (int j=1; j<=num; j++) {
			fact = fact * j;
		}
		System.out.println("Factorial of a number " + num + " is : " + fact);
	}

}
