package Java.Day8;

import java.util.Iterator;
import java.util.LinkedList;

//  LinkedList 

public class SinglyLinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {2, 3, 4};
		// intArray.length;
		
		LinkedList<Integer> ll = new LinkedList<>();
		
		ll.add(2);
		ll.add(22);
		ll.add(32);
		ll.add(32);
		ll.add(null);
		ll.add(35);
		
		for (int i=0; i < ll.size(); i++) {
			System.out.println("elements = " + ll.get(i));
		}
		
		System.out.println("Index based " + ll.get(0));
		
		Iterator<Integer> it = ll.iterator();
	/*	System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());*/
		
		
		
		//Iterator<Integer> it = ll.iterator();
		
		/*while (it.hasNext()) {
			System.out.println("Item in list is = " + it.next());
		}*/
	}

}
