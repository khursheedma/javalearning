package Java.Day7;

/*
 *  Interfaces:
 *  
 */


interface iCricketer {
	abstract public void PlayCricket();
	
/*	public void ABC() {
		NOT allowed, only abstract methods are allowed
	}*/
	
}

interface iReader {
	void ReaderMethod();  // by default abstract in interface
}


class Student5 implements iCricketer, iReader {

	@Override
	public void ReaderMethod() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void PlayCricket() {
		// TODO Auto-generated method stub
		
	}
	
	public void ABC() {
							// child class can have non-abstract methods
	}
	
}

class Car {
	
}

public class InterfacesEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student5 s = new Student5();
		s.PlayCricket();
		s.ReaderMethod();
		
		// iReader iR = new iReader();  not allowed
		
		Method1(s);
		Method2(s);
		
		Car c = new Car();
		// Method1(c);

	}
	
	static void Method1(iCricketer c) {
		
	}
	
	static void Method2(iReader r) {
		
	}
}
