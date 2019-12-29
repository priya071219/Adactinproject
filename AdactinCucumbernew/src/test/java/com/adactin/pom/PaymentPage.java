package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
	
	public static WebDriver driver;

	@FindBy(xpath="//input[@name='first_name']")
	private WebElement fname;
	
	@FindBy(xpath="//input[@id='last_name']")
	private WebElement lname;
	
	@FindBy(xpath="//textarea[@id='address']")
	private WebElement address;
	
	@FindBy(xpath="//input[@id='cc_num']")
	private WebElement creditcardnum;
	
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement creditcardtype;
	
	@FindBy(xpath="//select[@id='cc_exp_month']")
	private WebElement eMonth;
	
	@FindBy(xpath="//select[@id='cc_exp_year']")
	private WebElement eYear;
	
	@FindBy(xpath="//input[@id='cc_cvv']")
	private WebElement ccvnum;
	
	
	@FindBy(xpath="//input[@value='Book Now']")
	private WebElement booknow;
	
	
	public PaymentPage(WebDriver pdriver) {
		// TODO Auto-generated constructor stub
		this.driver=pdriver;
		PageFactory.initElements(driver, this);
		
	}


	public WebElement getFname() {
		return fname;
	}


	public WebElement getLname() {
		return lname;
	}


	public WebElement getAddress() {
		return address;
	}


	public WebElement getCreditcardnum() {
		return creditcardnum;
	}


	public WebElement getCreditcardtype() {
		return creditcardtype;
	}


	public WebElement geteMonth() {
		return eMonth;
	}


	public WebElement geteYear() {
		return eYear;
	}


	public WebElement getCcvnum() {
		return ccvnum;
	}


	public WebElement getBooknow() {
		return booknow;
	}
	


	

}
