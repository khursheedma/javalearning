package Java.Day2;

public class MethodsEx {
	
	static int h = 10;  // global variable / shared (static)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int a = 10 + 2
		int a = Add(10, 2);
		System.out.println("a = " + a);
		
		// int b = 20 + 15
		int b = Add(20, 15);
		System.out.println("b = " + b);

		// int c = 30 + 2
		int c = Add(30, 2);
		System.out.println("c = " + c);
		
		// int d = 30 - 2
		int d = Subtract(30, 2);
		System.out.println("d = " + d);
		
		// int e = 20 * 20
		int e = Square(20);
		System.out.println("e = " + e);
		
		SimplePrint();   // no arguments example

	}

	public static int Add(int i, int j) {
		// TODO Auto-generated method stub
		return i + j;
	}
	
	public static int Subtract(int i, int j) {
		// TODO Auto-generated method stub
		
		int x = 20; // local to method
		i = i * 10;
		j = j - 5;
		if (i > j) {
			return i - j;
		} else {
			return j - i;
		}
	}
	
	public static int Square(int i) {
		// TODO Auto-generated method stub
		return i * i;
	}
	
	public static void SimplePrint() {
		System.out.println("Simple Print");
		System.out.println("Simple Print");
		if (h > 5)
			return;
		System.out.println("Simple Print");
		System.out.println("Simple Print");
	}

}
