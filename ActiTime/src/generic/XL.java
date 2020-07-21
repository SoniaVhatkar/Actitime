package generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class XL {
	public static int getRowCount(String path,String sheet) {
		int rc=0;
		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			rc=wb.getSheet(sheet).getLastRowNum();
		} catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rc;
	}
	public static String getData(String path,String sheet,int r,int c) {
		String val="";
		try {
			Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			val=wb.getSheet(sheet).getRow(r).getCell(c).toString();
		} catch (EncryptedDocumentException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return val;
		
	}

}
