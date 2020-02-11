package Java.Day4.Assignments;
/*
 * Question : Can we overload a static method in Java? (detailed answer) 
 * Answer   : Yes, we can overload static method in Java is related to compile time (static) polymorphism.
 * 			  static method can have same method name with different signatures as explained below in example.
 */
public class StaticMethodOverloading {
	
	public static void test_static_method() {
		System.out.println("same name static method called with no arguments");
	}
	
	public static void test_static_method(int a, int b) {
		System.out.println("same name static called with two arguments int data type : " + (a+b));
	}
	
	public static void test_static_method(double a, double b) {
		System.out.println("same name static method called with two arguments with double data type : " + (a+b));
	}
	
	public static void test_static_method(int a, int b, int c) {
		System.out.println("same name static method called with three arguments int data type : " + (a+b+c));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test_static_method();
		test_static_method(10, 20);
		test_static_method(10.0, 20.0);
		test_static_method(10, 20, 30);
	}

}
