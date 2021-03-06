package org.maven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search extends BaseClass{

	public Search() {
		PageFactory.initElements(driver, this);
	}
@FindBy(id= "location")
private WebElement location;

@FindBy (id ="hotels")
private WebElement hotels;

public WebElement getLocation() {
	return location;
}

public WebElement getHotels() {
	return hotels;
}

public WebElement getRoomtype() {
	return roomtype;
}

public WebElement getRoomnos() {
	return roomnos;
}

public WebElement getCheckin() {
	return checkin;
}

public WebElement getCheckout() {
	return checkout;
}

public WebElement getAdultsperroom() {
	return Adultsperroom;
}

public WebElement getChildperroom() {
	return childperroom;
}

public WebElement getSearch() {
	return Search;
}
@FindBy(id = "room_type")
private WebElement roomtype;

@FindBy(id="room_nos")
private WebElement roomnos;

@FindBy(id = "datepick_in")
private WebElement checkin;

@FindBy(id = "datepick_out")
private WebElement checkout;

@FindBy(id="adult_room")
private WebElement Adultsperroom;

@FindBy(id = "child_room")
private WebElement childperroom;

@FindBy(id="Submit")
private WebElement Search;

}
