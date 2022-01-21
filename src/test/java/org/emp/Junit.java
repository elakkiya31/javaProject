package org.emp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public  class Junit {

static WebDriver driver;

@BeforeClass
public static void beforeclass() {

	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("http://greenscart.in/#/login?returnUrl=%2F");
}
@AfterClass
   public static void aftrclass() {
///driver.quit();

}
@Before
public void beforemethod() throws InterruptedException {
long startTime = System.currentTimeMillis();
System.out.println(startTime);
Thread.sleep(5000);
}
@After

public void aftermethod() {
long endtime = System.currentTimeMillis();
System.out.println(endtime);
}
@Test
public void login() {
WebElement txtemail = driver.findElement(By.xpath("(//input[@type='text'][1])"));
txtemail.sendKeys("elakkiyacry.@gmail.com");


WebElement txtpsd = driver.findElement(By.xpath("(//input[@type='password'])[3]"));
txtpsd.sendKeys("Elakkiya1@*");

WebElement clck = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
clck.click();
}




}



