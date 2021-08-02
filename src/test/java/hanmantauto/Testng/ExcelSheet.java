package hanmantauto.Testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet {

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String path="C:\\Users\\91952\\Desktop\\read.xlsx";
		FileInputStream file=new FileInputStream(path);
		
	Double value=WorkbookFactory.create(file).getSheet("sheet1").getRow(4).getCell(2).getNumericCellValue();
	
	System.out.println(value);
	
	
	}
}
