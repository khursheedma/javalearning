package Java.Day4.Assignments;

/*
 * Question: when you create object which method is being called internally? 
 * Answer : constructor
 */

class Book {
	
	Book (){
		System.out.println("Book class's constructor is invoked");
	}
	
}
public class ConstuctorInvokeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// constructor gets invoked internally when we create an object as shown below
		Book obj = new Book();
	}

}