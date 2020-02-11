package Java.Day5.Assignments;

/*
 *   What is polymorphism?
 *   The word "Poly" means many and "morphs" means forms.
 *   There are two types of polymorphism in Java
 *   	1. Compile-time polymorphism  ex: method overloading
 *   	2. Run-time polymorphism ex:  method overriding
 *   
 *   1. Method Overloading: 
 *   If a class has multiple methods having same name but different in parameters/arguments/data types is known as method overloading.
 *   --- there are two ways to overload method in Java :
 *   		1. by having the different number of parameters/arguments
 *   		2. by having the different data types
 *   
 *   2. Method Overriding:
 *   If a subclass has the same method as declared in the base class, it is known as method overriding in Java
 */

class Vehicle {
	// defining a method
	void run() {
		System.out.println("Vehicle is running");
	}
}

class Car extends Vehicle {
	// defining a same method as declared in Vehicle class
	void run() {
		System.out.println("Car is running");
	}
}
public class WhatIsPolymorphism {
	
	static int Add(int a, int b) {
		return a + b;
	}
	
	static double Add(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		// Below method calls for overloading 
		System.out.println(Add(5, 6));
		System.out.println(Add(7.0, 8.0));
		
		// Below method for overriding
		Vehicle v = new Car();
		v.run();
	}

}
