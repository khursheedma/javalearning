package PreReqAssignments;

import java.util.Scanner;

public class SwapVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter two inputs for var1(a) and var2(b)");
		
		System.out.println("Enter a input value for variable a");
		int a = in.nextInt();
		
		System.out.println("Enter a input value for variable b");
		int b = in.nextInt();
		
		in.close();
		
		System.out.println("Before swap a= " + a + " b=" +b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After swap a= " + a + " b=" +b);

	}

}
