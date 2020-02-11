package Java.Day8;

import java.util.HashMap;
import java.util.Iterator;

public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(10, "xxxx");
		hm.put(20, "yyyy");
		hm.put(30, "zzzz");
		hm.put(15, "xxx1");
		
		for (String s : hm.values()) {
			System.out.println(s);
		}
	}

}
