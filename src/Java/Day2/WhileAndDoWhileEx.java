package Java.Day2;

public class WhileAndDoWhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * While (condition) {
		 *  // code to be executed
		 *  }
		 */
		
		int i = 0;
		
		while (i < 5) {
			System.out.println(i);
			i++;
		}
		
		int j = 10;
		
		while (j < 50) {
			System.out.println(j);
			j = j + 5;
		}
		
		
		// do ... while
		
		/*
		 * do {
		 *   // code to be executed
		 *  } while (condition);
		 */
		
		int k = 0;
		
		do {
			System.out.println(k);
			k++;
		} while (k < 5);
		
	}
}
