package org.emp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.jodah.failsafe.internal.util.Assert;

public class Adactin {
public static void main(String[] args) throws IOException {
	libGlobal glob = new libGlobal();
	
glob.launchbrowser("chrome");

	glob.loadurl("https://adactinhotelapp.com/");
	
	glob.maximize();
	
    glob.getitle();

WebElement username = glob.findElementById("username");
glob.setText(username, "elakkiya31");

WebElement pswd = glob.findElementById("password");
glob.setText(pswd, "elakkiya1");

WebElement login = glob.findElementById("login");
login.click();

WebElement drop1 = glob.findElementById("location");
glob.selectByValue(drop1,glob.getDataFromExcel("sheet1", 1, 0) );

WebElement drop2 = glob.findElementById("hotels");
glob.selectByValue(drop2, glob.getDataFromExcel("Sheet1", 1, 1));

WebElement room = glob.findElementById("room_type");
glob.selectByValue(room, glob.getDataFromExcel("Sheet1", 1, 2));
WebElement sub = glob.findElementById("submit");
sub.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}}
