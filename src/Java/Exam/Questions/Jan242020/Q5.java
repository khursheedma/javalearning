package Java.Exam.Questions.Jan242020;

import java.util.Scanner;

// Q5: Take the input of a radius and calculate area + circumference of the circle.
  // c = 2 * pi * r
	// a = pi * r *

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius value : ");
		float radius = sc.nextFloat();
		sc.close();
		
		System.out.println("Area of the circle : " + (3.14 * radius * radius));
		
		System.out.println("Circumference of the circle : " + (2 * 3.14 * radius));
		
	}

}
