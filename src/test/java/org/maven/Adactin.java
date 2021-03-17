package org.maven;

import org.openqa.selenium.WebElement;

public class Adactin extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		BaseClass baseClass = new BaseClass();
		baseClass.getDriver();
		baseClass.launchurl("https://adactinhotelapp.com/");
		
		Login login = new Login();
		WebElement txtUserName = login.getTxtUserName();
		baseClass.enterText(txtUserName, "gurusriramesh");
		WebElement txtPassword = login.getTxtPassword();
		baseClass.enterText(txtPassword, "123456789");
		WebElement btnlogin = login.getBtnlogin();
		baseClass.btnclick(btnlogin);
		
		Search src = new Search();
		WebElement location = src.getLocation();
		baseClass.visibleText(location, "London");
		
		WebElement hotels = src.getHotels();
		baseClass.visibleText(hotels, "Hotel Sunshine");
		
		WebElement roomtype = src.getRoomtype();
		baseClass.visibleText(roomtype, "Super Deluxe");
		
		WebElement roomnos = src.getRoomnos();
		baseClass.visibleText(roomnos, "2 - Two");
		
		WebElement adultsperroom = src.getAdultsperroom();
		baseClass.visibleText(adultsperroom, "2 - Two");
		
		WebElement childperroom = src.getChildperroom();
		baseClass.visibleText(childperroom, "2 - Two");
		
		WebElement search = src.getSearch();
		baseClass.btnclick(search);
		
		SelectHotel hotel = new SelectHotel();
		WebElement radiobutton = hotel.getRadiobutton();
		baseClass.btnclick(radiobutton);
		
		WebElement continu = hotel.getContinu();
		baseClass.btnclick(continu);
		
		Book book = new Book();
		WebElement firstName = book.getFirstName();
		baseClass.enterText(firstName, "Ashwin");
		
		WebElement lastName = book.getLastName();
		baseClass.enterText(lastName, "kishore");
		
		WebElement address = book.getAddress();
		baseClass.enterText(address, "chennai");
		
		WebElement cardNo = book.getCardNo();
		baseClass.enterText(cardNo, "1234567890098765");
		
		WebElement type = book.getType();
		baseClass.visibleText(type, "Master Card");
		
		WebElement expmonth = book.getExpmonth();
		baseClass.visibleText(expmonth, "April");
		
		WebElement expyear = book.getExpyear();
		baseClass.visibleText(expyear, "2022");
		
		WebElement cvv = book.getCvv();
		baseClass.enterText(cvv, "123");
		
		WebElement books = book.getBooks();
		baseClass.btnclick(books);
		
		Thread.sleep(7000);
		Number number = new Number();
		baseClass.attribute(number.getOrder(), "value");
	
	}
}
