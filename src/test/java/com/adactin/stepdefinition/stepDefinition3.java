package com.adactin.stepdefinition;


import com.adactin.pom.PaymentPage;
import com.adactinbasclass.BaseClass;

import cucumber.api.java.en.*;

public class stepDefinition3 extends BaseClass {
	@When("^user enter firstname$")
	public void user_enter_firstname() throws Throwable {
		 PaymentPage pp =new PaymentPage(driver);  
		 inputOnelement(pp.getFname(), "priya");
	}

	@When("^user enter lastname$")
	public void user_enter_lastname() throws Throwable {
		PaymentPage pp =new PaymentPage(driver);  
		inputOnelement(pp.getLname(), "kothandan");
	}

	@When("^user enter address$")
	public void user_enter_address() throws Throwable {
		PaymentPage pp =new PaymentPage(driver);
		inputOnelement(pp.getAddress(), "greentech");  
	}

	@When("^user enter creditcardno$")
	public void user_enter_creditcardno() throws Throwable {
		PaymentPage pp =new PaymentPage(driver);  
        inputOnelement(pp.getCreditcardnum(), "1112223334445556"); 
	}

	@When("^user enter creditcardtype$")
	public void user_enter_creditcardtype() throws Throwable {
		PaymentPage pp =new PaymentPage(driver);  
	     dropdown(pp.getCreditcardtype(), "text", "VISA");    
	}

	@When("^user enter expirydate$")
	public void user_enter_expirydate() throws Throwable {
		PaymentPage pp =new PaymentPage(driver);  
        dropdown(pp.geteMonth(), "text", "December");
	}

	@When("^user enter selectyear$")
	public void user_enter_selectyear() throws Throwable {
		PaymentPage pp =new PaymentPage(driver);  
	     dropdown(pp.geteYear(), "text", "2020");    
	}

	@When("^user enter cvv no$")
	public void user_enter_cvv_no() throws Throwable {
		PaymentPage pp =new PaymentPage(driver);  
        inputOnelement(pp.getCcvnum(), "2233");
	}

	@Then("^user select the booknow$")
	public void user_select_the_booknow() throws Throwable {
		PaymentPage pp =new PaymentPage(driver);  
		clickOnelemant(pp.getBooknow());
	} 

	
	
}
