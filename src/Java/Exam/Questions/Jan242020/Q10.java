package Java.Exam.Questions.Jan242020;

// Q10: Program to print the odd numbers from 1 to 99. Prints one number per line.

public class Q10 {

	public static void main(String[] args) {		
		for (int i=1; i<=99; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
}