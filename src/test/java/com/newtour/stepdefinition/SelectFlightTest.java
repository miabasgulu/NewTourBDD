package com.newtour.stepdefinition;

import com.newtour.pages.SelectFlightPage;
import com.newtour.utils.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SelectFlightTest extends Base{
	
	SelectFlightPage selFlight = new SelectFlightPage();
	
	@Given("^I select \"([^\"]*)\" from deoarture table$")
	public void i_select_from_deoarture_table(String arg1) {
	    selFlight.departureBtn.click();
	}

	@Given("^I select Blue \"([^\"]*)\" from return table$")
	public void i_select_Blue_from_return_table(String arg1) {
	   selFlight.returnBtn.click();
	}

	@Then("^I click on \"([^\"]*)\" button$")
	public void i_click_on_button(String arg1) {
	   selFlight.contunieBtn.click();
	}


}
