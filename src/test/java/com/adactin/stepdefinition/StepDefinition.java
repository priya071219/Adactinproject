package com.adactin.stepdefinition;

import com.adactin.pom.Loginpage;
import com.adactinbasclass.BaseClass;

import cucumber.api.java.en.*;

public class StepDefinition extends BaseClass {
	

@Given("^user launch the browser$")
public void user_launch_the_browser() throws Throwable {
	browserLaunch("chrome");   
}

@When("^user enter application url$")
public void user_enter_application_url() throws Throwable {
	geturl("https://adactin.com/HotelApp");    
}

@When("^user enter valid username$")
public void user_enter_valid_username() throws Throwable {
	Loginpage lp =new Loginpage(driver) ;
	inputOnelement(lp.getUsername(),"poojapriya");

}

@When("^user enter valid password$")
public void user_enter_valid_password() throws Throwable {
	Loginpage lp =new Loginpage(driver) ;
    inputOnelement(lp.getPassword(),"test123");
    
}

@Then("^user verify the username in the homepage$")
public void user_verify_the_username_in_the_homepage() throws Throwable {
	Loginpage lp =new Loginpage(driver) ;
	clickOnelemant(lp.getLoginbtn());

}

}