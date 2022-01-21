package org.emp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class {
	public static void main(String[] args) throws InterruptedException {
	
		
	WebDriverManager.chromedriver().setup();
WebDriver d = new ChromeDriver();
d.get("https://www.facebook.com/");
WebElement txtusrname = d.findElement(By.id("email"));
txtusrname.sendKeys("elakkiya");
WebElement Txtpass  = d.findElement(By.id("pass"));
Txtpass.sendKeys("hah6565");
Thread.sleep(5000);
		WebElement Btnclk = d.findElement(By.name("login"));
		Btnclk.click();
		
	}

}
