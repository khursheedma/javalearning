package HACKATHON;

/*
 * Q60. Explain for each loop 
 * 
 * Answer:
 * 
 * The for-each loop is used to traverse array or collection in java. 
 * It is easier to use than simple for loop because we don't need to increment value and use subscript notation.
 * It works on elements basis not index. It returns element one by one in the defined variable.

Syntax:

    for(Type var:array){  
    // statements 
    }  

 */

public class Q60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//	Declaring an array  
	    int array[]={10,30,54,67,85};  
	    
	    //	Printing array using for-each loop  
	    for(int i:array){  
	        System.out.println(i);  
	    }  
	}
}
