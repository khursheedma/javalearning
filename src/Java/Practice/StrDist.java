package Java.Practice;

import java.util.Scanner;

/*
 * """
Given a string and a non-empty substring sub, 
compute recursively the largest substring which starts and ends with sub and return its length.

strDist("catcowcat", "cat") → 9
strDist("catcowcat", "cow") → 3
strDist("cccatcowcatxx", "cat") → 9

"""

 */

public class StrDist {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		String str1 = sc.next();
		
		System.out.println("Enter the sub-string : ");
		String subStr = sc.next();
		
		sc.close();
		
		System.out.println(strDist(str1, subStr));
	}
	
	public static  int strDist(String str1, String subStr) {
		
		if (str1.length() < subStr.length()){
			return 0;
		}
		
		if (str1.substring(0, subStr.length()).equals(subStr) && str1.substring(str1.length() - subStr.length()).equals(subStr)) {
			return str1.length();
		}
		
		if (!(str1.substring(0, subStr.length()).equals(subStr))) {
			return strDist(str1.substring(1), subStr);
		}
		
		return strDist(str1.substring(0, str1.length()-1), subStr);
	}
}
