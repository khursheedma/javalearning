package Java.Day5;

/*
 *  Method overriding
 */

class Animal {
	
	public void animalSound() {
		System.out.println("The animal makes a sound");
	}
}

class Dog extends Animal {
	// see what happens when commented
/*	public void animalSound() {
		System.out.println("The dog makes a .....");
	}*/
	
	public void animalSound() {
		super.animalSound();
		System.out.println("The dog makes a .....");
	}
}

class Hen extends Animal {
	
	public void animalSound() {
		// super.animalSound();
		System.out.println("The Hen ... says... ");
	}
}


public class MethodOverriding {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a = new Animal();
		// a.animalSound();
		MakeSound(a);
		
		Dog d = new Dog();
		// d.animalSound();
		MakeSound(d);
		
		Hen h = new Hen();
		//h.animalSound();
		MakeSound(h);
		
		// another way
		Animal hh = new Hen();
		hh.animalSound();
		
	}
	
	// polymorphism - > many forms
	
	public static void MakeSound(Animal a) {
		a.animalSound();
	}
}
