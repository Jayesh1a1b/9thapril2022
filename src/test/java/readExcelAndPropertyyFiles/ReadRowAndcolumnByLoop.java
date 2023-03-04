package readExcelAndPropertyyFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadRowAndcolumnByLoop {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\Test1.xlsx");
		FileInputStream fis=new FileInputStream(file);
		
		XSSFWorkbook myWorkbook = new XSSFWorkbook(fis);
		XSSFSheet mySheet = myWorkbook.getSheet("Sheet2");
		
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=2;j++)
			{
				String value = mySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
			System.out.println();
		}
	

	}

}
