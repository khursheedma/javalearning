package JavaBasics.Day3;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(;;) {
			
			Scanner s = new Scanner(System.in);

			System.out.println("Please enter the mode of commute: Car, Walk, Train, Bicycle, Bus, QUIT");
			
			String ModeOfCommute = s.next();
			
			// To convert lower case letter to upper case
			// ctrl + shift + b  to enable break point
		
			ModeOfCommute = ModeOfCommute.toUpperCase().trim();
			
			if (ModeOfCommute.equals("QUIT")) {
				System.out.println("The program will come out due to QUIT");
				break;
			}
			else {
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
					System.out.println("Entered option is incorrect, please enter one of the option: Car, Walk, Train, Bicycle, Bus, QUIT");
				
				}
			}
		}
	}

}
