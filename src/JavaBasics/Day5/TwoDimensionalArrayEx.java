package JavaBasics.Day5;

public class TwoDimensionalArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][]= {{20, 5, 9}, {23, 24, 19}, {35, 7, 14}};
		
		for (int i=0; i<3; i++) {
			for(int j=0; j <3; j++) {
				System.out.println(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		int arr1[][]= {{20, 5, 9}, {23, 24, 19}, {35, 7, 14}};
		int arr2[][]= {{20, 5, 9}, {23, 24, 19}, {35, 7, 14}};
		
		int arr3[][] = new int[3][3];
		// int arr3[][]= {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
		
		
		System.out.println("Print arr1");
		for (int i=0; i<3; i++) {
			for(int j=0; j <3; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		

		System.out.println("Print arr2");
		for (int i=0; i<3; i++) {
			for(int j=0; j <3; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
		for (int i=0; i<3; i++) {
			for(int j=0; j <3; j++) {
				arr3[i][j] = arr1[i][j] + arr2[i][j];
			}
			System.out.println();
		}
		

		System.out.println("Print arr3");
		for (int i=0; i<3; i++) {
			for(int j=0; j <3; j++) {
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
	}

}
