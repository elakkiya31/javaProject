package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelBooking  extends Baseclass{
	public CancelBooking () {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "//a[text()='Booked Itinerary']")
	private WebElement clckBookedItinerary;

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
