package org.maven;

import java.util.List;
import java.awt.print.Book;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Excel {
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Vaishu\\eclipse-workspace\\MavenDay1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement click = driver.findElement(By.id("countries"));
		click.click();

		Select s = new Select(click);
		List<WebElement> l = s.getOptions();
		int p = l.size();

		File file = new File("C:\\Vaishu\\eclipse-workspace\\MavenDay1\\Access1\\Book7.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(stream);
		Sheet sheet = book.createSheet("Abi5");
		Row createRow = null;

		Cell createCell = null;
		for (int i = 0; i < p; i++) {
			String options = l.get(i).getText();
			System.out.println(options);
			createRow = sheet.createRow(i);

			createCell = createRow.createCell(1);
			createCell.setCellValue(options);

		}

		FileOutputStream stream1 = new FileOutputStream(file);
		book.write(stream1);
		driver.quit();

	}

}
