package Java.Day9.Assignments;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Write a Java program to append text to an existing file
 */

public class AppendTextFileExample {
	
	public static void main(String[] args) {
		
		String filePathForAppend = "/Users/khursheed/eclipse-workspace/TekArch/src/Java/Day9/Assignments/appendTextFile.txt";
		String filePathForRead = "/Users/khursheed/eclipse-workspace/TekArch/src/Java/Day9/Assignments/appendTextFile.txt";	
		FileAppendTextFile(filePathForAppend);
		FileReadWriteOpsOfTextFile.FileReadTextFile(filePathForRead);  // calling existing function from another class for reading purpose
	}
	
	public static void FileAppendTextFile(String filePath) {
		
		System.out.println("Inside FileAppendTextFile() method");
		try {
			FileWriter fw = new FileWriter(filePath, true);   // 2nd arg -> ,true for append
			BufferedWriter bw = new BufferedWriter(fw);
					
			bw.write("This text file has been created to test Fil I/O append operation in Java");
			bw.newLine();
			bw.write("Append test is complete");
			bw.newLine();
			bw.close();	
					
		} catch (FileNotFoundException e) {
			e.printStackTrace();
					
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}