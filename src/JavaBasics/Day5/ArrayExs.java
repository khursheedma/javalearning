package JavaBasics.Day5;

public class ArrayExs {
	
	/*
	 * Array :
	 * 
	 * It is a collection of similar type of elements that have continuous memory locations
	 * In another word, it is a data structure where we can store similar elements
	 * It's size is fixed
	 * First element is stored at 0 (zero) index
	 * 
	 * 
	 * 	----------------------------
	 * 	| 10| 20  |30  |40  | 50  |
	 * 	----------------------------
	 *	  0    1    2    3    4       ---> index
	 *		array length = 5
	 *
	 *   Note: Arrays.sort(arr);
	 *
	 *	Advantage:
	 *   		1. Code optimization : we can retrieve or sort data efficiently
	 *   		2. Random access	 : we can get any data located at an index position
	 *
	 *  Disadvantage:
	 *      	Size limit: we can store only fixed size of elements in the array
	 *      
	 *  Types of array :
	 *     1. 1-D array  : single row with multiple column
	 *     2. 2-D array / Multi dimensional array  : combination of multiple rows and columns
	 *     
	 *    1 D array:
	 *    dataType [] arr; or
	 *    dataType [] arr; or
	 *    dataType [] arr;   <---- declaration
	 *    
	 *    dataType arr[] = new dataType[size]  <--- initialization of an array
	 *     
	 *     a[0] = 10
	 *     a[1] = 20
	 *     a[2] = 30 and so on
	 *     
	 *     
	 *     
	 *     
	 *  Multi dimensional  array:
	 *  
	 *    index |	|	| 	|
	 *    -------------------
	 *		0    20    5   9
	 *    -------------------
	 *	 	1    23    24  
	 *	  -------------------	
	 *
	 *	  --------------------	
	 *
	 *		2-D array:
	 *			dataType[][] arr;
	 *			dataType[] []arr;
	 *			dataType   [][]arr; or
	 *			dataType	arr[][];   <---- declaration		
	 *	
	 *		dataType arr[][] = new dataType{size[size];  <--- instantiation of an array
	 *
	 *
	 *
	 *
	 *
	 */		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("to print elements");
		for (int a = 1; a<=10; a++) {
			System.out.println(a);  // example of code optimization   (instead of repeating each step separately)
		}
		
		int b[] = new int[6];  //  declaration + instantiation
		
		b[0]= 10;
		b[1]= 20;
		b[2]= 30;
		b[3]= 40;
		b[4]= 50;
		b[5]= 60;
		System.out.println("to  access and print array elements");
		for (int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		System.out.println("to  access and print array elements, another way");
		int c[] = {10, 20, 30, 40, 40, 50};
		
		for (int j =0; j< c.length; j++) {
			System.out.println(c[j]);
		}
		
		
		System.out.println("to  access and print array elements");
		int d[] = {100, 120, 230, 410, 150};
		
		for (int k =0; k< d.length; k++) {
			System.out.println(d[k]);
		}
		
		

	}

}
