package Java.Day4;

// this key word example

class newCar {
	String color;
	
	newCar (String color){
		this.color = color; // this.color -> current class, color -> local variable
	}
	
	void StartEngine() {
		System.out.println(color);  // here color = this.color
	}
}


public class Entry3 {

	public static void main(String args[]) {
		newCar c1 = new newCar("White");
		System.out.println(c1.color);
	}
}
