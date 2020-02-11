package HACKATHON;

/*

Q43. What is the difference between hash map and Hash table?
  
Answer:
 
 HashMap and Hashtable both are used to store data in key and value form. Both are using hashing technique to store unique keys.

1) 	HashMap is non synchronized. It is not-thread safe and can't be shared between many threads without proper synchronization code.	
	Hashtable is synchronized. It is thread-safe and can be shared with many threads.

2) 	HashMap allows one null key and multiple null values.	
	Hashtable doesn't allow any null key or value.

3) 	HashMap is fast.	
	Hashtable is slow.

4) 	We can make the HashMap as synchronized by calling this code
	Map m = Collections.synchronizedMap(hashMap);	
	Hashtable is internally synchronized and can't be unsynchronized.

5) 	HashMap is traversed by Iterator.	
	Hashtable is traversed by Enumerator and Iterator.

 */

public class Q43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
