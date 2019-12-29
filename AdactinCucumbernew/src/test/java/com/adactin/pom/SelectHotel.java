package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
public static WebDriver driver;
	
	@FindBy(xpath="//input[@type='radio']")
	private WebElement select;
	
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement cont;
	
		
	public SelectHotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}


	public WebElement getSelect() {
		return select;
	}


	public WebElement getCont() {
		return cont;
	}


}
