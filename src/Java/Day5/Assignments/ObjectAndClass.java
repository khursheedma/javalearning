package Java.Day5.Assignments;

/*
 * Write a program to print the names of students by creating a Student class. 
 * If no name is passed while creating an object of Student class, then the name should be "Unknown", 
 * otherwise the name should be equal to the String value passed while creating object of Student class. 
 */

class Student {
	// String name;
	
	// no argument has been passed
	Student() {
		System.out.println("Unknown");
	}
	
	// if name is passed while creating object
	Student(String name) {
		
		System.out.println("Name of the student is : " + name);
		// this.name = name;
		// System.out.println("Name of the student is : " + this.name);
	}
}

public class ObjectAndClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creation of objects
		
		Student s1 = new Student();
		Student s2 = new Student("XYZ");
	}

}
