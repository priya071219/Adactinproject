package com.adactin.stepdefinition;

import com.adactin.pom.LogoutPage;
import com.adactinbasclass.BaseClass;

import cucumber.api.java.en.Then;

public class stepDefinition4 extends BaseClass {
	@Then("^:user enter logoutpage$")
	public void user_enter_logoutpage() throws Throwable {
		LogoutPage lp =new LogoutPage(driver);
		clickOnelemant(lp.getLogout());
      	    
	}



}
