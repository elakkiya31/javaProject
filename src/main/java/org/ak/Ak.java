package org.ak;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ak {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\user\\eclipse-workspace\\Java\\lib\\elakkiya.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(stream);
		Sheet sheet = w.getSheet("sheet1");
	
		
		for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
			Row row2 = sheet.getRow(i);
			for (int j = 0; j <row2.getPhysicalNumberOfCells(); j++) {
				Cell cell2 = row2.getCell(j);
				System.out.println(cell2);
	         			
			}
			
		}
	}

}
