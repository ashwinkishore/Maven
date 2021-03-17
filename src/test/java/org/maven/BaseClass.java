package org.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	
public void getDriver() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
}
public void launchurl(String url) {
driver.get(url);
}
public void enterText(WebElement element, String Value) {
element.sendKeys(Value);
}
public void btnclick(WebElement element) {
	element.click();
}
public void attribute(WebElement element, String value) {
	String attribute = element.getAttribute(value);
	System.out.println(attribute);
}
public void dragDrop(WebElement source, WebElement element) {
	Actions ac = new Actions(driver);
	ac.dragAndDrop(source, element).perform();
}
public void moveTo(WebElement element) {
	Actions ac = new Actions(driver);
	ac.moveToElement(element);
}
public void RightClick(WebElement element) {
	Actions ac = new Actions(driver);	
	ac.contextClick(element).perform();
}
public void doubleClick(WebElement element) {
	Actions ac = new Actions(driver);
	ac.doubleClick(element).perform();
}


public void visibleText(WebElement element,String Name) {
Select sc = new Select(element);
sc.selectByVisibleText(Name);
}
}