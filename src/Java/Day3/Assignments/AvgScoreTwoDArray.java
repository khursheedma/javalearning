package Java.Day3.Assignments;

/*
 * Write a Java program to find the average score of two students in three papers. 
 * NOTE: Given, score of first student is 60, 55 and 70 while score of the second student is 80, 60 and 41. i.e. 
 * int[][] score = { {60, 55, 70}, {80, 60, 41} }; 
 */
public class AvgScoreTwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] score = { {60, 55, 70}, {80, 60, 41} };
		float[] sumScore = new float[score.length];
		float[] avgScore = new float[sumScore.length];
		
		for (int i=0; i < score.length; i++) {
			sumScore[i] = 0;
			for (int j = 0; j < score[i].length; j++) {
				sumScore[i] = sumScore[i] + score[i][j];
			}
			avgScore[i] = sumScore[i] / score[i].length;
		}
		
		for (int i=0; i < avgScore.length; i++) {
			System.out.println("Average = " + avgScore[i]);
		}

	}

}
