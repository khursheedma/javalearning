package Java.Day4.Assignments;

/*
 *  Question : Can we override static method in Java? (detailed answer) 
 *  Answer   : No, 
 */

class Base {
	
	public static void test_static_method() {
		System.out.println("static method in base class");
	}
	
	public void test_non_static_method() {
		System.out.println("non static method in base class");
	}
}

class Derived extends Base {
	
	public static void test_static_method() {
		System.out.println("static method in derived class");
	}
	
	public void test_non_static_method() {
		System.out.println("non static method in derived class");
	}
}

public class StaticMethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Base obj = new Derived();
		
		// Base.test_static_method();
		obj.test_static_method();
		
		obj.test_non_static_method();

	}

}
