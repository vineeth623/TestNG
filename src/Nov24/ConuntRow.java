package Nov24;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ConuntRow {
	
public static void main(String[] args)throws Throwable  {
	// read path of excel file
	FileInputStream fi = new FileInputStream();
	//get wb from fi file
	XSSFWorkbook wb = new XSSFWorkbook(fi);
	//get sheet from wb 
	XSSFSheet ws = wb.getSheet("");
	//get first row from sheet
	XSSFRow row =ws.getRow(0);
	//count no of rows in a sheet
	int rc =ws.getLastRowNum();
	//count no ofcells from firstrow
	int cc =row.getLastCellNum();
	System.out.println("No of rows::"+rc"     "+"No of cells::"+cc);
	fi.close();
	wb.close();

	
	
	
	
}
}
