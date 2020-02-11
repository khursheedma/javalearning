package Java.Exam.Questions.Jan242020;

import java.util.Scanner;

// Q6: Write a Java program to reverse a string.

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string to be reversed : ");
		String str1 = sc.nextLine();
		sc.close();
		
		System.out.println("str1 : " + str1);
		
		System.out.println("str1 len : " + str1.length());
		char[] str1CharArr = new char[str1.length()];
		
		str1CharArr = str1.toCharArray();
		
		System.out.println("Printing in array of chars format");
		for (int i=0; i <= str1CharArr.length - 1; i++) {
			System.out.print(str1CharArr[i]);
		}
		
		System.out.println();
		
		for (int i=0; i < str1CharArr.length / 2 + 1; i++) {
			char temp = str1CharArr[i];
			str1CharArr[i] = str1CharArr[str1CharArr.length - i - 1];
			str1CharArr[str1CharArr.length - i - 1] = temp;
		}
		System.out.println("Reversed string is : " + new String(str1CharArr));
	}

}
