package Java.Day10;

import java.util.ArrayList;

public class ForEeachEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Integer> nums = new ArrayList<>();
		
		nums.add(3);  // new Integer(3)
		nums.add(32);
		nums.add(13);
		nums.add(35);
		
		for (Integer i : nums) {
			System.out.println(i);
		}
		
		for (int i =0; i < 30; i++) {
			
			// statements
			int j =20;
			j = 20 + 30;
			if (i == 10) {
				continue;
			}
			// statements  // will not execute 'continue' condition meets
			int x = 30;
			
		}
		
		int i = 10;
		Integer j = 20;
		j = i;  // boxing
		i = j;  // unboxing
		
		ArrayList <Integer> nums1 = new ArrayList<>();
		
		nums1.add(3);  // new Integer(3)
		
	}

}
