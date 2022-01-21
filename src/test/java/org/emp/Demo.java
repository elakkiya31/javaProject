package org.emp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.get("http://demo.automationtesting.in/Register.html");

		WebElement skills = d.findElement(By.id("Skills"));
		Select select = new Select(skills);
		List<WebElement> list = select.getOptions();

		File file = new File("E:\\xcl\\bhjb.xlsx");
		Workbook workbook = new XSSFWorkbook();

		Sheet sheet = workbook.createSheet("hi");

		for (int i = 0; i < list.size(); i++) {
			WebElement element = list.get(i);
			String text = element.getText();
			Row row = sheet.createRow(i);

			Cell cell = row.createCell(0);

			cell.setCellValue(text);
		}

		FileOutputStream o = new FileOutputStream(file);
		workbook.write(o);
	}

}
