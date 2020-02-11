package HACKATHON;

/*
 * Q32. You are given two sorted arrays, A and B, and A has a large enough buffer at the end to hold B. 
 * Write a method to merge B into A in sorted order.
 */

public class Q32 {

	
	public static void main(String[] args) {

		int arrayA[] = {10, 12, 13, 14, 18, 0, 0, 0, 0, 0};  // initialized with 0 based on the size arrayB 
        int n = 5; 
        int arrayB[] = {16, 17, 19, 20, 22}; 
        int m = 5; 
        System.out.println("Before sorting array A");
        printArray(arrayA);
        System.out.println();
        System.out.println("Before sorting array B");
        printArray(arrayB);
        System.out.println();
        sortedMerge(arrayA, arrayB, n, m);
        
        System.out.println("Sorted array");
        printArray(arrayA); 
	}
	
	public static void sortedMerge(int a[], int b[], int n, int m)  
    { 
        int i = n - 1; 
        int j = m - 1; 
          
        int lastIndex = n + m - 1; 
          
        // Merge a and b, starting from last element in each  
        while (j >= 0) { 
          
            // End of a is greater than end of b 
            if (i >= 0 && a[i] > b[j]) { 
                // Copy Element 
                a[lastIndex] = a[i];  
                i--; 
            } else {   
                // Copy Element 
                a[lastIndex] = b[j];  
                j--; 
            } 
            // Move indices 
            lastIndex--;  
        } 
    } 
	// Prints the array 
    public static void printArray(int arrayA[]) 
    { 
        int n = arrayA.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arrayA[i]+" "); 
        System.out.println(); 
    } 
}
