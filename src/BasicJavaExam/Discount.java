package BasicJavaExam;

/*
 * Write java program to ask user to enter amount and print the corresponding offers.
 */

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the amount value to find the discount: ");
		
		int amount = sc.nextInt();
		
		sc.close();
		
		if (amount <=50 ) {
			System.out.println("2% discount for the purchase of amount : " + amount);
		} else if ((amount > 50) && (amount <= 149)){
			System.out.println("5% discount for the purchase of amount : " + amount);
		} else if ((amount > 149) && (amount <= 249)){
			System.out.println("10% discount for the purchase of amount : " + amount);
		}  else if ((amount > 249) && (amount <= 600)){
			System.out.println("15% discount for the purchase of amount : " + amount);
		} else if ((amount > 600) && (amount <= 800)){
			System.out.println("20% discount for the purchase of amount : " + amount);
		} else {
			System.out.println("25% discount for the purchase of amount : " + amount);
		}
		
	}

}
