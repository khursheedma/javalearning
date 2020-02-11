package HACKATHON;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Q54. What are collection APIs, give me an example
 * 
 * Java Collections 

Collection Framework and Data Structures

- List (ArrayList + LinkedList)
- Set (HashSet + LinkedHashSet + TreeSet)
- Map (HashMap + LinkedHashMap + TreeMap)
- Queue + Stack

Note: 
1. Collection -> Interface in Java
2. Collections -> Utility Class


Why do we use collections when we have Arrays ?
- Arrays are static in length
- It is very difficult to add or remove items from the array
- Not many inbuilt function
- Collections have many inbuilt functions

List:
-- List is a ordered collection
-- list can contain duplicate elements
-- list can accept NULL also
-- maintains insertion order
-- elements can be inserted or accesses by their position in the list
   --- ArrayList
   --- LinkedList
   --- Vector (outdated - not used)
   
 Set :  set can not have duplicate items
   HashSet : does not maintain order
   LinkedHashSet : maintains insertion order
   TreeSet:  Ascending order
   
  map : is interface provides key +  value pair
  
  Queues are collections with FIFO
  Stack are collections with LIFO
 */

public class Q54 {

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