package Java.Day7.Assignments;

// Implement interface
//Create interface Flight which has two method takeOff() and takeDown(). 
//Create a class Boeing which implements Flight 
//Now create one more class for Airbus which also implements Flight 
//Lets create class Airplane which will be our main class. Here we will instantiate both Boeing and Airbus class 


interface iFlight {
	abstract void takeOff();
	abstract void takeDown();
}

class Boeing implements iFlight {

	@Override
	public void takeOff() {
		System.out.println("Boeing take off function");
	}

	@Override
	public void takeDown() {
		System.out.println("Boeing take down function");
	}
	
}

class Airbus implements iFlight {

	@Override
	public void takeOff() {
		System.out.println("Airbus take off function");
	}

	@Override
	public void takeDown() {
		System.out.println("Airbus take off function");
	}
	
}
public class Airplane {

	public static void main(String[] args) {
		
		Boeing b = new Boeing();
		testTakeOff(b);
		testTakeDown(b);
		
		Airbus a = new Airbus();
		testTakeOff(a);
		testTakeDown(a);

	}
	static void testTakeOff(iFlight f) {
		f.takeOff();
	}

	static void testTakeDown(iFlight f) {
		f.takeDown();
	}
}