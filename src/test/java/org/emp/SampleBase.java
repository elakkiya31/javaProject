package org.emp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleBase {
	
	
	
	
	
	WebDriver driver;
	//1--TO-----LaunchBrowser	
		public void LaunchDriver() {		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		//2----To--SetProperty
		public void SetProperty(String value) {
			System.setProperty("webdriver.chrome.driver", value);	
		}
		//3--To--GetUrl
		public void GetUrl(String url) {
			driver.get(url);
		}
		//4--To--GetCurrentUrl
		public String CurrentUrl() {
			String url = driver.getCurrentUrl();
			return url;
		}
		//5---To---GetTitle
		public String GetTitle() {
			String title = driver.getTitle();
			return title;
		}
		//6---To---GetText
		private String gettext(WebElement element) {
			String data = element.getText();
			return data;

		}
		//7----To---Close
		public void ToClose() {
			driver.close();
		}
		//8
		public void ToQuit() {
			driver.quit();
		}
		//9---To---FindbyID
		public WebElement findElementById(String data) {
			WebElement element = driver.findElement(By.id(data));
			return element;
		}
		//10---To---FindByName
		public WebElement findElementByName(String name) {
			WebElement element = driver.findElement(By.name(name));
			return element;
		}
		//11---To--findByXpath
		public WebElement findElementByXpath(String xpath) {
			WebElement element = driver.findElement(By.xpath(xpath));
			return element;
		}
		//12---To---SendText
		public void EnterText(WebElement element,String data) {
			element.sendKeys(data);
		}
		//13---To---Click
		public void ToClick(WebElement element) {
			element.click();
		}
		//14---To---GetText
		public String ToGetText(WebElement element) {
			String text = element.getText();
			return text;	
		}
		//15----To---GetAttribute
		public String ToGetAttribute(WebElement element) {
			String string = element.getAttribute("value");
			return string;
		}
		//---to---GetAttribute
//		public String ToGetAttributeTwo(WebElement element) {
//			String data = element.getAttribute(null);
//			return data; 
//		}
	//16---To---MoveToElement
		public void Movetoelement(WebElement target) {
			Actions action=new Actions(driver);
			action.moveToElement(target).perform();
		}
		//17---To--Maximize
		public void ToMaximize() {
			driver.manage().window().maximize();
		}
		//18---To--KeyPress
		public void ToKeyPress(int key) throws AWTException {
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_UP);
		}
		//19---To--KeyRelease
		public void ToKeyRelease(int key) throws AWTException {
			Robot robot=new Robot();
			robot.keyRelease(KeyEvent.VK_UP);
		}
		//20--To--RightClick
		public void ToRightClick(WebElement element) {
			Actions action=new Actions(driver);
			action.contextClick(element).perform();
		}
		//21---To----NavigateTo
		public void ToNavigate(String string) {
			Navigation navigate=driver.navigate();
			navigate.to(string);
		}
		//22---To---NavigateBack
		public void ToNavigateBack() {
			Navigation navigate=driver.navigate();
			navigate.back();
		}
		//23---To----Refresh
		public void ToRefresh() {
			Navigation navigate=driver.navigate();
			navigate.refresh();
		}
		//24----To--ClickOK
		public void Okayinalert() {
			Alert alert=driver.switchTo().alert();
			alert.accept();
		}
		//25---To---CLickCancel
		public void Cancelinalert() {
			Alert alert=driver.switchTo().alert();
			alert.dismiss();
		}
		//26---To---SelectByValue
		public void ToSelectByValue(WebElement element,String value) {
			Select select=new Select(element);
			select.selectByValue(value);
		}
		//27----To---SelectByVisibleText
		public void ToSelectByText(WebElement element,String value) {
			Select select=new Select(element);
			select.selectByVisibleText(value);
		}
		//28----To---SelectByIndex
		public void ToSelectByIndex(WebElement element,int index) {
			Select select=new Select(element);
			select.selectByIndex(index);
		}
		//29---To---GetOptions
		public int ToGetOptions(WebElement element) {
			Select select=new Select(element);
			List<WebElement> options = select.getOptions();
			int len=options.size();
			return len;
		}
		//30---To---Check--isMultiple
		public boolean ToCheckMultiple(WebElement element) {
			Select select=new Select(element);
			boolean b = select.isMultiple();
			return b;
		}
		//31----To---DeselectByIndex
		public void ToDeselectByIndex(WebElement element,int index) {
			Select select=new Select(element);
			select.deselectByIndex(index);
		}
		//32--To---DeselectByValue
		public void ToDeselectByValue(WebElement element,String value) {
			Select select=new Select(element);
			select.deselectByValue(value);
		} 
		//33---To---DeselectByVisibleText
		public void ToDeselectByText(WebElement element,String text) {
			Select select=new Select(element);
			select.deselectByVisibleText(text);
		}
		
		//34---To---DeselectAll
		public void ToDeselectAll(WebElement element) {
			Select select=new Select(element);
			select.deselectAll();
		}
	//35-----To----SwtichToFrame--By--Element
		public void SwitchToFrame(WebElement element) {
			driver.switchTo().frame(element);
		}
		//36----To---SwitchToFrame--by-Name
		public void SwitchToFramee(String name) {
			driver.switchTo().frame(name);
		}
		//37--To---SwitchTo---By--index
		public void SwitchToFram(int index) {
			driver.switchTo().frame(index);
		}
		//38---To---SwitchTo--Default
		public void DefaultContent() {
			driver.switchTo().defaultContent();
		}   
		//39--To--SwitchTo--parent
		public void SwitchParentFrame() {
			driver.switchTo().parentFrame();
		}
		//40--To---SendkeysBY--JavaScript--SetAttribute
		public void JavaScript(String data,WebElement element) {
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("arguments[0], setAttribute('value',' "+data+" ')",element);	
		}
		//41---To---GetText--by--JavaScript--GetAttribute
		public void JavaScriptt(String data,WebElement element) {
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript(" return arguments[0], getAttribute('value')",element);	
		}
		//42---To--Click--by--JavaScript
		public void JavaScripttt(String data,WebElement element) {
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("arguments[0], click()",element);	
		}
		//43---To--ScrollDown--by--JS
		public void JavaSScript(String data,WebElement element) {
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("arguments[0], ScrollIntoView(true)",element);	
		}
		//44----To---ScrollUP--By--Js
		public void Javacript(String data,WebElement element) {
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("arguments[0], ScrollIntoView(false)",element);	
		}
		//45---To---Swtich--Frame
		
		public void Frame(int index) {
			driver.switchTo().frame(index);
		}
		//46---To---Switch--FrameById
		public void Framee(String id){
			driver.switchTo().frame(id);
		}
		//47---To---Switch___FrameByElement
		public void FrameElement(WebElement element) {
			driver.switchTo().frame(element);
		}
		//48---SwitchByName
		public void Fram(String name) {
			driver.switchTo().frame(name);
		}
		//49----To--Go---DefaultPage
		public void FrameDefault() {
			driver.switchTo().defaultContent();
		}
		//50---To---ParentPage
		public void ParentFrame() {
			driver.switchTo().parentFrame();
		}
		//51---TO---SwitchtoWindows__Id
		public void Window(String id) {
			driver.switchTo().window(id);
		}
		//52---To---Switch---Windows---Title
		public void Windows(String title) {
			driver.switchTo().window(title);
		}
		//53----To--Switch--WindowBy--url
		public void Windowss(String url) {
			driver.switchTo().window(url);
		}
		//54___To--GetNUmberOFWindows
		public Set<String> WindowHandles() {
			Set<String> handles = driver.getWindowHandles();
			return handles;
		}
		//55---To_-GetWindow
		public String WindowHandle() {
			String handles = driver.getWindowHandle();
			return handles;
		}





		public void getdata(String path , String sheetname , int rowno , int cellno) throws IOException {
			
			String res = "";
			File file = new File(path);
			
			FileInputStream stream = new FileInputStream(file);
			
			Workbook workbook = new XSSFWorkbook(stream);
			
			Sheet sheet = workbook.getSheet(sheetname);
			
			Row row = sheet.getRow(rowno);
			
			Cell cell = row.getCell(cellno);
			
			int cellType = cell.getCellType();
			
			if (cellType==1) {
				res = cell.getStringCellValue();
			}
				if (cellType==0) {
					if (DateUtil.isCellDateFormatted(cell)) {
						
						 Date date = cell.getDateCellValue();
						 
						 SimpleDateFormat dateFormat= new SimpleDateFormat("dd-MMM-yy");
						 
						res = dateFormat.format(date);
						
					} else {
						
						double d = cell.getNumericCellValue();
						
						Long l = (long)d;
						
					res = String.valueOf(l);
					
					}
				}





		}}

//		public void ToSleep() {
//		Thread.sleep(5000);
	//}
//		public WebElement ToGetOptionss(WebElement element) {
//		Select select=new Select(element);
//		List<WebElement> list = select.getOptions();
//		return element;


