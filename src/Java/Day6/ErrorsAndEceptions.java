package Java.Day6;

import java.io.IOException;

// Errors and Exceptions
// there are different types of exceptions
// ex: index out of range; file not found, arithmetic operation exceptions
// 

public class ErrorsAndEceptions {

	public static void main(String[] args) {
		
		// int[] myNumbers = {1, 2, 3};
		// System.out.println(myNumbers[10]);
		
		try {
			// block of code to try
			int[] myNumbers = {1, 2, 3};
			System.out.println(myNumbers[10]);
			
		} catch (Exception e) {
			// block of code to handle errors
			System.out.println("Exception caught");
		}
		
		try {
			// block of code to try
			int[] myNumbers = {1, 2, 3};
			System.out.println(myNumbers[10]);  // did not handle exception, it just prints "456" only
			System.out.println("123");
			
		} catch (ArithmeticException e) {
			// block of code to handle errors
			// System.out.println("Exception caught");
			
		} catch (Exception e) {
			// block of code to handle errors
			// System.out.println("Exception caught");
			throw e;
		}
		
		finally {
			// what ever code is there is this block, will always be executed
		}

		
		System.out.println("456");
		
		
	}

}
