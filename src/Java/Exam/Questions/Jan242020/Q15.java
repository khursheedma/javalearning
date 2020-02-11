package Java.Exam.Questions.Jan242020;

import java.util.Scanner;

// Q15: program to remove duplicate characters from a given string presents in another given string. 
// Sample Output: The given string is: duplicate characters from a given string The given mask string is: given The new string is: duplicate characters from a str

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string to remove duplicate characters from in it : ");
		String originalString = sc.nextLine();
		sc.close();
		
		String newString = ""; 
        int len = originalString.length(); 
          
        // traverse the string and check for repeating chars using IndexOf() method 
        
        for (int i = 0; i < len; i++)  
        { 
            // character at i'th index of s 
            char ch = originalString.charAt(i); 
              
            // if ch is present in newString, it returns the index of ch, else it returns -1 
            if (newString.indexOf(ch) < 0) 
            { 
                // adding ch to newString if -1 is returned 
                newString += ch; 
            } 
        } 
        System.out.println("Resultant (new) string after removing duplicate characters is : " + newString);
	}

}
