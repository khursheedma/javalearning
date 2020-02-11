package Java.Day7;

/*
 * Abstract:
 * Abstract classes and methods
 * 
 * 	-- will have definition and but will not have any implementation
 * 	-- it can have one or more abstract methods
 * 
 * 
 * 
 */

abstract class Shape {
	
	abstract public String Circumference(int length);
	
	abstract public int length();
	
	float Area(float length) {
		return length * length;
	}
}

class Square extends Shape {

	@Override
	public String Circumference(int length) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}	
}

class Rectangle extends Shape {

	@Override
	public String Circumference(int length) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}


public class AbstractClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Shape s = new Shape();  can't instantiate due to abstract class
		
		Square s = new Square(); // child class of abstract class can be instantiated
		s.Area(6);
		s.Circumference(6);
		
		Rectangle r = new Rectangle();
		r.Circumference(5);
		r.Area(5);
	}

}
