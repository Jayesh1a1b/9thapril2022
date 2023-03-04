package readExcelAndPropertyyFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAllTypeOfData {

	private static final CellType CellType = null;

	public static void main(String[] args) throws IOException {
		File file=new File("D:\\test1.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook myWorkbook = new XSSFWorkbook(fis);
		XSSFSheet mySheet = myWorkbook.getSheet("Sheet3");
		
		int rows = mySheet.getLastRowNum();
		int cells = mySheet.getRow(0).getLastCellNum()-1;
		
		System.out.println(" total row "+rows);
		System.out.println(" total cells "+cells);
		
		for(int i=0;i<=rows;i++)
		{
			for(int j=0;j<=cells;j++)
			{
				XSSFCell cellValue = mySheet.getRow(i).getCell(j);
				CellType myCellType = cellValue.getCellType();
				
			if(myCellType==CellType.STRING)
			{
				String value = cellValue.getStringCellValue();
				System.out.print(value+" ");
			}
			else if(myCellType==CellType.BOOLEAN)
             {
            	boolean value = cellValue.getBooleanCellValue();
				System.out.print(value+" ");
              }
			else if(myCellType==CellType.NUMERIC)
			{
				double value = cellValue.getNumericCellValue();
				System.out.print(value+" ");
			}
			
		
			}
			System.out.println();
		}

	}

}
