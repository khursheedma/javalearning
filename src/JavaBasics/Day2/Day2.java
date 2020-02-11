package JavaBasics.Day2;

public class Day2 {
	
	// main(ctrl + space)
	// syso ( cntrl + space)
	
	static int a = 123;
	static String b = "Hello World!!";
	static int c = 30;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// System.out.println("Hello World!");
		// System.out.println(123);
		
		System.out.println(a);
		
		System.out.println(b);
		
		
		

	}

}


/*
 variable : which holds some data
-- It assigned with data type
-- It's name of memory location
int a;   // declaration
a = 10; // initialization

int a = 10; // declaration + initialization

a = 20;


Types of variable:

1. local variable   - defined inside the method body  (needs to be initialized before calling)
2. instance/Global variable  -- defined inside the class but outside of any method body (not necessary to initialize before calling)
3. static variable -- variable defined with static key word  (default value for int is zero, compiler assigns)
Note: we can't call non-static member inside the static block directly, we need to use the object reference to call it



*/