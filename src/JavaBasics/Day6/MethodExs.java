package JavaBasics.Day6;

/*
 * Method:
 * 
 * It will have return type
 * 
 * If return type is other than void, then we need to return the value
 * it can be static or non-static
 * It can have body (implemented/concrete) or not body (unimplemeneted/abstract)
 * we can pass the arguments with methods
 * it can be overloaded and overidden
 * 
 * Access modifiers:
 * 
 * 1. Private : It can be accessed inside the same class only (using setter and getter it is possible)
 * 2. default : it can be accessed inside the same package (no key word required)
 * 3. Protected : It can be accessed inside the same package and sub-class
 * 4. Public : Accessed by all
 * 
 * 
 * 
 * 
 */

public class MethodExs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test();
		//System.out.println(test());
		
		test(10, 20);
		
		test(10.0);

	}


	public static int test() {
		// TODO Auto-generated method stub
		System.out.println("Test method is running");
		return 10;
	}
	
	public static void test(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println(i + "," + j);
		
	}
	
	public static void test(double k) {
		// TODO Auto-generated method stub
		System.out.println(k);
		
	}

}
