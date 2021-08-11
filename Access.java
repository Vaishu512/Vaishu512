package org.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Access {
	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Vaishu\\eclipse-workspace\\MavenDay1\\Access1\\Book1.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(stream);
		Sheet sheet = book.getSheet("Sheet1");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				int cellType = cell.getCellType();
				if (cellType == 1) {
					String ss = cell.getStringCellValue();
					System.out.println(ss);
				} else if (DateUtil.isCellDateFormatted(cell)) {
					Date d = cell.getDateCellValue();
					SimpleDateFormat df = new SimpleDateFormat("MM-DD-YYYY");
					String date = df.format(d);
					System.out.println(date);
				} else {
					double number = cell.getNumericCellValue();
					long l = (long) number;
					System.out.println(l);

				}
			}
			System.out.println("");

		}

	}
}
