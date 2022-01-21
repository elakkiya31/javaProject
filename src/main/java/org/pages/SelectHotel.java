package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectHotel extends Baseclass {
	
	
	@FindBy(id="radiobutton_1")
	private WebElement btnclk;
	
	public WebElement getBtnclk() {
		return btnclk;
	}

	public WebElement getBtncontinue() {
		return btncontinue;
	}

	@FindBy(id="continue")
private WebElement btncontinue;
	
public void SelectHotel1(String btnclk , String btncontinue) {

click(getBtnclk());
click(getBtncontinue());


}
	
}

