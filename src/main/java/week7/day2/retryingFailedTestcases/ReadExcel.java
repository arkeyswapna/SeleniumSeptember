package week7.day2.retryingFailedTestcases;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import freemarker.core.ReturnInstruction.Return;

public class ReadExcel {
	
	public static String[][] readExcel(String  ExcelFileName) throws IOException {
		
		XSSFWorkbook wbook= new XSSFWorkbook("data/"+ExcelFileName+".xlsx");
		//Read the first data
		XSSFSheet sheet = wbook.getSheetAt(0);
		//Finding total rows
		int rowcount = sheet.getLastRowNum();
		System.out.println("Total number of rows "+rowcount);
		//Finding total count from first row
		short columncount = sheet.getRow(0).getLastCellNum();
		System.out.println("Total no of columns "+columncount);
//		//Reading first row data(TestLeaf)
//		System.out.println(sheet.getRow(1).getCell(0));
		
		String[][] data= new String[rowcount][columncount];
		
		
		//Instead of writing for each row we are iterating through a for loop
		for (int i = 1; i <= rowcount; i++) {
			
			XSSFRow row = sheet.getRow(i);
			
			for (int j = 0; j < columncount; j++) {
				
				XSSFCell cell= row.getCell(j);				
				//Read the data
				String stringCellValue = cell.getStringCellValue();
				//Print the data
				System.out.println(stringCellValue);
				data[i-1][j]=stringCellValue;
			}
			
		}
		
		//close your work book
		wbook.close(); 
		return data;
		
	}

}
