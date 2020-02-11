package Java.Exam.Questions.Jan242020;

import java.util.Scanner;

// Q11 : Write a Java program to check if a string starts with a specified word 
// Sample Data: string1 = "Hi this is a java exam Question?" Sample Output: True

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string to verify it starts with specified word or not : ");
		String string1 = in.nextLine();
		
		System.out.println("Enter the specified : ");
		String str2 = in.nextLine();
		in.close();
		
		// String string1 = "Hi this is a java exam Question?";
		
		System.out.println(string1.startsWith(str2, 0));
		
		

	}

}
