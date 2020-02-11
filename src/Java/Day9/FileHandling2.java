package Java.Day9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * File handling operations read and write
 */

public class FileHandling2 {
	
	

	public static void main(String[] args) {
		
		String filePath = "/Users/khursheed/eclipse-workspace/TekArch/src/Java/Day9/test.txt";
		
		String line;
		// read file operation
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

}
