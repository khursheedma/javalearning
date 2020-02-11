package Java.Exam.Questions.Jan242020;

import java.util.Scanner;

/*
 * Q18: Write a Java program to find the length of last word of a given string. 
 * The string contains upper/lower-case alphabets and empty space characters ' '. 
 * Sample Output:Original String: The length of first letter Length of the last word of the above string: 6 
 */

public class Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string to find length of last word in it : ");
		String str1 = in.nextLine();
		in.close();
		
		String[] strArr = str1.split("\\s");
		
		int len = strArr.length;
		// System.out.println(len);
		System.out.println();
		System.out.println("Last word is " + "'" + strArr[len - 1] + "' in string '" + str1 + "' and it's length is "  + strArr[len - 1].length());
	}

}
