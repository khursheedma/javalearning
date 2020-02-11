package JavaBasics.Day3;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter the mode of commute: Car, Walk, Train, Bicycle, Bus");
		
		String ModeOfCommute = s.next();
		
		// To convert lower case letter to upper case
		
		ModeOfCommute = ModeOfCommute.toUpperCase().trim();
		
		switch (ModeOfCommute) {
		
		case "BICYCLE" :
			System.out.println("it will take 40 min to reach office");
			break;
			
		case "BUS" :
			System.out.println("it will take 30 min to reach office");
			break;
			
		case "TRAIN" :
			System.out.println("it will take 20 min to reach office");
			break;
			
		case "CAR" :
			System.out.println("it will take 15 min to reach office");
			break;
			
		case "WALK" :
			System.out.println("You may not be able to reach office");
			break;
			
		default:
			System.out.println("Entered option is incorrect, please enter one of the option: Car, Walk, Train, Bicycle, Bus");
		
		}

	}

}
