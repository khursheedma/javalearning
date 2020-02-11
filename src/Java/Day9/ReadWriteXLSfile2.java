package Java.Day9;

/*
 * Exception in thread "main" org.apache.poi.poifs.filesystem.OfficeXmlFileException: 
 * The supplied data appears to be in the Office 2007+ XML. You are calling the part of POI that deals with OLE2 Office Documents. 
 * You need to call a different part of POI to process this data (eg XSSF instead of HSSF)
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

// read and write XLS file
// need to poi download related jar files

public class ReadWriteXLSfile2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		String fileName = "/Users/khursheed/eclipse-workspace/TekArch/src/Java/Day9/Book1.xlsx";
		readFromExcel(fileName);
		
	}
	
	public static void readFromExcel(String file) throws FileNotFoundException, IOException {
		
		HSSFWorkbook myExcelBook = new HSSFWorkbook(new FileInputStream(file));
		HSSFSheet myExcelSheet = myExcelBook.getSheet("Sheet1");
		HSSFRow row = myExcelSheet.getRow(0);
		
		if (row.getCell(0).getCellType() == HSSFCell.CELL_TYPE_STRING) {
			String name = row.getCell(0).getStringCellValue();
			System.out.println("name : " + name);
		}
		
		if (row.getCell(1).getCellType() == HSSFCell.CELL_TYPE_NUMERIC) {
			Date birthDate = row.getCell(1).getDateCellValue();
			System.out.println("Date : " + birthDate);
		}
		
	}
}
