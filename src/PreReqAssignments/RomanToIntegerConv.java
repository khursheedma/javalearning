package PreReqAssignments;

import java.util.Scanner;

public class RomanToIntegerConv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);
		
		String str1 = new String();
		
		System.out.println("Enter the roman number: ");
		
		str1 = in.nextLine();
		
		in.close();
		
		System.out.println("Entered roman number is: " + str1);
		System.out.println(roman_to_decimal(str1));
		
		
	}

	public static int roman_to_decimal(String str1) {
		// TODO Auto-generated method stub
		
		int i = 0;
		int res = 0;
		
		int arrSize  = str1.length();
		
		char[]str1Arr = new char[arrSize];
		
		str1Arr = str1.toCharArray();
		
		while (i < str1Arr.length) {
			// System.out.println("in loop");
			int s1 = value(str1Arr[i]);
			
			if (i + 1 < str1Arr.length) {
				
				int s2 = value(str1Arr[i+1]);
				
				if (s1 >= s2) {
					res += s1;
					i += 1;
				} else {
					res += s2 - s1;
					i += 2;
				}
			} else {
				res += s1;
				i += 1;
			}
		}
		return res;
	}

	public static int value(char c) {
		// TODO Auto-generated method stub
		
		if (c == 'I') {
			return 1;
		} else if (c == 'V') {
			return 5;
		} else if (c == 'X') {
			return 10;
		} else if (c == 'L') {
			return 50;
		} else if (c == 'C') {
			return 100;
		} else if (c == 'D') {
			return 500;
		} else if (c == 'M') {
			return 1000;
		} else {
			return -1;
		}
	}

}
