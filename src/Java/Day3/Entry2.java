package Java.Day3;

public class Entry2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		int[] myNum = {10, 20, 30, 40};
		
		cars[2] = "polo";
		myNum[2] = 99;
		System.out.println(myNum[2] + " " +  myNum.length);
		
		// two dimensional array 
		int[][] nums = {{1,2,3,4,5}, {4,5}, {45, 33, 23}};
		System.out.println(nums[0][3]);
		System.out.println(nums[2][1]);
		nums[2][1] = 23;
		
		// three/multi dimensional array
		
		int[][][] nums3 = {{{1,2,3,4,5}, {4,5}, {45, 33, 23}},  {{1,2,3,4,5}, {4,5}, {45, 33, 23}}};
		
		System.out.println(nums3[0][1][0]);
		nums3[0][1][0] = 23;
		
		System.out.println(nums3[1][0][0]);
		
		System.out.println("nums3 length = " + nums3.length);
		
	}

}
