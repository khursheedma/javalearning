package Java.Day3.Assignments;

/*
 * Check the given word is present in a given string.!
 * String = "this is me doing qa automation testing" Word="qa" 
 */

public class wordPresentInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "this is me doing qa automation testing";
		String word = "qa";
		boolean wordFound = false;
		
		System.out.println("str1 = " + str1);
		
		String[] str1Array = str1.split("\\s");
		
		/*for (int i=0; i < str1Array.length; i++) {

			if (word.equals(str1Array[i])) {
				wordFound = true;
				break;
			} 
		}
		
		if (wordFound) {
			System.out.println(word + " found");
		} else {
			System.out.println(word + " not found");
		}
		*/
		
		// using for-each ...
		for (String element : str1Array) {

			if (word.equals(element)) {
				wordFound = true;
				break;
			} 
		}
		
		if (wordFound) {
			System.out.println("word '" + word + "' found in a string -> '" + str1 + "'");
		} else {
			System.out.println("word '" + word + "' not found in string -> '" + str1 + "'");
		}
	}

}
