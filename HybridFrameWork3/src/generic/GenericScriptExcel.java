package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GenericScriptExcel
{
		public static String Excel(String sh,int r,int c)
		{ 
			String val="";
			try {
				FileInputStream fis =new FileInputStream("./Book1.xlsx");
				Workbook book = WorkbookFactory.create(fis);
				Sheet sheet = book.getSheet(sh);
				Row row = sheet.getRow(r);
				Cell cell = row.getCell(c);
				val = cell.toString();
			}
			catch (Exception e) {
				System.out.println(e);
			}
			return val;
		}

}
