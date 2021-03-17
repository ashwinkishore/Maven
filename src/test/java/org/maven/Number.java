package org.maven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Number extends BaseClass {
	public Number() {
		PageFactory.initElements(driver, this);
	}
@FindBy(id="order_no")
private WebElement order;
public WebElement getOrder() {
	return order;
}
}
