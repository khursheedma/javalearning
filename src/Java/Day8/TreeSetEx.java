package Java.Day8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<Integer> hs = new LinkedHashSet<>();
		
		hs.add(2);
		hs.add(8);
		hs.add(44);
		hs.add(55);
		hs.add(44);
		hs.add(32);
		
		Iterator<Integer> it = hs.iterator();
		
		while (it.hasNext()) {
			System.out.println("Item in list is = " + it.next());
		}

	}

}
