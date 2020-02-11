package Java.Day10;

public class StringBufferStringBuilderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String vs StringBuffer vs StringBuilder
		/*
		 * String = immutable = ThreadSafe = slow
		 * 
		 * StringBuffer = mutable  = ThreadSafe = slow processing but faster than string
		 * 
		 * StringBuilder = mutable = Not ThreadSafe = fast processing
		 */
		
		String s1 = "abc";
		String s2 = new String("abc");
		
		
		StringBuffer sb1 = new StringBuffer("abc");
		
		
		StringBuilder sb2 = new StringBuilder("abc");
		

	}

}
