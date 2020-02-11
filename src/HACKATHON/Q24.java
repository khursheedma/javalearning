package HACKATHON;

import java.util.Scanner;

/*
 * Q24. Write a program which inputs a positive natural number N 
 * and prints the possible consecutive number combinations, which when added give N. 
 * INPUT: N = 9 OUTPUT: 4 + 5 2 + 3+ 4 
 */
public class Q24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		
		for (int i=1; i < num; i++) {
			StringBuffer sb = new StringBuffer();
			
			int sum = i;
			sb.append(i).append(" + ");
			
			for (int j = i+1; sum < num; j++) {
				sb.append(j).append(" + ");
				sum = sum + j;
				
				if (sum == num) {
					System.out.println(sb.toString().substring(0, sb.length()-3));  // -2 or -3 is to remove + before/followed by space (to remove last characters)
				}
			}
		}
		
	}

}
