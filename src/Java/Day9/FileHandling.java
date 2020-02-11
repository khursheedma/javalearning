package Java.Day9;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/*
 * File handling operations read and write
 */

public class FileHandling {
	
	

	public static void main(String[] args) {
		
		String filePath = "/Users/khursheed/eclipse-workspace/TekArch/src/Java/Day9/writeTest.txt";
				
		// write file operation
		try {
			FileWriter fw = new FileWriter(filePath);   // 2nd arg -> ,true for append
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("Hello! How are you?");
			bw.newLine();
			bw.write("Alhamdulillah");
			
			bw.close();
				
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
