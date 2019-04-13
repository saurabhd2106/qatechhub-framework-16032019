package demo;

import commonLibs.utils.ExcelDriver;

public class DemoExcelDriver {

	public static void main(String[] args) throws Exception {

		ExcelDriver excelDriver = new ExcelDriver();

		String filename = System.getProperty("user.dir") + "/testData/test.xlsx";

		String sheetname = "TestData";

		excelDriver.createWorkbook(filename);

		excelDriver.openWorkbook(filename);

		excelDriver.createSheet(sheetname);

		excelDriver.setCellData(sheetname, 0, 0, "Ayush");

		excelDriver.setCellData(sheetname, 0, 1, "Dhingra");

		excelDriver.setCellData(sheetname, 1, 1, "Saurabh");

		excelDriver.setCellData(sheetname, 1, 0, "Dhingra");

		excelDriver.setCellData(sheetname, 2, 1, "Rakshit");

		excelDriver.setCellData(sheetname, 2, 0, "Jain");

		excelDriver.saveFile();

		excelDriver.closeWorkbook();
	}

}
