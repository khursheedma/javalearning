package Java.Day9.Assignments;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Write a Java program to store text file content line by line into an array. 
 */

public class TextFileContentsIntoArray {
	
	public static void main(String[] args) {
		
		String filePathForRead = "/Users/khursheed/eclipse-workspace/TekArch/src/Java/Day9/Assignments/readTextFile2.txt";
		FileReadTextFile(filePathForRead);
	}
	
	public static void FileReadTextFile(String filePath) {
		
		String line;
		String[] wordsArray = null;
		String[] resultArray = new String[25];
		
		System.out.println("Inside FileReadTextFile() method");
		try {
			FileReader fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr);
			
			int j = 0;
			while ((line  = br.readLine()) != null) {
				System.out.println("line : " + line);  // just printing each line
				wordsArray = line.split("\\s+");
				for (int i=0; i < wordsArray.length; i++) {
					// System.out.println("words : " + wordsArray[i]);
					resultArray[j] = wordsArray[i];
					j = j + 1;
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Printing words after converting into an array : ");
		
		for (int i=0; i < resultArray.length; i++) {
			System.out.print(resultArray[i] + " ");
		}
	}
}