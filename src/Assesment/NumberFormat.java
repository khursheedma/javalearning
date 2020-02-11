package Assesment;

public class NumberFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r, c;
		
		for (r=1; r<=10; r++) {
			for (c = 1; c<= 10 -r; c++) {
				System.out.print(c+ " ");
			}
			System.out.println("");
		}

	}

}
