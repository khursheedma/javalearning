package Java.Day9.Assignments;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Write a Java program to write and read a plain text file 
 */

public class FileReadWriteOpsOfTextFile {
	
	public static void main(String[] args) {
		
		String filePathForRead = "/Users/khursheed/eclipse-workspace/TekArch/src/Java/Day9/Assignments/readTextFile.txt";
		String filePathForWrite = "/Users/khursheed/eclipse-workspace/TekArch/src/Java/Day9/Assignments/writeTextFile.txt";	
		FileReadTextFile(filePathForRead);
		FileWriteTextFile(filePathForWrite);
	}
	
	public static void FileReadTextFile(String filePath) {
		
		String line;
		System.out.println("Inside FileReadTextFile() method");
		try {
			FileReader fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr);
		
			while ((line  = br.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void FileWriteTextFile(String filePath) {
		
		System.out.println("Inside FileWriteTextFile() method");
		try {
			FileWriter fw = new FileWriter(filePath);   // 2nd arg -> ,true for append
			BufferedWriter bw = new BufferedWriter(fw);
					
			bw.write("This text file has been created to test write operation in Java");
			bw.newLine();
			bw.write("Write test is complete");
			bw.close();	
					
		} catch (FileNotFoundException e) {
			e.printStackTrace();
					
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}