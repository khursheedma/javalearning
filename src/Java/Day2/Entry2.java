package Java.Day2;

public class Entry2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Testing");
		// for loop
		
		/*
		 *  for (statement 1; statement 2; statement 3) {
		 *  // code block
		 *  }
		 */
		// i=0; initializing
		// i < 5; validation
		// i++; increment/decrement etc..
		
		for (int i=0; i < 10; i++) {
			System.out.println(i + " Testing");
		}
		
		System.out.print("increment below step 2");
		for (int i=0; i < 10; i+=2) {
			System.out.println(i + " Testing");
		}

		System.out.print("decrement below by 2");
		for (int i=10; i > 2; i = i -2) {
			System.out.println(i + " Testing");
		}
		
		
		/* foreach syntax
			
			for (data type variable name : arrayName) {
				// code block to be executed
			}
		 */
		
		String car = "audi";
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "Audi", "Benz"};
		
		for (String i : cars) {
			System.out.println(i);
		}
		
		for (int i=0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		
		// break statement example below, it breaks out of the (any) loop
		
		for (int i=0; i < 10; i++) {
			System.out.println(i + " Testing");
			System.out.println("Running");
			
			if (i == 6) {
				System.out.println("Stop");
				break;
			}
		}
		
		// break statement example below, it breaks out of the (any) loop
		
		for (int i=0; i < 10; i++) {
			System.out.println(i + " Testing");
			System.out.println("Running");
					
			if (i == 6) {
				continue;  // Running 2 will be skipped when i == 6
			}
			System.out.println("Running 2");

		}
	}

}
