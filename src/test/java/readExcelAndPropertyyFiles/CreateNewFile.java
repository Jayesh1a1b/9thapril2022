package readExcelAndPropertyyFiles;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {

	public static void main(String[] args) throws IOException {
		
		String filePath="D:\\Text1.xlsx";
		File file=new File(filePath);
		
		File file1=new File("D:\\study.xlsx");
		if(!file1.exists())
		{
			file1.createNewFile();// create blank file on location
		}
		

	}

}
