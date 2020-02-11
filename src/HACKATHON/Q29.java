package HACKATHON;

/*
 * Q29. WJP to perform Merge sort using recursion
 */

public class Q29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {12, 11, 13, 5, 6, 7};
		
		System.out.println("Before sorting array");
		printArray(array);
		
        sortArrayUsingMerge(array, 0, array.length -1); 
        
        System.out.println("After sorting array"); 
        printArray(array); 

	}
	
	public static void sortArrayUsingMerge(int[] array, int l, int r) {
		 
		 if (l < r) { 
			 // Find the middle point 
	         int m = (l+r)/2; 
	  
	         // Sort first and second halves 
	         System.out.println("Print 1");
	         for (int i=l; i<=m; i++) {
	        	 System.out.print(array[i] + " ");
	         }
	         System.out.println();
	         sortArrayUsingMerge(array, l, m); 
	         System.out.println("Print 2");
	         for (int i=m+1; i<=r; i++) {
	        	 System.out.print(array[i] + " ");
	         }
	         System.out.println();
	         sortArrayUsingMerge(array , m+1, r); 
	  
	         // Merge the sorted halves 
	         System.out.println("Print 3");
	         for (int i=l; i<=r; i++) {
	        	 System.out.print(array[i] + " ");
	         }
	         System.out.println();
	         merge(array, l, m, r); 
	    } 
	}
	 
	public static void merge(int arr[], int l, int m, int r) { 
	        // Find sizes of two sub arrays to be merged 
	        int n1 = m - l + 1; 
	        int n2 = r - m; 
	  
	        // Create temp arrays 
	        int L[] = new int [n1]; 
	        int R[] = new int [n2]; 
	        // Copy data to temp arrays
	        for (int i = 0; i < n1; ++i) 
	            L[i] = arr[l + i]; 
	        for (int j = 0; j < n2; ++j) 
	            R[j] = arr[m + 1+ j]; 
	        // Merge the temp arrays, Initial indexes of first and second sub arrays 
	        int i = 0, j = 0; 
	        // Initial index of merged sub array array 
	        int k = l; 
	        while (i < n1 && j < n2) 
	        { 
	            if (L[i] <= R[j]) 
	            { 
	                arr[k] = L[i]; 
	                i++; 
	            } 
	            else
	            { 
	                arr[k] = R[j]; 
	                j++; 
	            } 
	            k++; 
	        } 
	        // Copy remaining elements of L[] if any 
	        while (i < n1) 
	        { 
	            arr[k] = L[i]; 
	            i++; 
	            k++; 
	        } 
	        // Copy remaining elements of R[] if any 
	        while (j < n2) 
	        { 
	            arr[k] = R[j]; 
	            j++; 
	            k++; 
	        } 
	    } 
	// Prints the array 
    public static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
}