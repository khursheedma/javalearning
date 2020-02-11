package Java.Day9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

// read and write XLS file
// need to poi download related jar files


public class ReadWriteXLSfile {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		String fileName = "/Users/khursheed/eclipse-workspace/TekArch/src/Java/Day9/XLSTest.xlsx";
		readFromExcel(fileName);
		
	}
	
	public static void readFromExcel(String file) throws FileNotFoundException, IOException {
		
		XSSFWorkbook myExcelBook = null;
		
		try {
			myExcelBook = new XSSFWorkbook(new FileInputStream(file));
			// System.out.println("myExcelBook" + myExcelBook);
		} catch (Exception e) {
			e.printStackTrace();
		}
		XSSFSheet myExcelSheet = myExcelBook.getSheet("Sheet1");
		XSSFRow row = myExcelSheet.getRow(0);
		
		if (row.getCell(0).getCellType() == XSSFCell.CELL_TYPE_STRING) {
			String name = row.getCell(0).getStringCellValue();
			System.out.println("name : " + name);
		}
		
		if (row.getCell(1).getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
			Date birthDate = row.getCell(1).getDateCellValue();
			System.out.println("Date : " + birthDate);
		}
		
	}
}
