package HACKATHON;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Q61. What are iterators, explain with an example
 * 
 * Answer :
 * 
 * Iterator interface
 * Iterator interface provides the facility of iterating the elements in a forward direction only.

	Methods of Iterator interface

	There are only three methods in the Iterator interface. They are:

	1	public boolean hasNext()	It returns true if the iterator has more elements otherwise it returns false.
	2	public Object next()	It returns the element and moves the cursor pointer to the next element.
	3	public void remove()	It removes the last elements returned by the iterator. It is less used.

Iterable Interface


It contains only one abstract method. i.e.,

    Iterator<T> iterator()  

It returns the iterator over the elements of type T.

 */
public class Q61 {

	public static void main(String[] args) {
		
		// ArrayList example given below
		
		ArrayList<String> list=new ArrayList<String>();	//Creating arraylist  
				
		list.add("xxx");	//Adding object in arraylist  
		list.add("yyy");  
		list.add("zzz");  
		list.add("ppp");  
				
		//Traversing list through Iterator  
				
		Iterator itr = list.iterator();  
		while(itr.hasNext()) {  
			System.out.println(itr.next());
		}
	}
}
