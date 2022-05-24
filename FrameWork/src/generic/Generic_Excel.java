package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class Generic_Excel {

public static String getData(String sheet,int row,  int column ) throws EncryptedDocumentException, IOException	
{
	String val= "";
	FileInputStream fis = new FileInputStream("path");
	Workbook wb = WorkbookFactory.create(fis);
	org.apache.poi.ss.usermodel.Cell c=wb.getSheet(sheet).getRow(row).getCell(column);
	return val= c.getStringCellValue();
	
}
	
	
	
}
