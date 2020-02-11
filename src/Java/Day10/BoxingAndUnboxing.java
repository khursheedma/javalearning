package Java.Day10;

import java.util.ArrayList;

public class BoxingAndUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 10;
		Integer j = 20;
		j = i;  // boxing
		i = j;  // unboxing
		
		ArrayList <Integer> nums1 = new ArrayList<>();
		
		nums1.add(3);  // new Integer(3)

	}

}
