package Java.Day3;

public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int iArrNum[] = {7,2,4,1,3,5,6,8,2,10};
		int iArrResult[] = new int[10];
		// 10, 2, 4, 2, 8, 6, 5, 3, 1, 7]
		
		//size of an array .. with that size you have to 
		//declare one more array to add your output
		
		//size will be different --> index number different
		//Check whether number is even or not
		
		//
		
		int lastIndex=iArrNum.length-1;
		int temp=0;
		for (int index=0;index<=lastIndex;index++) {
			
			if(iArrNum[index]%2 != 0) {
			temp=iArrNum[index];
			iArrNum[index]=iArrNum[lastIndex];
			iArrNum[lastIndex] = temp;
			lastIndex--;
			
		}
		}
		for(int index=0;index<iArrNum.length;index++) {
			System.out.print(iArrNum[index] + " ");
		}
	
	}
}
