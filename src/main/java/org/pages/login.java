package org.pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.emp.beforeclass;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login extends Baseclass {

	static WebDriver driver ;
	@BeforeClass  
	public static void launchbrowser() {
WebDriverManager.chromedriver().setup(); 
driver=new ChromeDriver();
driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();	
	}
	
	
	 
	private  login() {
		lgnpage lgnpage = new lgnpage();
		lgnpage.lgnpage1("elakkiya31", "elakkiya1'");
		
		BookHotel BookHotel =new BookHotel ();
	BookHotel.BookHotel1("elakkiya", "selvan", "chennai", "7894561230789456", "august", "2022", "123"," btnclick");
	
	Searchhotel Searchhotel = new Searchhotel();
	Searchhotel.Searchhotel1("sydney", "hotel creek", "standard", "25/01/2022", "26-01-2022", "1-one", "1-one");
	
	//SelectHotel SelectHotel = new SelectHotel();
	//SelectHotel.SelectHotel1();
	
	}
	
	
}
