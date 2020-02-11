package Java.Day8;

import java.util.HashSet;
import java.util.Iterator;

public class LinkedHashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(2);
		hs.add(8);
		hs.add(44);
		hs.add(55);
		hs.add(44);
		
		Iterator<Integer> it = hs.iterator();
		
		while (it.hasNext()) {
			System.out.println("Item in list is = " + it.next());
		}

	}

}
