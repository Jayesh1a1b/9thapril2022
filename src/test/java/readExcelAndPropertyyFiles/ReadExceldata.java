package readExcelAndPropertyyFiles;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;




public class ReadExceldata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
	File file = new File("D:\\Test1.xlsx");
 Workbook myWorkbook = WorkbookFactory.create(file);
 Sheet mySheet = myWorkbook.getSheet("Sheet1");
 String value = mySheet.getRow(0).getCell(0).getStringCellValue();
 System.out.println(value);
 
 String value1 = mySheet.getRow(0).getCell(1).getStringCellValue();
 System.out.println(value1);
 
   double value2 = mySheet.getRow(0).getCell(2).getNumericCellValue();
 System.out.println(value2);
 
 boolean value5 = mySheet.getRow(0).getCell(3).getBooleanCellValue();
 System.out.println(value5);
	}

}
