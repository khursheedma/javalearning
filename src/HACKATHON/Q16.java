package HACKATHON;

/*
 * Q16. Write a method that will remove given character from the String?
 */

public class Q16 {

	public static void main(String[] args) {

		String str1 = "Hello How are you";		
		System.out.println(str1.replace("l", ""));
		System.out.println(str1.replace("H", ""));
		System.out.println(str1.replaceAll("o", ""));
		System.out.println(str1.replaceAll("y", ""));
		
		System.out.println("another method of removing a char from string");
		System.out.println(removeCharFromString(str1, 6));
	}

	public static String removeCharFromString(String str1, int i) {
		
		return str1.substring(0, i) + str1.substring(i+1);
	}

}
