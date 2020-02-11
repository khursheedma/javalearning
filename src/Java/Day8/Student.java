package Java.Day8;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

class StudentClass implements Comparable<StudentClass>{
	public String name;
	public int id;
	public int height;
	
	StudentClass(String name, int id, int height){
		this.name = name;
		this.id = id;
		this.height = height;
	}

	@Override
	public int compareTo(StudentClass s) {
		// TODO Auto-generated method stub
		// return 0 means both are equal
		// - ve means this is bigger
		// +v means the input is bigger
		//return this.id - s.id;
		return this.height - s.height;
		
		// return this.name.compareTo(s.name) * -1;   for descending
		// return this.name.compareTo(s.name);
		//return 0;
	}
}

public class Student {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<StudentClass> studentList = new LinkedList<>();
		
		studentList.add(new StudentClass("XXX", 1,100));
		studentList.add(new StudentClass("yyy", 4, 112));
		studentList.add(new StudentClass("zzz", 8, 98));
		studentList.add(new StudentClass("yyy1", 6, 90));
		
		Collections.sort(studentList);
		
		Iterator<StudentClass> it = studentList.iterator();
		
		while (it.hasNext()) {
			StudentClass tempStudent = it.next();
			System.out.println("Student " + tempStudent.height + " " + tempStudent.id + " " + tempStudent.name);
		}

	}

}
