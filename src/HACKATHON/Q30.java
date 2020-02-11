package HACKATHON;

/*
 * Q30. Write a function to find out longest palindrome sub string in a given string?
 */

public class Q30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String str1 = "kayak"; 
		//String str1 = "abcMalayalaMxyz";
		String str1 = "abdraccarxyz"; // even length palindrome
		//String str1 = "abdracecarxyz";  // odd length palindrome
        System.out.println("Length is: " + longestPalindromeSubstring(str1));

	}
	
	static int longestPalindromeSubstring(String str) { 
        int maxLength = 1; // The result (length of longest palindrome sub string) 
  
        int start = 0; 
        int len = str.length(); 
  
        int low, high; 
  
        // One by one consider every character as center point of even and length palindromes 
        //for (int i = 1; i < len; ++i)  
        for (int i=0; i<len; i++)
        { 
        	
            // Find the longest even length palindrome with center points as i-1 and i. 
        	
            /*low = i - 1; 
            high = i;*/ 
        	
        	low = i;
        	high = i+1;
           
            while (low >= 0 && high < len && str.charAt(low) == str.charAt(high)) {
            	System.out.println("even loop low and high " + low + " " + high);
                if (high - low + 1 > maxLength) { 
                    start = low; 
                    maxLength = high - low + 1; 
                } 
                --low; 
                ++high; 
            } 
  
            // Find the longest odd length palindrome with center point as i 
            /*low = i - 1; 
            high = i + 1;*/ 
            low = i; 
            high = i + 2; 
            while (low >= 0 && high < len && str.charAt(low) == str.charAt(high)) { 
            	 System.out.println("odd loop low and high " + low + " " + high);
                if (high - low + 1 > maxLength) { 
                    start = low; 
                    maxLength = high - low + 1; 
                } 
                --low; 
                ++high; 
            } 
        } 
  
        System.out.print("Longest palindrome substring is: "); 
        printSubString(str, start, start + maxLength - 1); 
  
        return maxLength; 
    } 
	
	public static void printSubString(String str, int low, int high) { 
        System.out.println(str.substring(low, high + 1)); 
    } 
  
}
