package JavaBasics.Day4;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// length = ?
				// Character = ?
				// Take from user at runtime (scanner)
				
				/*  output:
				 *   %
				 *   %%
				 *   %%%
				 *   %%%%
				 *   %%%%%
				 *   %%%%%%
				 */
				
				Scanner in = new Scanner(System.in);
				System.out.println("Enter the length");
				
				int p = in.nextInt();
				System.out.println("Enter the character");
				String ch = in.next();
				
				for (int i  = 1; i<=p; i++) {
					for (int j =1; j<=i; j++) {
						System.out.print(ch + " ");
					}
					System.out.println();
				}

	}

}
