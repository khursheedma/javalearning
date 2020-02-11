package Java.Day1;



  /*Eclipse :  IDE (Integrated Development Environment)
  Java / Java Script : Programming language
  Why do you need this ?
  
  QA Automation Engineer.
  
  Automating the testing process.
  You give instructions to computer = Programming.
  
  Java = Programming language.
  
  5 - 7 days =  Java concepts.
  How to write a basic program
  what is main function?
  Data types
  if/else  statement
  switch case statement
  
  what is comment ?*/
  
 

public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello");
		System.out.println("How are you?");
		System.out.println("I am good");
		
		int i = 5;  // whole number 1, 4, 12
		double d = 1.2; // decimal values
		char c = 'w';  // single character
		String s = "hello";  // collection of characters
		boolean b = true;  // true/false
		
		
		System.out.println(d);
		System.out.println(s);
		System.out.println(d+s);
		System.out.println(d + s);
		System.out.println(s + "how are you");
		
		
		int j = 10;
		
		if (j % 2 == 0) {
			j = j + 10;
		} else {
			j = j - 5;
		}
		
		System.out.println("Value of J = " + j);
		
		// program
		// if j = 4 print square
		// if j = 3 print triangle
		// if j = 5 print hexagon
		// if j = 6 print pentagon
		
		
		// if/else case
		
		j = 4;
		
		if (j == 4) {
			System.out.println("square");
		} else if (j == 3) {
			System.out.println("triangle");
		} else if (j == 5) {
			System.out.println("hexagon");
		} else if (j == 6) {
			System.out.println("pentagon");
		}
		
		// switch 
		
		switch (j) {
		case 4:
			System.out.println("square");
			break;
		case 3:
			System.out.println("triangle");
			break;
		case 5:
			System.out.println("hexagon");
			break;
		case 6:
			System.out.println("pentagon");
			break;
		default:
			System.out.println("default case");
		}

	}

}
