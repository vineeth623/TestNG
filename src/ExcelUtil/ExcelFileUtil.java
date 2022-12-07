package ExcelUtil;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileUtil {
XSSFWorkbook wb;
//constructor for reading excel file 
public ExcelFileUtil(String ExcelPath)throws Throwable
{
	FileInputStream fi = new FileInputStream(ExcelPath);
	wb = new XSSFWorkbook(fi);
	
}
//count no of rows in a sheet
public int rowCount(String SheetName)
{
	 retrun wb.getsheet(SheetName).getLastRowNum();
}
//method for cell data
public String getCell
	public static void main(String[] args) {
	// TODO Auto-generated method stub

	}

}
