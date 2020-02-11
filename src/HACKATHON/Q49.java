package HACKATHON;

/*
 * Q49. What are access modifiers? Give me an example? 
 
 The access modifiers in Java specifies the accessibility or scope of a field, method, constructor, or class. 
 We can change the access level of fields, constructors, methods, and class by applying the access modifier on it.

	There are four types of Java access modifiers:

    Private: The access level of a private modifier is only within the class. 
    It cannot be accessed from outside the class.
    
    Default: The access level of a default modifier is only within the package. 
    It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.
    
    Protected: The access level of a protected modifier is within the package and outside the package through child class. 
    If you do not make the child class, it cannot be accessed from outside the package.
    
    Public: The access level of a public modifier is everywhere. 
    It can be accessed from within the class, outside the class, within the package and outside the package.

 */

class A {
	private int i = 40;
	protected int j = 50;
	public int k = 60;
	int l = 70;
	
	void display() {
		System.out.println("Private : " + i);  // private can be accessed in same class
	}
}

public class Q49 {

	public static void main(String[] args) {
		
		A obj = new A();
		obj.display();
		
		//System.out.println("Private : " + obj.i);		// Private can be accessed in same class, can't be accessed here
		System.out.println("Protected : " + obj.j);  	// can be accessed in same package and out side package through child class.
		System.out.println("Public : " + obj.k);  		// public can be accessed same package and outside of the package
		System.out.println("default : " + obj.l); 		// default can be accessed same package and not in outside of the package
		
	}

}
