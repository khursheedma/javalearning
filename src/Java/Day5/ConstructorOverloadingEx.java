package Java.Day5;

/*
 *  constructor overloading example
 *  
 */

class Animal1 {
	
	Animal1(){
		System.out.println("with no args");
	}
	
	Animal1(String name){
		System.out.println("with arguments name : "  + name);
	}
}

public class ConstructorOverloadingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal1 a1 =  new Animal1();
		Animal1 a2 = new Animal1("Hen");

	}

}