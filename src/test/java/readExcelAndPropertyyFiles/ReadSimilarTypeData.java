package readExcelAndPropertyyFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadSimilarTypeData {

	public static void main(String[] args) throws IOException {
		// create object of File class to open xlsx file

		File file = new File("D:\\Test1.xlsx");

//create object of FileInputStream class  to read  excel file
		FileInputStream fis = new FileInputStream(file);

//creating workbook instance that refer to xlsx
		XSSFWorkbook myWorkbook = new XSSFWorkbook(fis);
		XSSFSheet mySheet = myWorkbook.getSheet("Sheet2");
		
		int rows = mySheet.getLastRowNum();
		System.out.println("total rows "+rows);//index start from 0
		int  cells = mySheet.getRow(0).getLastCellNum();
		System.out.println("total cells "+cells);//index not start 0
		
		//reading multiple data  from single row
		
		for(int i=0;i<=2;i++)
		{
			String singleRowvalue = mySheet.getRow(0).getCell(i).getStringCellValue();
			System.out.println(singleRowvalue);
		}
		System.out.println("------------------------------------");
		//reading multiple data  from single cell
		for(int j=0;j<=3;j++)
		{
			String singleCellvalue = mySheet.getRow(j).getCell(0).getStringCellValue();
			System.out.println(singleCellvalue);
		}
	}

}
