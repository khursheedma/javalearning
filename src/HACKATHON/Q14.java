package HACKATHON;

import java.util.Scanner;

/*
 * Q14. Given a string print the reverse of the words string.(Input: Java Code Output: Code Java)  
 */

public class Q14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string  : ");
		String str1 = sc.nextLine();
		sc.close();
		
		// String str1 = "Java Code";
		
		System.out.println("str1 : " + str1);
		
		String[] strArr = str1.split("\\s+");
		
		String str2 = "";
		for (int i=strArr.length - 1; i>=0; i--) {
			str2 = str2 + strArr[i] + " ";
		}
		
		System.out.println("Reverse of the words of string '" + str1 + "' : " + str2);
	}

}
