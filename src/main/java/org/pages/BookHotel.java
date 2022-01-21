package org.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
  

public class BookHotel extends Baseclass{

	@FindBy(id="first_name")
	private WebElement txtfirstname;
	

	@FindBy(id="last_name")
	private WebElement txtlastname;
	

	@FindBy(id="address")
	private WebElement txtaddress;
	

	@FindBy(id="cc_type")
	private WebElement txtccno;
	

	@FindBy(id="cc_exp_month")
	private WebElement txtexpmonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement txtexpyear;

	@FindBy(id="cc_cvv")
	private WebElement txtcvv;
	
	@FindBy(id="book_now")
	private WebElement txtbtnclick;

	public WebElement getFirstname() {
		return txtfirstname;
	}

	public WebElement getLastname() {
		return txtlastname;
	}

	public WebElement getAddress() {
		return txtaddress;
	}

	public WebElement getCcno() {
		return txtccno;
	}

	public WebElement getExpmonth() {
		return txtexpmonth;
	}

	public WebElement getExpyear() {
		return txtexpyear;
	}

	public WebElement getCvv() {
		return txtcvv;
	}

	public WebElement getBtnclick() {
		return txtbtnclick;
	}
	
	public void BookHotel1(String firstname, String lastname,  String address, String ccno, String expmonth,  String expyear, String cvv, String btnclick) {
    
		sendKeys(getFirstname(), firstname);
		sendKeys(getLastname(), lastname);
		sendKeys(getAddress(), address);
		sendKeys(getCcno(), ccno);
		sendKeys(getExpmonth(), expmonth);
		sendKeys(getExpyear(), expyear);
		sendKeys(getCvv(), cvv);
		click(getBtnclick());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
