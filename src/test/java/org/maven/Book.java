package org.maven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book extends BaseClass {
	public Book() {
	PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement FirstName;
	
	@FindBy(id="last_name")
	private WebElement LastName;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement CardNo;
	
	@FindBy(id="cc_type")
	private WebElement type;
	
	@FindBy(id="cc_exp_month")
	private WebElement Expmonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement Expyear;
	
	@FindBy(id="cc_cvv")
	private WebElement Cvv;
	
	@FindBy(id="book_now")
	private WebElement Books;

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardNo() {
		return CardNo;
	}

	public WebElement getType() {
		return type;
	}

	public WebElement getExpmonth() {
		return Expmonth;
	}

	public WebElement getExpyear() {
		return Expyear;
	}

	public WebElement getCvv() {
		return Cvv;
	}

	public WebElement getBooks() {
		return Books;
	}
	

}
