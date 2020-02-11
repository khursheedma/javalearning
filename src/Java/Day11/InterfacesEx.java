package Java.Day11;


interface CricketerCls {
	
	/*public void BatAndBowl() {
		System.out.println("Do batting and bowling");
	}*/
	
	public void BatAndBowl();
}

interface SwimmerCls {
	
	/*public void swim() {
		System.out.println("Do swimming");
	}*/
	
	public void swim();
}

class StudentCls implements CricketerCls, SwimmerCls {

	@Override
	public void BatAndBowl() {
		// TODO Auto-generated method stub
		System.out.println("Do batting and bowling");
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("Do swimming");
	}
}

// Animal = Parent
// Cats = child extends Animal;
// wildCat = child extends Cats
// Multilevel inheritance is possible in Java
// multiple inheritance is not possible in Java

// interfaces
// multiple interfaces are possible, but not multilevel interface

public class InterfacesEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentCls s = new StudentCls();

		// polymorphism implementation using interfaces
		FieldGameOn(s);
		WaterGameOn(s);
	}
	
	public static void FieldGameOn(CricketerCls c) {
		
	}
	
	public static void WaterGameOn(SwimmerCls C) {
		
	}

}
