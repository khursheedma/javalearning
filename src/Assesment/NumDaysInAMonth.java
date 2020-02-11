package Assesment;

import java.util.Scanner;

public class NumDaysInAMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a month number to find the number of days in a month? ");
		int month = in.nextInt();
		
		in.close();
		
		switch (month) {
			case 1:
				System.out.println("January month contains " + 31 + " days");
				break;
			case 2:
				System.out.println("February month contains " + 28 + " or" + 29 + " days");
				break;
			case 3:
				System.out.println("March month contains " + 31 + " days");
				break;
			case 4:
				System.out.println("April month contains " + 30 + " days");
				break;
			case 5:
				System.out.println("May month contains " + 31 + " days");
				break;
			case 6:
				System.out.println("June month contains " + 30 + " days");
				break;
			case 7:
				System.out.println("July month contains " + 31 + " days");
				break;
			case 8:
				System.out.println("August month contains " + 31 + " days");
				break;
			case 9:
				System.out.println("September month contains " + 30 + " days");
				break;
			case 10:
				System.out.println("Octorber month contains " + 31 + " days");
				break;
			case 11:
				System.out.println("November month contains " + 30 + " days");
				break;
			case 12:
				System.out.println("December month contains " + 31 + " days");
				break;
			default:
				System.out.println("Entered in correct month number, please enter in the range of 1-12");
		}

	}

}
