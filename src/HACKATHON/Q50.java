package HACKATHON;

/*
 * Q50. What are java exceptions? Give me an example
 * 
Answer:

Exception is an abnormal condition in the code.

In Java, an exception is an event that disrupts the normal flow of the program. It is an object which is thrown at runtime.

The core advantage of exception handling is to maintain the normal flow of the application. 
An exception normally disrupts the normal flow of the application that is why we use exception handling. 
 */

public class Q50 {

	public static void main(String[] args) {
		
		try {
			// below code may raise an exception
			int i = 100 / 0;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}

}
