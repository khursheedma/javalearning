package Java.Day6;

import java.util.ArrayList;

// Boxing and Unboxing

public class BoxingAndUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0;  // primitive data type
		float f = 0;   // primitive data type
		
		Integer j = 0;  // class/object
		Float f2;  // class
		
		i = j;  // boxing 
		j = i;  // unboxing
		
		// Collections works with only Classes/objects NOT with primitive data type
		
		// converting primitive data types into objects --> boxing
		// converting objects into primitive data types --> unboxing
		
		
		int[] nums;  // PD array
		
		// ArrayList<int> nums2 = new ArrayList<int>();  int PD does not work
		
		ArrayList<Integer> nums2 = new ArrayList<Integer>();
				

	}

}
