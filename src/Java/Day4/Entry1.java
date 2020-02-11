package Java.Day4;

public class Entry1 {
	
	
	static int i=10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// classes = blueprint
		// objects = real instances (state and behavior)
		
		i = 20;
		
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		car1.color = "blue";
		car2.color = "white";
		car3.color = "Red";
		
		car1.maxSpeed = 120;
		car2.maxSpeed = 180;
		car3.maxSpeed = 220;
		
		// car1.brand = "Audi";
		// car2.brand = "Benz";
		// car3.brand = "BMW";
		
		Car.brand = "Audi";  //
		
		System.out.println("Car1 color = " + car1.color + ", max speed = " + car1.maxSpeed + ", brand = " + car1.brand);
		System.out.println("Car2 color = " + car2.color + ", max speed = " + car2.maxSpeed + ", brand = " + car2.brand);
		System.out.println("Car3 color = " + car3.color + ", max speed = " + car3.maxSpeed + ", brand = " + car3.brand);
		
		car1.StartEngine();
		car2.StartEngine();
		
		car1.SpecialMethod();
		Car.SpecialMethod();
		
		sm2();
	}
	
	public static void sm2() {
		
	}
}
