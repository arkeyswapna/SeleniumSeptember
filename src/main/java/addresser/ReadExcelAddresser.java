package addresser;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelAddresser {
	
	public static String[][] readExcel(String ExcelFileName) throws IOException{
		
		XSSFWorkbook wbook=new XSSFWorkbook("data/"+ExcelFileName+".xlsx");
		XSSFSheet sheet=wbook.getSheetAt(0);
		int rowcount = sheet.getLastRowNum();
		short columncount = sheet.getRow(0).getLastCellNum();
		
		String[][] data=new String [rowcount][columncount];
		
		for (int i = 1; i <= rowcount; i++) {
			
			XSSFRow row=sheet.getRow(i);
			
			for (int j = 0; j < columncount; j++) {
				
				XSSFCell cell = row.getCell(j);
				String stringCellValue=cell.getStringCellValue();
  				System.out.println(stringCellValue);
				data[i-1][j]=stringCellValue;
				
			}
			
		}
		
		
		wbook.close();
		return data;
		
	}

}
