package Java.Day3;

import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Write Java program to reverse the contents of a sentence
		// (assume a single space between two words) without reverse every word
		
		// input = "Hi I am Khursheed";
		// output = "Khursheed am I Hi";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence to be reversed words: ");
		String str1 = sc.nextLine();
		sc.close();
		
		System.out.println("str1 = : " + str1);
		
		// char[] str1Arr = str1.toCharArray();
		String[] str1Arr = str1.split("\\s");
		String str2 = " ";
		
		for (int i=str1Arr.length -1; i >=0; i--) {
			str2 = str2 + str1Arr[i] + " ";
		}
		System.out.println("Reversed words  : " + str2);
		

	}

}
