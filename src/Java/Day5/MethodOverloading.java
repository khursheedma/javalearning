package Java.Day5;

/*
 *  Method overloading
 */

public class MethodOverloading {

	static int plusMethodInt(int x, int y) {
		return x + y;
	}
	
	static double plusMethodDouble(double x, double y) {
		return x + y;
	}
	
	static int plusMethod(int x, int y) {
		return x + y;
	}
	
	static double plusMethod(double x, double y) {
		return x + y;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int myNum1 = plusMethodInt(8, 5);
		double myNum2 = plusMethodDouble(4.3, 6.26);
		
		System.out.println("int : " + myNum1);
		System.out.println("double : " + myNum2);
		
		// method overloading example below with different data type
		int myNum11 = plusMethod(8, 5);
		double myNum22 = plusMethod(4.3, 6.26);
		
		System.out.println("int : " + myNum11);
		System.out.println("double : " + myNum22);
		
		// method overloading example below with different parameters
		Add(1, 2);
		Add(1, 2, 3);
		
	}
	
	static int Add(int a, int b) {
		return a + b;
	}
	
	static int Add(int a, int b, int c) {
		return a + b + c;
	}

}
