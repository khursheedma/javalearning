package Java.Day9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileEx {

	public static void main(String[] args) {
		
		
			String PropertiesFilePath = "/Users/khursheed/eclipse-workspace/TekArch/src/Java/Day9/data.properties";
		
			try {
				FileInputStream fileIn = new FileInputStream(PropertiesFilePath);
				Properties props = new Properties();
				props.load(fileIn);
				
				System.getProperties().putAll(props);
				
				System.out.println("username : "  + System.getProperty("username"));
				System.out.println("password : " + System.getProperty("password"));
			
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}	
	}

}
