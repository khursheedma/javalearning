package Java.Day5;

// Important: Rule: Runtime polymorphism can't be achieved by data members.

class Bike1{  
    int speedlimit=90;  
   }  
class Honda3 extends Bike1{  
    int speedlimit=150;  
      
 }  

public class Bike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike1 obj=new Honda3();  
	    System.out.println(obj.speedlimit);//90 

	}

}
