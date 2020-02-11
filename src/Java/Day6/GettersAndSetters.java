package Java.Day6;

// Getters and Setters

class Car {
	private String fuelType;  // key is private
	
	// getter
	public String getFuelType() {
		
		/*if (!AuthUser) {
			return;
		}*/
		
		return fuelType;
	}
	
	// setter
	public void setFuelType(String s) {
		
		if (!s.equals("Petrol") && !s.equals("Diesel"))
			return;
		fuelType = s;
	}
}

public class GettersAndSetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		// c1.fuelType = "Petrol";  // can't access if it is "private", need to use getter

		// setter
		c1.setFuelType("Petrol");
		
		// getter output
		System.out.println(c1.getFuelType());
		
		
	}

}
