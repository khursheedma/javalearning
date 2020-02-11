package Java.Day8.Assignments;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/*
 * Consider student class with name and semester attribute and Library class with lib Num and total Books attributes. 
 * Store 5 Library objects as key and Student object as value in Tree Map object and print the content 
 */
class StudentC{
	public String name;
	public String semester;
	
		StudentC(String name, String semester) {
		this.name  = name;
		this.semester = semester;
	}
}
class Library implements Comparable <Library>{
	public int LibNum;
	public int TotalBooks;
	
		Library(int LibNum, int TotalBooks) {
		this.LibNum = LibNum;
		this.TotalBooks = TotalBooks;
	}
	@Override
	public int compareTo(Library o) {
		return this.LibNum - o.LibNum;
	}
}
public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap <Library, StudentC> ls = new TreeMap<Library, StudentC>();	
		// Creating Library Objects
		Library l1 = new Library(1, 100);
		Library l2 = new Library(2, 200);
		Library l3 = new Library(3, 300);
		Library l4 = new Library(4, 400);
		Library l5 = new Library(5, 500);
		// Creating student objects
		StudentC s1 = new StudentC("xxx", "First Semester");
		StudentC s2 = new StudentC("yyy", "Second Semester");
		StudentC s3 = new StudentC("zzz", "Third Semeseter");
		StudentC s4 = new StudentC("aaa", "Fourth Semester");
		StudentC s5 = new StudentC("bbb", "Fifth Semeseter");
		// Adding Libraries and Students to map
		ls.put(l1, s1);
		ls.put(l2, s2);
		ls.put(l3, s3);
		ls.put(l4, s4);
		ls.put(l5, s5);
		// Traversing map
		for (Map.Entry<Library, StudentC> entry : ls.entrySet()) {
			Library l = entry.getKey();
			StudentC s = entry.getValue();
			
			System.out.println("Library Details -> Lib Num : " + l.LibNum + " Total Books : " + l.TotalBooks);
			System.out.println("Student Details -> Student Name: " + s.name + " Semester : " + s.semester);
		}	
	}
}