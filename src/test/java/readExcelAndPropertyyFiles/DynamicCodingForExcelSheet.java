package readExcelAndPropertyyFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DynamicCodingForExcelSheet {

	public static void main(String[] args) throws IOException {
		File file=new File("D:\\Test1.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook myWorkbook = new XSSFWorkbook(fis);
		XSSFSheet mySheet = myWorkbook.getSheet("Sheet2");
		
		int rows = mySheet.getLastRowNum();
		int cells = mySheet.getRow(0).getLastCellNum()-1;
		System.out.println(" Total rows "+rows);
		System.out.println(" Total cells "+cells);
		
		for(int i=0;i<=rows;i++)
		{
			for(int j=0;j<=cells;j++)
			{
				String value = mySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
			System.out.println();
		}

	}

}
