package Java.Day8;
import java.util.LinkedList;

/*
	Implement singly linked list with following operations 
    Insert and delete last 
    Insert and delete front 
    Display 
    FindMin 
    FindMax 
    Delete using position(first node has pos =0) 
 */

public class LinkedListEx {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<>();
		
		ll.add(30);
		ll.addLast(40);
		ll.add(25);
		ll.addLast(50);
		System.out.println("singly linked list elements are : ");
		for (int i=0; i < ll.size(); i++) {
			System.out.print(ll.get(i) + " ");
		}
		System.out.println();
		ll.removeLast();
		System.out.println("singly linked list elements after removing last element : ");
		for (int i=0; i < ll.size(); i++) {
			System.out.print(ll.get(i) + " ");
		}
		System.out.println();
		ll.addFirst(69);
		System.out.println("singly linked list elements after inserting at front position : ");
		for (int i=0; i < ll.size(); i++) {
			System.out.print(ll.get(i) + " ");
		}
		System.out.println();
		ll.removeFirst();
		System.out.println("singly linked list elements after removing at first position : ");
		for (int i=0; i < ll.size(); i++) {
			System.out.print(ll.get(i) + " ");
		}
		System.out.println();
		System.out.println("To find the min and max value : ");
		int lMin = ll.get(0);
		for (int i=1; i < ll.size(); i++) {
			if (lMin > ll.get(i)) {
				lMin = ll.get(i);
			}
		}
		System.out.println("Min value : " + lMin);
		int lMax = ll.get(0);
		for (int i=1; i < ll.size(); i++) {
			if (lMax < ll.get(i)) {
				lMax = ll.get(i);
			}
		}
		System.out.println("Max value : " + lMax);		
		System.out.println("To remove element in linked list at position at 2");
		ll.remove(2);
		System.out.println("after removing element at position 2 in a linked list  : ");
		for (int i=0; i < ll.size(); i++) {
			System.out.print(ll.get(i) + " ");
		}
	}
}