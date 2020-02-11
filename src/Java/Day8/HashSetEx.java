package Java.Day8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> hs = new TreeSet<>();
		
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
