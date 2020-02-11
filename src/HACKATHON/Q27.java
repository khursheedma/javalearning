package HACKATHON;

/*
 * Q27. WJP to perform ascending order Quick sort  
 */

public class Q27 {

	public static void main(String[] args) {
		
		int array[] = {64,25,12,22,11};
		
		System.out.println("Before sorting array");
		printArray(array);
		
        sortArrayUsingQuickSort(array, 0, array.length -1); 
        
        System.out.println("After sorting array"); 
        printArray(array); 
	}
	
	 public static void sortArrayUsingQuickSort(int[] array, int low, int high) {
		 
		 if (low < high) 
	        { 
	            // pI is partitioning index, array[pI] is now at right place 
	            int pI = partition(array, low, high); 
	  
	            // Recursively sort elements before partition and after partition 
	            sortArrayUsingQuickSort(array, low, pI-1); 
	            sortArrayUsingQuickSort(array, pI + 1, high); 
	        } 
	}
	 
	 public static int partition(int array[], int low, int high) 
	    { 
	        int pivot = array[high];  
	        int i = (low - 1); // index of smaller element 
	        for (int j=low; j<high; j++) 
	        { 
	            // If current element is smaller than the pivot 
	            if (array[j] < pivot) 
	            { 
	                i++; 
	                // swap array[i] and array[j] 
	                int temp = array[i]; 
	                array[i] = array[j]; 
	                array[j] = temp; 
	            } 
	        } 
	        // swap array[i+1] and array[high] (or pivot) 
	        int temp = array[i+1]; 
	        array[i+1] = array[high]; 
	        array[high] = temp; 
	        return i+1; 
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