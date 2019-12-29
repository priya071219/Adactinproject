package com.adactin.stepdefinition;

import com.adactin.pom.Searchhotels;
import com.adactinbasclass.BaseClass;

import cucumber.api.java.en.*;

public class stepDefinition1 extends BaseClass {

@When("^user select location$")
public void user_select_location() throws Throwable {
	Searchhotels  sh =new Searchhotels(driver);
	dropdown(sh.getLocation(), "text","New York");
}

@When("^user select hotels$")
public void user_select_hotels() throws Throwable {
	Searchhotels  sh =new Searchhotels(driver);
	dropdown(sh.getHotel(),"text","Hotel Creek");
}

@When("^user select RoomType$")
public void user_select_RoomType() throws Throwable {
	Searchhotels  sh =new Searchhotels(driver);
	dropdown(sh.getRoom(),"text","Deluxe");
}

@When("^user select numberofrooms$")
public void user_select_numberofrooms() throws Throwable {
	Searchhotels  sh =new Searchhotels(driver);
    dropdown(sh.getNrooms(),"text","2 - Two");
       
}

@When("^user select checkindate$")
public void user_select_checkindate() throws Throwable {
	Searchhotels  sh =new Searchhotels(driver);
	inputOnelement(sh.getCheckIn(),"12/12/2019");

}
@When("^user select checkoutdate$")
public void user_select_checkoutdate() throws Throwable {
	Searchhotels  sh =new Searchhotels(driver);
	inputOnelement(sh.getCheckOut(),"25/12/2019");
}

@When("^user Select adultsperroom$")
public void user_Select_adultsperroom() throws Throwable {
	Searchhotels  sh =new Searchhotels(driver);
    dropdown(sh.getAdults(), "text", "1 - One" );
}

@When("^user select childrenperroom$")
public void user_select_childrenperroom() throws Throwable {
	Searchhotels  sh =new Searchhotels(driver);
    dropdown(sh.getChilds(),"text","1 - One" );
}

@Then("^user verify the serach in the loginpage$")
public void user_verify_the_serach_in_the_loginpage() throws Throwable {
	Searchhotels  sh =new Searchhotels(driver);
     clickOnelemant(sh.getSearch());
}


	
	
	}
