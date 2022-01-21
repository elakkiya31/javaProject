package org.emp;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class libGlobal {
	
	
	
	
static WebDriver driver;
	
	
	public void javaScriptExecutorGetValues(WebElement element, String data) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("return argument[0].getAttribute('value')", element);

	}
	
	public WebElement className(String attributename) {
		WebElement element = driver.findElement(By.className(attributename));
		return element;
		
		
	}
	public void moveToElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();

	}

	public void contextclick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();
	}

	public void doubleclick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();

	}

	public void selectByIndex(WebElement element,int index) {
		Select select = new Select(element);
		select.selectByIndex(index);

	} 
		
	

	public void selectByValue(WebElement element, String data) {
		Select select = new Select(element);
		select.selectByValue(data);
	}
	public void click() {
		WebElement element = driver.findElement(By.id(""));
		element.click();
	}

	public void SelectByVisibleText(WebElement element, String data) {
		Select select = new Select(element);
		select.selectByVisibleText(data);
	}

	public List<WebElement> SelectGetOptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		return options;
	}

	public WebElement getfirstSelectedOptions(WebElement element) {
		Select select = new Select(element);
		WebElement firstSelectedOption = select.getFirstSelectedOption();

		return firstSelectedOption;

	}

	public List<WebElement> getAllSelectedOption(WebElement element) {
		Select select = new Select(element);
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();

		return allSelectedOptions;

	}

	public boolean selectMultiple(WebElement element) {
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;

	}

	public void deSelectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
	}

	public void deSelectByValue(WebElement element, String data) {
		Select select = new Select(element);
		select.deselectByValue(data);

	}

	public void deSelectByVisibleText(WebElement element, String data) {
		Select select = new Select(element);
		select.deselectByVisibleText(data);

	}

	public void deSelectAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();

	}

	public void javaScriptExecuteClick() {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click");

	}
	 public void launchbrowser( String launchbrowser ) {
		 if (launchbrowser.equals("chrome") ) {
			 WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			
		}else  if (launchbrowser.equals("firefoxdriver") ) {
			 WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
			 
		}else if (launchbrowser.equals("iedriver") ) {
			 WebDriverManager.iedriver().setup();
			 driver=new InternetExplorerDriver(); 
		}else
			System.out.println("invlid tbrowser");
			
		
	 }
	 

	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public void loadurl(String url) {
		driver.get(url);

	}

	public void maximize() {
		driver.manage().window().maximize();

	}

	public String currenturl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}

	public String getitle() {
		String title = driver.getTitle();
		return title;
	}



	

	public String getWindowHandle() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}

	public Set<String> windowHandles() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;

	}

	public String gettext(WebElement element) {
		String text = element.getText();
		return text;

	}

	public String getAttribute(WebElement element, String name) {

		String attribute = element.getAttribute(name);
		return attribute;

	}

	public WebElement findElementByName(String data) {
		WebElement findElement = driver.findElement(By.id(data));
		return findElement;

	}

	public WebElement findElementById(String data) {
		WebElement findElement = driver.findElement(By.id(data));
		return findElement;

	}

	public WebElement findEelementByXpath(String data) {
		WebElement findElement = driver.findElement(By.xpath(data));
		return findElement;

	}

	public void setText(WebElement element, String data) {
		element.sendKeys(data);

	}

	public void click(WebElement element) {
		element.click();

	}
	

	
	private String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	private String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	

	
	
	private Alert alert() {
		Alert al = driver.switchTo().alert();
		return al;
	}
	
	private void quit() {
	driver.quit();
	}
	
	
	private WebElement findElementByClassName(String text) {
		WebElement element = driver.findElement(By.className(text));
		return element;
	}
	
	private WebElement findElementByXpath(String text) {
		WebElement element = driver.findElement(By.xpath(text));
		return element;
	}
	
	private void inserttext(WebElement element, String text) {
		element.sendKeys(text);
	}
	
	private String getText(WebElement element) {
		String text = element.getText();
		return text;
	}
	
	private String getAttributeName(WebElement element, String name) {
		String data = element.getAttribute(name);
		return data;
	}
	
	private String getAttributeValue(WebElement element) {
		String data = element.getAttribute("value");
		return data;
	}
	
	
	public void type(WebElement element,String data) {
	element.sendKeys(data);
	}
	
	public String getDataFromExcel(String Sheet, int row, int cell) throws IOException {
		String value = null;
		
		File file = new File("C:\\Users\\user\\eclipse-workspace\\Java\\lib\\Hotel.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet s = workbook.getSheet("Sheet1");
		Row r = s.getRow(row);
		org.apache.poi.ss.usermodel.Cell c = r.getCell(cell);
		int type = c.getCellType();
		if (type==1) {
			 value = c.getStringCellValue();
		}
		
		if (type==0) {
			if (DateUtil.isCellDateFormatted(c)) {
				java.util.Date dateCellValue = c.getDateCellValue();
				SimpleDateFormat simple = new SimpleDateFormat("dd-mm-yyyy");
				String format = simple.format(dateCellValue);
			}else {
				double d = c.getNumericCellValue();
				long l =(long) d;
				 value = String.valueOf(1);
				
			}
			
			
		}
		
		return value;
	
	
	
	}}
	

		

	



