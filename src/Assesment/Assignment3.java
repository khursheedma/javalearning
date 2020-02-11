package Assesment;

import java.util.Scanner;

/*
 *  Q3. A student will not be allowed to sit in exam if his/her attendance is less than 75%. 
 *      Take following input from user
 *      	Number of classes held
 *      	Number of classes attended. 
 *      And print,percentage of class attended
 *      Is student is allowed to sit in exam or not
 */

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of classes held: ");
		int classes_held = in.nextInt();
		
		System.out.println("Enter number of classes attended: ");
		int classes_attended = in.nextInt();
		
		in.close();
		
		System.out.println("Number of classes held: " + classes_held);
		System.out.println("Number of classes attended: " + classes_attended);
		
		double percent_classes_attended = (classes_attended * 100) / classes_held;
	
		
		System.out.println("Percent of class attended: " + percent_classes_attended + "%");


		if (percent_classes_attended >= 75 ) {
			System.out.println("Student is allowed to sit in the exam");
		} else {
			System.out.println("Student is NOT allowed to sit in the exam");
		}
			

	}

}
