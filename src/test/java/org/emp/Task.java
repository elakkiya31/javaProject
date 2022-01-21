package org.emp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task {
public static void main(String[] args) throws IOException {
	File file = new File("C:\\Users\\user\\eclipse-workspace\\Java\\lib\\elakkiya.xlsx");
	FileInputStream s =new FileInputStream(file);
	Workbook workbook = new XSSFWorkbook(s);
	Sheet sheet = workbook.getSheet("Sheet1");
	
	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		Row row  =sheet.getRow(i);
		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
		
		Cell cell = row.getCell(j);
		int type = cell.getCellType();
		
		
	
		if (type == 1) {
			String b = cell.getStringCellValue();
			System.out.println(b);
					
		} 
		if (type ==0) {
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dd = cell.getDateCellValue();
				SimpleDateFormat cc = new SimpleDateFormat("dd-MM-yy");
				String nn = cc.format(dd);
				System.out.println(nn);
				
			} else  {
if (DateUtil.isCellDateFormatted(cell)) {
Date value = cell.getDateCellValue();
SimpleDateFormat rr =new SimpleDateFormat("dd-MM-yy");
String kk = rr.format(value);
System.out.println(kk);


}else {
		double bb = cell.getNumericCellValue();
long w1 = (long)bb;
String ll =String.valueOf(w1);
System.out.println(ll);

}
			}}}}}}

