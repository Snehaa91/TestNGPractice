package Utilities;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	//create a constructor to pass the excel path & sheet name values (to avoid hard coding)

	public ExcelUtils(String excelpath, String sheetname ){

		try {
			workbook = new XSSFWorkbook(excelpath);
			sheet = workbook.getSheet(sheetname);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//Create a function to get row count
	public static int getRowcount() {
        int rowcount = 0; 
		try {
			rowcount = sheet.getPhysicalNumberOfRows();
			System.out.println("Total Row "+ rowcount);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return rowcount;
	}

	//Create a function to get column count
	public static int getCoulmncount() {
        int colcount = 0;
		try {
			colcount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("Total Column "+ colcount);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return colcount;

	}
	//create a function to get cell data in string format
	public static String getCellDataString(int rownum, int colnum ) {
		String cellSdata = null;
		try {
			cellSdata = sheet.getRow(rownum).getCell(colnum).getStringCellValue();
			System.out.println(cellSdata);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return cellSdata;
	}

	//create a function to get cell data in numeric format
	public static double getCellDataNumeric(int rownum, int colnum) {
		double cellNdata = 0;
		try {
			cellNdata =  sheet.getRow(rownum).getCell(colnum).getNumericCellValue();
			System.out.println(cellNdata);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();	
		}
		return cellNdata;
	}


}



