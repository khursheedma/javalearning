package Java.Day8.Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*
 * Create student class with name(String type) and RegNo (int type) attributes. 
 * Use any collection to Store 5 student information. 
 * Sort using student name 
 */

class Student implements Comparable<Student> {
	public String name;
	public int RegNo;
	
	Student(String name, int RegNo) {
		this.name = name;
		this.RegNo = RegNo;
	}

	@Override
	public int compareTo(Student s) {		
		return this.name.compareTo(s.name);
	}
}

public class AnyCollection {

	public static void main(String[] args) {
		
		ArrayList<Student> studentList = new ArrayList<>();
		
		studentList.add(new Student("xxx", 100));
		studentList.add(new Student("yyy", 112));
		studentList.add(new Student("zzz", 98));
		studentList.add(new Student("ooo", 90));
		studentList.add(new Student("ppp", 84));
		
		Collections.sort(studentList);
		
		Iterator<Student> it = studentList.iterator();
		
		while (it.hasNext()) {
			Student tStudent = it.next();
			System.out.println("Student name : " + tStudent.name + " Reg No. : " + tStudent.RegNo);
		}
	}

}