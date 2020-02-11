package PreReqAssignments;

import java.util.Scanner;

public class ReverseWordsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = new String();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		str1 = in.nextLine();
		
		System.out.println("str1 : " + str1);
		
		in.close();
		
		System.out.println("Reversed words in a string is: " + ReverseWords(str1));
		
		System.out.println("Reversed string is: " + ReverseString(str1));

	}

	public static String ReverseWords(String str1) {
		// TODO Auto-generated method stub
		
		int len  = str1.length();
		
		// System.out.println("str1 : " + str1);
		
		String[]strArr = str1.split("\\s+"); 
		
		int len1 = strArr.length;
		
		for (int i=0; i <= len1 -1; i++) {
			System.out.print(ReverseString(strArr[i]));
		}
		
		/*String strArr2 = " ";
		
		for (int i=len - 1; i>=0; i--) {
			strArr2 = strArr2 + strArr[i] + " ";
			System.out.print(strArr2 + " " + i);
			//System.out.print(strArr[i]);
			// s = s+ words[words.lenght - i -1] + " "
		}
		System.out.print(strArr2); */
		return null; 
	}
	
	/*
	 * String[] strArr = revWords(str);
		
		int len = strArr.length;
		System.out.println(len);
		System.out.println();
		
		String strArr2 = "";
		
		for (int i=len - 1; i>=0; i--) {
			strArr2 = strArr2 + strArr[i] + " ";
			//System.out.print(strArr[i]);
			// s = s+ words[words.lenght - i -1] + " "
		}
		System.out.print(strArr2);
	}

	private static String[] revWords(String str) {
		// TODO Auto-generated method stub
		return str.split("\\s+");
	 */

	private static String ReverseString(String str1) {
		// TODO Auto-generated method stub
		
		int arrSize  = str1.length();
		
		char[]strArr = new char[arrSize];
		
		strArr = str1.toCharArray();
		
	/*	for (int i=0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}*/
		
		for (int i=0; i < strArr.length / 2; i++) {
			char temp = strArr[i];
			strArr[i] = strArr[strArr.length - i -1];
			strArr[strArr.length - i -1] = temp;
		}
		
		// System.out.println("reversed string is: " + (new String(strArr)));
		
		return (new String(strArr));
	}

}
