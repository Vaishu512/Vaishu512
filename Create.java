package org.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Create {
public static void main(String[] args) throws IOException {
	 File file = new File("C:\\Vaishu\\eclipse-workspace\\MavenDay1\\Access1\\Book2.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(stream);
		Sheet sheet = book.createSheet("Vaishu");
		Row createRow = sheet.createRow(1);
		Cell createcell = createRow.createCell(1);
		createcell.setCellValue("Country");;
		FileOutputStream stream1 = new FileOutputStream(file);
		book.write(stream1);
}
}
