package HACKATHON;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
 * Q33. A circus is designing a tower routine consisting of people standing atop one another’s shoulders. 
 * For practical and aesthetic reasons, each person must be both shorter and lighter than the person below him or her. 
 * Given the heights and weights of each person in the circus, write a method to compute the largest possible number of people in such a tower. 
 * EXAMPLE: Input (ht, wt): (65, 100) (70, 150) (56, 90) (75, 190) (60, 95) (68, 110) 
 * Output: The longest tower is length 6 and includes from top to bottom: (56, 90) (60,95) (65,100) (68,110) (70,150) (75,190) 
 */

class Person implements Comparable<Person> {
    int height, weight;
    
    public Person(int h, int w) {
        height = h;
        weight = w;
    }
    
    public int compareTo(Person o) {
    	// System.out.println("this height = " + this.height + " o height = " + o.height);
        return this.height - o.height;
    }
}

public class Q33 {
    
	public static void main(String[] args) {
		
		Person[] persons = {
				
				// (65, 100) (70, 150) (56, 90) (75, 190) (60, 95) (68, 110)
	            new Person(65,100),
	            new Person(70,150),
	            new Person(56,90),
	            new Person(75,190),
	            new Person(60,95),
	            new Person(68,110),
	        };
		
	        List<Person> list = Arrays.asList(persons);
	        Collections.sort(list);
	        
	        Iterator<Person> it = list.iterator();
			System.out.println("Result : ");
			
			while (it.hasNext()) {
				Person p = it.next();
				System.out.print("(" + p.height + "," + p.weight + ")");
			}
	}

}
