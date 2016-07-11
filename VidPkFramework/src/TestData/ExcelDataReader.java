package TestData;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader {
	
	XSSFWorkbook wb;
	
	XSSFSheet sheet1;
	
	public ExcelDataReader () throws Exception  {
		
		File src = new File("");
		
		FileInputStream fis = new FileInputStream(src);
		
		wb = new XSSFWorkbook(fis);
		
		sheet1 = wb.getSheetAt(0);
		
		
	}
	
	public String getData(String SheetNumber, int row, int column) {
		
		String  data = sheet1.getRow(row).getCell(column).getStringCellValue();
		return data;
	}

}
