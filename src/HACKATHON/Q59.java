package HACKATHON;

/*
 * Q59. What is boxing and unboxing in Java? Explain with an example
 * 
 * Answer:
 * 
 * Autoboxing
 * The automatic conversion of primitive data type into its corresponding wrapper class is known as autoboxing, 
 * for example, byte to Byte, char to Character, int to Integer, long to Long, float to Float, boolean to Boolean, double to Double, and short to Short.
 * 
 * Unboxing
 * The automatic conversion of wrapper type into its corresponding primitive type is known as unboxing.
 */

public class Q59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Converting int into Integer  
		int x=50;  
		Integer i=Integer.valueOf(x);//converting int into Integer explicitly  
		
		Integer j=x;//autoboxing, now compiler will write Integer.valueOf(a) internally
		
		System.out.println(x + " " + i + " " + j);
		
		//Converting Integer to int    
		Integer y=new Integer(5);    
		int k=y.intValue(); //converting Integer to int explicitly  
		int l=y;//unboxing, now compiler will write a.intValue() internally    
		    
		System.out.println(y + " " + k + " " + l);    

	}

}
