package com.adactin.stepdefinition;

import com.adactin.pom.SelectHotel;
import com.adactinbasclass.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class stepDefinition2 extends BaseClass {
	

	@Given("^user select select$")
	public void user_select_select() throws Throwable {
         SelectHotel sh =new SelectHotel(driver);
         clickOnelemant(sh.getSelect());
          
	}

	@Then("^user verify the select in the loginpage$")
	public void user_verify_the_select_in_the_loginpage() throws Throwable {
        SelectHotel sh =new SelectHotel(driver);
        clickOnelemant(sh.getCont());
	    
	
	
	}
}
