package Java.Day9.Assignments;

import java.io.File;

/*
 * Write a Java program to check if a file or directory has read and write permission 
 */

public class CheckFileOrDirRWPermission {

	public static void main(String[] args) {
	
		// creating a file instance 
        File file = new File("/Users/khursheed/eclipse-workspace/TekArch/src/Java/Day9/Assignments/readTextFile.txt");
       
        // check if the file exists 
        boolean fileExists = file.exists(); 
        
        if(fileExists == true) 
        { 
            // printing the permissions associated with the file 
            System.out.println("Executable: " + file.canExecute()); 
            System.out.println("Readable: " + file.canRead()); 
            System.out.println("Writable: "+ file.canWrite()); 
        } 
        else
        { 
            System.out.println("File NOT found."); 
        } 

	}
}