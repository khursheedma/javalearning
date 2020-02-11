package Java.Day5;

/*
 *  constructor overloading example
 *  
 */

class Animal2 {
	
	Animal2(){
		System.out.println("with no args");
	}
	
	Animal2(String name){
		System.out.println("with arguments name : "  + name);
	}
}

public class ConstructorWithArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal2 a1 =  new Animal2();
		Animal2 a2 = new Animal2("Hen");

	}

}