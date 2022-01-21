package org.pages;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
public class Baseclass {
	
	



		static WebDriver driver;
		static Actions actions;
		static Alert alert;
		static Select select;
		static JavascriptExecutor executor;

		public static void launchChrome() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		public static void loadUrl(String url) {
			driver.get(url);
		}

		public static String getTitle() {
			String title = driver.getTitle();
			return title;
		}

		public static String getCurrentURL() {
			String currentUrl = driver.getCurrentUrl();
			return currentUrl;
		}

		public static WebElement locatorById(String attributeId) {
			WebElement findElement = driver.findElement(By.id(attributeId));
			return findElement;
		}

		public static WebElement locatorByName(String attributeName) {
			WebElement findElement = driver.findElement(By.name(attributeName));
			return findElement;
		}

		public static WebElement locatorByClassName(String attributeClassName) {
			WebElement findElement = driver.findElement(By.className(attributeClassName));
			return findElement;
		}

		public static WebElement locatorByXpath(String attributeXpath) {
			WebElement findElement = driver.findElement(By.xpath(attributeXpath));
			return findElement;
		}

		public static void browserMaximize() {
			driver.manage().window().maximize();
		}

		public static void sendKeys(WebElement element, String sendValue) {
			element.sendKeys(sendValue);
		}

		public static void click(WebElement element) {
			element.click();
		}

		public static void closePage() {
			driver.close();
		}

		public static void closeBrowser() {
			driver.quit();
		}

		public static void thread(int millis) throws InterruptedException {
			Thread.sleep(millis);
		}

		public static String getText(WebElement element) {
			String text = element.getText();
			return text;
		}

		public static String getAttribute(WebElement element) {
			String attribute = element.getAttribute("value");
			return attribute;
		}

		public static String getAttribute(WebElement element, String attributeValue) {
			String attribute = element.getAttribute(attributeValue);
			return attribute;
		}

		public static void MouseOver(WebElement element) {
			actions = new Actions(driver);
			actions.moveToElement(element).perform();
		}

		public static void dragAndDrop(WebElement source, WebElement destintion) {
			actions = new Actions(driver);
			actions.dragAndDrop(source, destintion).perform();
		}

		public static void rightClick(WebElement element) {
			actions = new Actions(driver);
			actions.contextClick(element).perform();
		}

		public static void doubleClick(WebElement element) {
			actions = new Actions(driver);
			actions.doubleClick(element).perform();
		}

		public static void CapitalKeys(String text) {
			actions = new Actions(driver);
			actions.keyDown(Keys.SHIFT).sendKeys(text).keyUp(Keys.SHIFT).perform();
		}

		public static void typeandEnter(WebElement element, String text) {
			actions = new Actions(driver);
			element.sendKeys(text, Keys.ENTER);
		}

		public static void navigateToUrl(String url) {
			driver.navigate().to(url);
		}

		public static void navigateBack() {
			driver.navigate().back();
		}

		public static void navigateForward() {
			driver.navigate().forward();
		}

		public static void navigateRefresh() {
			driver.navigate().refresh();
		}

		public static void fullScreenShot(String pathandName) throws IOException {
			TakesScreenshot screenshot = (TakesScreenshot) driver;
			File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
			File destFile = new File(pathandName);
			FileUtils.copyFile(srcFile, destFile);
		}

		public static void elementScreenshot(WebElement element, String pathandName) throws IOException {
			File srcFile = element.getScreenshotAs(OutputType.FILE);
			File destFile = new File(pathandName);
			FileUtils.copyFile(srcFile, destFile);
		}

		public static void acceptAlert() {
			alert = driver.switchTo().alert();
			alert.accept();
		}

		public static void dismissAlert() {
			alert = driver.switchTo().alert();
			alert.dismiss();
		}

		public static String getAlertText() {
			alert = driver.switchTo().alert();
			String text = alert.getText();
			return text;
		}

		public static void typeAndAcceptAlert(String text) {
			alert = driver.switchTo().alert();
			alert.sendKeys(text);
			alert.accept();
		}

		public static void insertJavaSript(String text, WebElement element) {
			executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].setAttribute('value','" + text + "')", element);
		}

		public static Object getAttributeJavaSript(WebElement element) {
			executor = (JavascriptExecutor) driver;
			Object value = executor.executeScript("arguments[0].getAttribute('value')", element);
			return value;
		}

		public static void clickJavaSript(WebElement element) {
			executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click()", element);
		}

		public static void scrollDownJavaSript(WebElement element) {
			executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].scrollIntoView(true)", element);
		}

		public static void scrollUpJavaSript(WebElement element) {
			executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].scrollIntoView(false)", element);
		}

		public static void selectByIndex(WebElement element, int index) {
			select = new Select(element);

			select.selectByIndex(index);
		}

		public static void selectByText(WebElement element, String text) {
			select = new Select(element);
			select.selectByVisibleText(text);
		}

		public static void selectByValue(WebElement element, String value) {
			select = new Select(element);

			select.selectByValue(value);
		}

		public static void selectGetOptions(WebElement element) {
			select = new Select(element);

			List<WebElement> options = select.getOptions();
		}

		public static int getOptionsSize(WebElement element) {
			select = new Select(element);
			List<WebElement> options = select.getOptions();
			int size = options.size();
			return size;
		}

		public static String optionsGetTextByIndex(WebElement element, int Index) {
			select = new Select(element);
			List<WebElement> options = select.getOptions();
			WebElement element2 = options.get(Index);
			String text = element.getText();
			return text;
		}

		public static String optionsGetValueByIndex(WebElement element, int Index) {
			select = new Select(element);
			List<WebElement> options = select.getOptions();
			WebElement element2 = options.get(Index);
			String text = element.getAttribute("value");
			return text;
		}

		public static String printAllOptionsText(WebElement element) {
			select = new Select(element);
			List<WebElement> options = select.getOptions();
			for (int i = 0; i < options.size(); i++) {
				WebElement element2 = options.get(i);
				String text = element2.getText();
				return text;
			}
			return null;
		}

		public static String printAllOptionsValue(WebElement element) {
			select = new Select(element);
			List<WebElement> options = select.getOptions();
			for (int i = 0; i < options.size(); i++) {
				WebElement element2 = options.get(i);
				String text = element2.getAttribute("value");
				return text;
			}
			return null;
		}

		public static void SelectAllOptionsByIndex(WebElement element) {
			select = new Select(element);
			List<WebElement> options = select.getOptions();
			for (int i = 0; i < options.size(); i++) {
				select.selectByIndex(i);
			}
		}

		public static void SelectAllOptionsByText(WebElement element) {
			select = new Select(element);
			List<WebElement> options = select.getOptions();
			for (WebElement element2 : options) {
				String text = element2.getText();
				select.selectByVisibleText(text);
			}
		}

		public static void SelectAllOptionsByValue(WebElement element) {
			select = new Select(element);
			List<WebElement> options = select.getOptions();
			for (WebElement element2 : options) {
				String value = element2.getAttribute("value");
				select.selectByValue(value);
			}
		}

		public static String printAllSelectOptionText(WebElement element) {
			select = new Select(element);
			List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
			for (WebElement element2 : allSelectedOptions) {
				String text = element2.getText();
				return text;
			}
			return null;
		}

		public static String printAllSelectOptionValue(WebElement element) {
			select = new Select(element);
			List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
			for (WebElement element2 : allSelectedOptions) {
				String text = element2.getAttribute("value");
				return text;
			}
			return null;
		}

		public static String PrintFirstSelectOptionByText(WebElement element) {
			select = new Select(element);
			WebElement firstSelectedOption = select.getFirstSelectedOption();
			String text = firstSelectedOption.getText();
			return text;
		}

		public static String PrintFirstSelectOptionByValue(WebElement element) {
			select = new Select(element);
			WebElement firstSelectedOption = select.getFirstSelectedOption();
			String text = firstSelectedOption.getAttribute("value");
			return text;
		}

		public static void deselectOptionByIndex(WebElement element, int index) {
			select = new Select(element);
			select.deselectByIndex(index);
		}

		public static void deselectOptionByText(WebElement element, String text) {
			select = new Select(element);
			select.deselectByVisibleText(text);
		}

		public static void deselectOptionByValue(WebElement element, String value) {
			select = new Select(element);
			select.deselectByValue(value);
		}

		public static void deselectAllOptions(WebElement element) {
			select = new Select(element);
			select.deselectAll();
		}

		public static boolean findMultiSelect(WebElement element) {
			select = new Select(element);
			boolean multiple = select.isMultiple();
			return multiple;
		}

		public static int frameSize(String frameTag) {
			List<WebElement> frameCount = driver.findElements(By.tagName(frameTag));
			int size = frameCount.size();
			return size;
		}

		public static void frameSwitchByIndex(int index) {
			driver.switchTo().frame(index);
		}

		public static void frameSwitchById(String id) {
			driver.switchTo().frame(id);
		}

		public static void frameSwitchByElement(WebElement element) {
			driver.switchTo().frame(element);
		}

		public static void frameToWindowSwitch() {
			driver.switchTo().defaultContent();
		}

		public static void switchToParentFrame() {
			driver.switchTo().parentFrame();
		}

		public static void swichWindowByTitle(String title) {
			driver.switchTo().window(title);
		}

		public static void swichWindowByUrl(String Url) {
			driver.switchTo().window(Url);
		}

		public static String getParentWindowId() {
			String windowHandle = driver.getWindowHandle();
			return windowHandle;
		}

		public static Set<String> getAllWindowId() {
			Set<String> windowHandles = driver.getWindowHandles();
			return windowHandles;
		}

		public static void switchChildWindowById() {
			String windowHandle = driver.getWindowHandle();
			Set<String> windowHandles = driver.getWindowHandles();
			for (String windowId : windowHandles) {
				if (!windowHandle.equals(windowId)) {
					driver.switchTo().window(windowId);
				}
			}
		}

		public static void switchParentId() {
			String windowHandle = driver.getWindowHandle();
			driver.switchTo().window(windowHandle);
		}

		public static void newFile(String path) {
			File file = new File(path);
		}

		public static void fileInputStream(String fileName) throws FileNotFoundException {
			FileInputStream stream = new FileInputStream(fileName);
		}

		public static void xssfWorkbook(String inputStream) throws IOException {
			Workbook workbook = new XSSFWorkbook(inputStream);
		}

		public static String getBook4Cell(int rowNo, int cellNo) throws IOException {
			String text = "";
			File file = new File("C:\\Users\\Zepherin\\eclipse-workspace\\Maven\\Excel\\Book4.xlsx");
			FileInputStream stream = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(stream);
			Sheet sheet = workbook.getSheet("Sheet1");
			Row row = sheet.getRow(rowNo);
			Cell cell = row.getCell(cellNo);
			int cellType = cell.getCellType();
			if (cellType == 1) {
				text = cell.getStringCellValue();
			}
			if (cellType == 0) {
				if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
					text = dateFormat.format(dateCellValue);
				} else {
					double d = cell.getNumericCellValue();
					long l = (long) d;
					text = String.valueOf(l);

				}
			}
			return text;
		}

		public static void createBook4cell(int rowNo, int cellNo, String text) throws IOException {
			File file = new File("C:\\Users\\Zepherin\\eclipse-workspace\\Maven\\Excel\\Book4.xlsx");
			FileInputStream fileInputStream = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(fileInputStream);
			Sheet sheet = workbook.getSheet("Sheet1");
			Row row = sheet.getRow(rowNo);
			Cell cell = row.createCell(cellNo);
			cell.setCellValue(text);
			FileOutputStream outputStream = new FileOutputStream(file);
			workbook.write(outputStream);

		}

		public static void assertEquals(String string,String string2, String actual) {
			Assert.assertEquals(string, string2, actual);
		}

		public static void assertTrue(String message, boolean condition) {
			Assert.assertTrue(message, condition);
		}
	}


