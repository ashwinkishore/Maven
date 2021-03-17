package org.maven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass{
	 public SelectHotel() {
	PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement radiobutton;
	
	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getContinu() {
		return continu;
	}

	@FindBy(id="continue")
	private WebElement continu;

}
