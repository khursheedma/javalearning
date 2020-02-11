package Java.Day5.Assignments;

/*
 * Create a class named 'Programming'. 
 * While creating an object of the class, if nothing is passed to it, then the message "I love programming languages" should be printed. 
 * If some String is passed to it, then in place of "programming languages" the name of that String variable should be printed
 */

class Programming {
	
	// no argument has been passed
	Programming () {
		System.out.println("I love programming languages");
	}
	
	// if string is passed while creating object
	Programming (String str1) {
		
		System.out.println("I love " + str1);
	}
}

public class ObjectAndClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creation of objects
		
		Programming p1 = new Programming();
		Programming p2 = new Programming("reading books");
	}

}
