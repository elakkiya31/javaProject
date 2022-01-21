package org.emp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//WebDriver  driver = new ChromeDriver();
		libGlobal global = new libGlobal();
		global.getDriver();
		//driver.get("https://adactinhotelapp.com/");
		global.loadurl("https://adactinhotelapp.com/");
		
		global.maximize();
		
		WebElement id = global.findElementById("username");
	global.setText(id, "elakkiya31");
	
		WebElement id2 = global.findElementById("password");
		global.setText(id2, "elakkiya1");
		
		WebElement id3 = global.findElementById("login");
		id3.click();
		WebElement id4 = global.findElementById("location");
		Select select = new Select(id4);
		select.selectByIndex(2);
		WebElement hotel = global.findElementById("hotels");
		Select select1 =new Select(hotel);
	select1.selectByIndex(2);
		//WebElement room = global.findElementById("room");
		//Select select2 = new Select(room);
//select2.selectByIndex(3);
//WebElement adroom = global.findElementById("adult_room");
	//    Select select3 = new Select(adroom);
//select3.selectByIndex(2);
WebElement clck = global.findElementById("Submit");
	clck.click();
		
	WebElement rdbtn = global.findElementById("radiobutton_1");
	rdbtn.click();
WebElement btclk = global.findElementById("continue");
btclk.click();


WebElement fn = global.findElementById("first_name");
fn.sendKeys("arun");
WebElement l = global.findElementById("last_name");
l.sendKeys("kumar");
WebElement a = global.findElementById("address");
a.sendKeys("west st, chennai");
WebElement cc = global.findElementById("cc_num");
cc.sendKeys("32325676890071727");
WebElement cct = global.findElementById("cc_type");
Select s6 = new Select(cct);
s6.selectByIndex(3);
WebElement ep = global.findElementById("cc_exp_month");
Select s7 = new Select(ep);
s7.selectByIndex(5);
WebElement y = global.findElementById("cc_exp_year");
Select s8 = new Select(y);
s8.selectByIndex(6);
WebElement ccv = global.findElementById("cc_cvv");
ccv.sendKeys("499");
WebElement hh = global.findElementById("book_now");
hh.click();
Thread.sleep(20000);
WebElement od = global.findElementById("order_no");
String orderno = od.getAttribute("value");
System.out.println(orderno);
				
				
				
				
				
				
				
				
				
				
		
		
		
		
		
	//global.click();
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
