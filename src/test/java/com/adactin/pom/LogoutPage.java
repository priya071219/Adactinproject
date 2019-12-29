package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
public static WebDriver driver;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logout;
	
	public LogoutPage(WebDriver gdriver) {
		// TODO Auto-generated constructor stub
		this.driver=gdriver;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getLogout() {
		return logout;
	}

}
