package HACKATHON;

/*
 * Q26. WJP to merge two sorted array.
 * (Do not use third array) array1[10] = 1,2,4,6,9,10 array2[4] = 3, 5,7,8 
 * After merge : array1[10] = 1,2,3,4,5,6,7,8,9,10
 */

public class Q26 {

	public static void main(String[] args) {
	
		int[] array1 = {1, 2, 4, 6, 9, 10, 0, 0, 0, 0};	// initialized last four array elements with 0 as array2 size is 4.
		int[] array2 = {3, 5, 7, 8};
		
		System.out.println("Before sorting array1");
		printArray(array1);
		System.out.println("Before sorting array2");
		printArray(array2);
		
		mergeSortedArrays(array1, array2); 
        
        System.out.println("After sorted array"); 
        printArray(array1); 
	}
	
	public static void mergeSortedArrays(int array1[], int array2[])
	{
	    int k;
	    int m = array1.length - array2.length -1;  // subtracting size of the array2
	    int n = array2.length -1;
	    
	    k = m + n + 1;  // total size 10 = 5 + 3 + 1 -> index 0 to 9
	    
	    // merge arrays
	    while (n >= 0) {
	    	
	    	if (m >= 0 && array1[m] > array2[n]) {
	    		array1[k] = array1[m];
	    		m--;
	    	} else {
	    		array1[k] = array2[n];
	    		n--;
	    	}
	    	k--;
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
