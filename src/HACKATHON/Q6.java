package HACKATHON;

/*
 * Q6. WJP to perform ascending order Selection sort
 */

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {64,25,12,22,11};
		
		System.out.println("Before sorting array");
		printArray(array);
		
        sortArrayUsingSelection(array); 
        
        System.out.println("After sorted array"); 
        printArray(array); 

	}
	
	 public static void sortArrayUsingSelection(int[] array) {
		 
		 int n = array.length; 
		  
	        // One by one move boundary of unsorted sub array 
	        for (int i = 0; i < n-1; i++) 
	        { 
	            // Find the minimum element in unsorted array 
	            int min_index = i; 
	            for (int j = i+1; j < n; j++) 
	                if (array[j] < array[min_index]) 
	                    min_index = j; 
	  
	            // Swap the found minimum element with the first element 
	            int temp = array[min_index]; 
	            array[min_index] = array[i]; 
	            array[i] = temp; 
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
