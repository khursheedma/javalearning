package Java.Day4.Assignments;
class A { 

	   int i; 

	   void display() { 

	        System.out.println(i); 

	   } 

	} 

	class B extends A { 

	   int j; 

	   void display() { 

	        System.out.println(j); 

	   } 

} 
	
public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		       B obj = new B(); 

		        obj.i = 1; 

		        obj.j = 2; 

		        obj.display(); 

		   } 

	}
	