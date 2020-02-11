package HACKATHON;

/*
 * Q7. What are different ways to create String Object?
 * There are two ways to create string object:
 *  1. String literal
 *  2. String creation 'new' key word
 *  Examples are given below
 */

public class Q7 {

	public static void main(String[] args) {
		// string literal example
		String s1 = "Hello";  // new string "Hello" created in "string constant pool"
		String s2 = "Hello";  // no new object is created in this, s2 is referring to same object which was created above
		
		// with new key word Objects creation
		String str1 = new String("Hi"); // new Object is created
		String str2 = new String("Hi"); // new Object is created, these are two different objects
		
	}

}
