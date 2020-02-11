package Java.Day4;

// important :  pass by value and pass by reference
// primitive data types -- call by value
// custom data types -- pass by reference

class TreeC {
	
	public void Mehtod1(int i) {
		i = 200;
	}
	
	public void Method2(FruitC f) {
		f.color = "White";
	}
}

class FruitC {
	String color;
}

public class SuperKW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeC  t1 = new TreeC();
		int i = 10;
		t1.Mehtod1(i);
		System.out.println(i);
		
		FruitC f1 = new FruitC();
		f1.color = "Red";
		t1.Method2(f1);
		System.out.println(f1.color);
		
		// pass by value (int, float, double, byte, boolean)
		// pass by reference (Objects, String, ....)
		
	}

}
