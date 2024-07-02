package VrigerGenericUtilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtilities {
	
	public String getExcelData(String sheetName, int rowNum, int cellNum ) throws Throwable {
		
		FileInputStream fis1 = new FileInputStream("C:\\Users\\karan\\Desktop\\Java selenium\\vtigerAdvanceScenarios.xlsx");
		Workbook book = WorkbookFactory.create(fis1);
		Sheet sheet = book.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum); 
		String ExcelData = cell.getStringCellValue();
		return ExcelData;
	}
	
	public String getExcelDataProduct(String sheetName, int rowNum, int cellNum) throws Throwable {
		
		FileInputStream fis2 = new FileInputStream("C:\\Users\\karan\\Desktop\\Java selenium\\vtigerAdvanceScenarios.xlsx");
		Workbook book = WorkbookFactory.create(fis2);
		Sheet sheet = book.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum); 
		String ExcelData = cell.getStringCellValue();
		return ExcelData;
	}
	
   public String getExcelDataCampaign(String sheetName, int rowNum, int cellNum) throws Throwable {
		
		FileInputStream fis3 = new FileInputStream("C:\\Users\\karan\\Desktop\\Java selenium\\vtigerAdvanceScenarios.xlsx");
		Workbook book = WorkbookFactory.create(fis3);
		Sheet sheet = book.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum); 
		String ExcelData = cell.getStringCellValue();
		return ExcelData;
	}
   
   public String readDataUsingDataFormatter(String sheetName, int rowNum, int cellNum) throws Throwable {
	   FileInputStream fis4 = new FileInputStream("C:\\Users\\karan\\Desktop\\Java selenium\\vtigerAdvanceScenarios.xlsx");
		Workbook book = WorkbookFactory.create(fis4);
		Sheet sheet = book.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		DataFormatter format = new DataFormatter();
		String ExcelData = format.formatCellValue(cell);
		return ExcelData; 
   }
   
   /**
    * This method is used to write data to Excel
    * @param sheetName
    * @param rowNum
    * @param cellNum
    * @param data
    * @throws Throwable
    */
   public void insertDataToExcel(String sheetName, int rowNum, int cellNum, String data) throws Throwable
	{
		FileInputStream fis5 = new FileInputStream("C:\\\\Users\\\\karan\\\\Desktop\\\\Java selenium\\\\vtigerAdvanceScenarios.xlsx");
		Workbook book = WorkbookFactory.create(fis5);
		Sheet sheet = book.getSheet(sheetName);
		Row row = sheet.createRow(rowNum);
		Cell cell = row.createCell(cellNum);
		cell.setCellValue(data);
		FileOutputStream fos = new FileOutputStream("C:\\\\Users\\\\karan\\\\Desktop\\\\Java selenium\\\\vtigerAdvanceScenarios.xlsx");
		book.write(fos);
		book.close();
		
	} 
   
   public Object[][] readDataUsingDataProvider(String sheetName) throws Throwable
	{
		FileInputStream fis = new FileInputStream("C:\\\\Users\\\\karan\\\\Desktop\\\\Java selenium\\\\vtigerAdvanceScenarios.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sheetName);
		int lastRow = sheet.getLastRowNum()+1;
		int lastCell = sheet.getRow(0).getLastCellNum();
		
		Object[][] objArr = new Object[lastRow][lastCell];
		
		for (int i = 0; i <lastRow ; i++)
		{
			for (int j = 0; j < lastCell; j++) 
			{
				objArr[i][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		return objArr;
		
	} 
	
	

}
