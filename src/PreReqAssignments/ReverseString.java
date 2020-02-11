package PreReqAssignments;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = new String();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		str1 = in.nextLine();
		
		System.out.println("str1 : " + str1);
		
		in.close();
		
		int arrSize  = str1.length();
		
		char[]strArr = new char[arrSize];
		
		strArr = str1.toCharArray();
		
		for (int i=0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		for (int i=0; i < strArr.length / 2; i++) {
			char temp = strArr[i];
			strArr[i] = strArr[strArr.length - i -1];
			strArr[strArr.length - i -1] = temp;
		}
		
		System.out.println("reversed string is: " + (new String(strArr)));
		for (int i=0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
	}

}
