package readExcelAndPropertyyFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadExcerlDataFromAnotherMethod {

	public static void main(String[] args) throws IOException {
		//create an object of File class to open xlsx file
		File file=new File("D:\\Test1.xlsx");
		
		//create an object of FileInputStream to read xlsx file
		FileInputStream fis=new FileInputStream(file);
		
		//creating   Workbook  instance that refer to xlsx file
		XSSFWorkbook myWorkbook=new XSSFWorkbook(fis);
		
		XSSFSheet mySheet = myWorkbook.getSheet("Sheet1");
		
		 XSSFRow myRow = mySheet.getRow(0);
		 
		 XSSFCell myCell = mySheet.getRow(0).getCell(0);
		 
		 CellType cellType = myCell .getCellType();
		 System.out.println(cellType);
		 
		 String myValue = myCell .getStringCellValue();
		System.out.println(myValue);
		
		//get total number of row
		int totalNoOfRows = mySheet.getLastRowNum()-mySheet.getFirstRowNum();
		System.out.println(totalNoOfRows);//in row index start with 0 here single row so ans 0
		
		//get total cell number in a row
		short totalNoOfCell = mySheet.getRow(0).getLastCellNum();
		System.out.println(totalNoOfCell);
		
		Date value1 = mySheet.getRow(0).getCell(4).getDateCellValue();
		System.out.println(value1);

	}

}
