package Java.Day3.Assignments;

/*
 * WJP to replace each substring of a given string that matches the given regular expression with the given replacement 
 * String: "Dog chases cat, Cat chases rat". Note: Replace 'cat' with 'rat' 
 */

public class ReplaceSubStrInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Dog chases cat, Cat chases rat";
		String subString = "rat";
	
		System.out.println("Printing string before replacement str1 =  " + str1);
		
		String str2 = str1.replaceAll("cat", subString);  // str2 is referencing to new string which is created in "string constant pool"
			
		System.out.println("Printing string after replacement  str2 =  " + str2);
		
		System.out.println("Printing string with no change to  str1 =  " + str1);
	}
}
