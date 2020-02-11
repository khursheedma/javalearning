package Java.Day5;

// Encapsulation

class  Engine {
	String fuelType;
	int yearOfMfg;
	int topSpeed;	
}

class Car {
	String color;
	String ownerName;
	Engine engine;     // imp
	
	/*int frontLeftWheelSize;
	int frontRightWheelSize;
	int backLeftWheelSize;
	int backRightWheelSize;
	
	int frontLeftWheelPressure;
	int frontRightWheelPressure;
	int backLeftWheelPressure;
	int backRightWheelPressure;
	
	String frontLeftWheelColor;
	String frontRightWheelColor;
	String backLeftWheelColor;
	String backRightWheelColor;*/
	
	Tyre frontLeft;
	Tyre fromRightLeft;
	Tyre backLef;
	Tyre backRight;
	
	// Tyre[] tyres;
}

class Tyre {
	int size;
	int pressure;
	String color;
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1 = new Car();
		c1.color = "Red";
		c1.engine.fuelType = "Petrol";
		c1.engine.topSpeed = 120;
		
		c1.frontLeft.pressure =20;
		c1.backRight.size = 10;
		
		
		// inheritance = IS A relation
		// Encapsulation = HAS A relation
	
	}

}
