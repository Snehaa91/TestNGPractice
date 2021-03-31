package Utilities;

import org.testng.annotations.DataProvider;

public class ExcelDataProvider {
	
	public static Object[][] testdata(String excelpath, String sheetname) {
		
		ExcelUtils exceldata = new ExcelUtils(excelpath, sheetname);
		
		int rowcount = exceldata.getRowcount();
		int colcount = exceldata.getCoulmncount();
		
		Object[][] finaldata = new Object[rowcount-1][colcount];
		
		for(int i=1;i<rowcount;i++) {
			for(int j=0;j<colcount;j++) {
				String celldata = exceldata.getCellDataString(i, j);
				finaldata[i-1][j] = celldata;				
			}
		}
		return finaldata;
	}

}
