package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;

public class lgnpage extends Baseclass {
@FindBy(id="username")
private WebElement txtusername;

public WebElement getTxtusername() {
	return txtusername;
}

public WebElement getTxtpassword() {
	return txtpassword;
}

public WebElement getBtnclick() {
	return btnclick;
}

@FindBy(id="password") 
private WebElement txtpassword;

@FindBy(id="login")
WebElement btnclick;


public void lgnpage1(String username , String password ) {
	
	sendKeys(getTxtusername(),username );
	sendKeys(getTxtpassword(), password);
	click(btnclick);
	Searchhotel searchhotel = new Searchhotel();
	searchhotel.Searchhotel1("location", "hotels", "room_type", "date_pick"," datepick_out"," child_room", "adult_room");
	
	
	
	
}
}



