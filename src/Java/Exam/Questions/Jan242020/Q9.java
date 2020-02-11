package Java.Exam.Questions.Jan242020;

import java.util.Scanner;

// Q9: Accept an integer (x) and computes the value of x+xx+xxx+xxxx. eg: 5+55+555+5555.

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer value : ");
		int x = sc.nextInt();
		sc.close();
		
		int sumX = 0;
		for (int i=1; i <= x; i++) {
			String str1 = "";
			for (int j=1; j <= i; j++) {
				str1 = str1 + x;
			}
			System.out.println("str1 : " + str1);
			sumX = sumX + Integer.parseInt(str1);
		}
		System.out.println("Sum = " + sumX);
	}

}
