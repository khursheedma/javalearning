package HACKATHON;

/*
 * Q34. Write a method to implement *, - , / operations. You should use only the + operator
 * 
 * Operations can be performed as follows:

	Subtraction :-  a - b = a + (-1)*b. 
	Multiplication :- a * b = a + a + a ... b times.
	Division :- a / b =  continuously subtract b from a and count how many times we can do that.

 */

public class Q34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Subtraction is " + sub(6, -3));  
	    System.out.println("Product is " + mul(-15, 8));  
	  
	    try
	    {  
	        System.out.println("Division is " + division(12, 3));  
	    }  
	  
	    catch (ArithmeticException e)  
	    {  
	        System.out.println("Exception :- Divide by 0");  
	    }  
	}
	
	static int flipSign(int a)  
	{  
	    int neg = 0;  
	  
	    // If sign is + ve turn it -ve and vice-versa  
	    int tmp = a < 0 ? 1 : -1;  
	    while (a != 0)  
	    {  
	        neg += tmp;  
	        a += tmp;  
	    }  
	    return neg;  
	}  
	
	// Check if a and b are of different signs  
	static boolean areDifferentSign(int a, int b)  
	{  
	    return ((a < 0 && b > 0) || (a > 0 && b < 0));  
	}  
	// Function to subtract two numbers by negating b and adding them  
	static int sub(int a, int b)  
	{  
	    // Negating b  
	    return a + flipSign(b);  
	}  
	// Function to multiply a by b by adding a to itself b times  
	static int mul(int a, int b)  
	{  
	    // because algo is faster if b<a  
	    if (a < b)  
	        return mul(b, a);  
	  
	    // Adding a to itself b times  
	    int sum = 0;  
	    for (int i = Math.abs(b); i > 0; i--)  
	        sum += a;  
	  
	    // Check if final sign must be -ve or + ve  
	    if (b < 0)  
	        sum = flipSign(sum);  
	  
	    return sum;  
	}  
	
	// Function to divide a by b by counting how many times 'b' can be subtracted from 'a' before getting 0  
	static int division(int a, int b)  
	{  
	    // Raise exception if b is 0  
	    if (b == 0)  
	        throw new ArithmeticException();  
	  
	    int quotient = 0, dividend;  
	  
	    // Negating b to subtract from a  
	    int divisor = flipSign(Math.abs(b));  
	  
	    // Subtracting divisor from dividend  
	    for (dividend = Math.abs(a); dividend >= Math.abs(divisor);  
	         dividend += divisor)  
	        quotient++;  
	  
	    // Check if a and b are of similar symbols or not  
	    if (areDifferentSign(a, b))  
	        quotient = flipSign(quotient);  
	    return quotient;  
	}  
}
