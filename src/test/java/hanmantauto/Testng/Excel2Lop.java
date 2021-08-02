package hanmantauto.Testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel2Lop {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String path="C:\\Users\\91952\\Desktop\\read.xlsx";
		
		FileInputStream i=new FileInputStream(path);
		
		Workbook value = WorkbookFactory.create(i);
		
		Sheet sheet = value.getSheet("sheet1");
		
		for(int j=0;j<=4;j++) {
			for(int k=0;k<=2;k++) {
				if(k==0) {
				String x = sheet.getRow(j).getCell(k).getStringCellValue();
				System.out.print(x+"  ");
			}
				else if(k>0) {
					double y = sheet.getRow(j).getCell(k).getNumericCellValue();
					System.out.print(y+"  ");
				}
			
		}
			System.out.println();
		
	}

	}}
