package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.FindBy;

public class Searchhotel extends Baseclass {
	@FindBy(id="location")
private WebElement dDnlocation;
	
	@FindBy(id="hotels")
	private WebElement dDnhotels;
	
	@FindBy(id="room_type")
	private WebElement dDnroomtype;
	
	public WebElement getdDnlocation() {
		return dDnlocation;
	}

	public WebElement getdDnhotels() {
		return dDnhotels;
	}

	public WebElement getdDnroomtype() {
		return dDnroomtype;
	}

	public WebElement getChckindate() {
		return chckindate;
	}

	public WebElement getChckoutdate() {
		return chckoutdate;
	}

	public WebElement getdDnadultroom() {
		return dDnadultroom;
	}

	public WebElement getdDnchildroom() {
		return dDnchildroom;
	}

	@FindBy(id="date_pick")
	private WebElement chckindate;
	
	@FindBy(id="datepick_out")
	private WebElement chckoutdate;
		
	@FindBy(id="adult_room")
	private WebElement dDnadultroom;
	
	@FindBy(id="child_room")
	private WebElement dDnchildroom;
	
	@FindBy(id="Submit")
    WebElement btnsearch;
	
	public void Searchhotel1 ( String location,  String hotels,  String room_type , String date_pick ,String datepick_out , String child_room , String adult_room ){	
	
		selectByText(getdDnlocation(), location);
	selectByText(getdDnhotels(), hotels);
	selectByText(getdDnroomtype(), room_type);
	
	sendKeys(getChckindate(), date_pick);
	sendKeys(getChckoutdate(), datepick_out);
	
	selectByText(getdDnadultroom(), adult_room);
	selectByText(dDnchildroom, child_room);
	click(btnsearch);

	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
