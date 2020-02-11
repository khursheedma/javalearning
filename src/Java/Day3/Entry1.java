package Java.Day3;

public class Entry1 {
	static int result;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// factorial 
		// 5! = 5 * 4 * 3 * 2 * 1
		// n! = n * n - 1 * n-2 * ...1
		int n = 5;
		result = n;
		Factorial(n);
		System.out.println(result);
	}
	public static void Factorial(int n) {
		
		if (n <= 1) {
			return ;
		} else {
			result = result * (n - 1);
			Factorial(n - 1);
		}
	}
}
