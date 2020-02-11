package Java.Day2;

public class ScopeOfVars {
	
	int m = 10;   // global variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * int i = 5;  // whole number 1, 4, 12
		double d = 1.2; // decimal values
		char c = 'w';  // single character
		String s = "hello";  // collection of characters
		boolean b = true;  // true/false
		 */
		
		// print all student name in school
		for (int i=0; i < 10; i++) {  // every class
			int x = 20;
			System.out.println(x);
			for (int j = 0; j < 5; j++) {  // every student
				// int x = 20;
				System.out.println("i = " +i + "and j =  " +j);
				System.out.println(x);
			}	
		}
		
		// scope accessibility example  
		// not here
		int a = 10;
		{
			// a, y
			int y = 10;
			{
				// a, y, z
				int z = 10;
				// here also
			}
		}


	}

}
