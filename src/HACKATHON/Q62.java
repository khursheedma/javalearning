package HACKATHON;

/*
 * Q 62. write an algorithm to reverse first 3 numbers, then next 3 numbers, then next 3 numbers, 
 * the number will be based on var k. 
 * Array = [3,2,4,7,0,3,1,5,8, 4] k=3 OutPut = [4,2,3,3,0,7,8,5,1,4]
 */
public class Q62 {

	public static void main(String[] args) {
		
		int[] array = {3, 2, 4, 7, 0, 3, 1, 5, 8, 4};
		int k = 3;
		
		System.out.println("Before reversing array");
		for (int i=0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		ReverseIntArray(array, k);
		
		System.out.println("After reversing array");
		
		for (int i=0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void ReverseIntArray(int[] array, int k) {

		for (int i = 0; i <  array.length; i =i+ k) // imp: i = i+k
        { 
            int left = i; 
      
            // to handle case when k is not multiple of n 
            int right = Math.min(i + k - 1, array.length - 1); 
              
            // reverse the sub-array [left, right] 
            while (left < right) 
            { 
                int temp=array[left]; 
                array[left]=array[right]; 
                array[right]=temp; 
                left+=1; 
                right-=1; 
            } 
        } 
	}
}
