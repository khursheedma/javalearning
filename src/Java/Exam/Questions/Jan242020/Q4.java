package Java.Exam.Questions.Jan242020;

// Q4: Write a method that will remove given character from the String? 

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Hello How are you";		
		System.out.println(str1.replaceAll("l", ""));
		System.out.println(str1.replaceAll("H", ""));
		System.out.println(str1.replaceAll("o", ""));
		System.out.println(str1.replaceAll("y", ""));
			
	}

}
