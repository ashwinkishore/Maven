package org.maven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClass {
	public Login() {
		PageFactory.initElements(driver, this);
	}
@FindBy(id="username")
private WebElement txtUserName;

@FindBy(name = "password")
private WebElement txtPassword;

@FindBy(xpath = "//input[@name='login']")
private WebElement btnlogin;

public WebElement getTxtUserName() {
	return txtUserName;
}

public WebElement getTxtPassword() {
	return txtPassword;
}

public WebElement getBtnlogin() {
	return btnlogin;
}


	
}

