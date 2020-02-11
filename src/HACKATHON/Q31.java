package HACKATHON;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Q31. Read a file content and write it to a new file in reverse order.(reverse line 1-10 to line 10-1)
 */

public class Q31 {
		
		public static void main(String[] args) {
			
			String filePathForRead = "/Users/khursheed/eclipse-workspace/TekArch/src/HACKATHON/readTextFile.txt";
			String filePathForWrite = "/Users/khursheed/eclipse-workspace/TekArch/src/HACKATHON/writeTextFileReverseLines.txt";	
			BufferedReader br = null;
			BufferedWriter bw = null;
			
			try {
				FileReader fr = new FileReader(filePathForRead);
				br = new BufferedReader(fr);
				FileWriter fw = new FileWriter(filePathForWrite, true);   // 2nd arg -> ,true for append
				bw = new BufferedWriter(fw);
				// bw.write("Good how are you");
				
				FileReadTextFileWriteReverse(br, bw);  // reverse lines
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();	
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (bw != null)
					try {
						br.close();
						bw.close();
					} catch (IOException e) {
						e.printStackTrace();
					}  
			}
		}

		public static void FileReadTextFileWriteReverse(BufferedReader br, BufferedWriter bw) {
			
			String line;
			System.out.println("Inside FileReadTextFileWriteReverse() method");
			
			try {
				while ((line  = br.readLine()) != null) {
					// System.out.println("line : " + line);
					FileReadTextFileWriteReverse(br, bw);
					// System.out.println("After recursive call line : " + line);
					bw.write(line);
					bw.newLine();
				}				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
}
