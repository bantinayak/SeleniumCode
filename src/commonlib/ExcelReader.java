package commonlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.Reporter;

public class ExcelReader {

	private static int rowsCounter;

	public static void main(String[] args) throws FileNotFoundException, IOException {
		readExcelData();
	}

	public static void readExcelData() throws FileNotFoundException, IOException {
		HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(
				"D:\\Selenium code\\git-seleniumcode\\selenium_testing\\resource\\TestData\\TestDataproviderUsingExcel.xls"));
		HSSFSheet sheet = workbook.getSheet("TestData");
		int rowscount = sheet.getPhysicalNumberOfRows();
		Reporter.log("rowscount :" + rowscount, true);
		int columncount = sheet.getRow(0).getPhysicalNumberOfCells();
		Reporter.log("columncount :" + columncount, true);

		for (rowscount = 0; rowsCounter < rowscount; rowsCounter++) {
			Map<String, String> keyvalues=new HashMap<String, String>();
			HSSFRow headerrow = sheet.getRow(0);
			HSSFRow row = sheet.getRow(rowscount);
			Reporter.log("row" + row, true);

			for (int coloumCounter = 0; coloumCounter < columncount; coloumCounter++) {
				String cellcolumn=headerrow.getCell(coloumCounter).getStringCellValue();
				String celldata = row.getCell(columncount).getStringCellValue();
				Reporter.log(cellcolumn +"celldata :" + celldata);
				keyvalues.put(cellcolumn, celldata);
			}
		}
	}
}
