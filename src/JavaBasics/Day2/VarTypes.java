package JavaBasics.Day2;

public class VarTypes {
	
	static String name = "Khursheed";  // instance/global  variable (static)
	String name1 = "name1 instance variable";  // instance/global variable (non-static )
	static int abc = 123;
	
	void test() {
		int b = 20; // local variable
		
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VarTypes b1 = new VarTypes();
		System.out.println(b1.name1);
		
		System.out.println(name);
		System.out.println(abc);
		b1.test();
		b1.test();
		int a = 10; // local variable
		System.out.println(a);
		a= 50;
		System.out.println(a);
		a= 10;
		System.out.println(a);
		b1.test();
		
	

	}

}