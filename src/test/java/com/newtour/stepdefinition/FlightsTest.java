package com.newtour.stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.newtour.pages.FlightsPage;
import com.newtour.utils.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FlightsTest extends Base {

	FlightsPage flyPage = new FlightsPage();

	@Given("^I clik type button as a \"([^\"]*)\" option$")
	public void i_clik_type_button_as_a_option(String arg1) {
		flyPage.flightType.click();
	}

	@Then("^I select \"([^\"]*)\" passenger from the dropdown$")
	public void i_select_passenger_from_the_dropdown(String arg1) {
		WebElement pasNum = flyPage.passangers;
		Select selPassanger = new Select(pasNum);
		selPassanger.selectByVisibleText("4");
	}

	@Then("^I select departure from dropdown as \"([^\"]*)\" aeraport$")
	public void i_select_departure_from_dropdown_as_aeraport(String arg1) {
		WebElement departure = flyPage.departingFrom;
		Select selDepartAeroport = new Select(departure);
		selDepartAeroport.selectByVisibleText("New York");
	}

	@Then("^I select departure date as \"([^\"]*)\" from dropdown$")
	public void i_select_departure_date_as_from_dropdown(String arg1) {
		WebElement departingMonth = flyPage.departingMonth;
		Select selDepartMonth = new Select(departingMonth);
		selDepartMonth.selectByVisibleText("August");
		WebElement departingDay = flyPage.departingDay;
		Select selDepartDay = new Select(departingDay);
		selDepartDay.selectByVisibleText("15");

	}

	@Then("^I select arriving as \"([^\"]*)\" aeraport from dropdown$")
	public void i_select_arriving_as_aeraport_from_dropdown(String arg1) {
		WebElement arriving = flyPage.arrivingTo;
		Select selArrivAeroport = new Select(arriving);
		selArrivAeroport.selectByVisibleText("Sydney");
	}

	@Then("^I select arriving date as \"([^\"]*)\" from dropdown$")
	public void i_select_arriving_date_as_from_dropdown(String arg1) {
		WebElement arrivingMonth = flyPage.arrivingMonth;
		WebElement arrivingDay = flyPage.arrivingDay;
		Select selarrivMonth = new Select(arrivingMonth);
		selarrivMonth.selectByVisibleText("August");
		Select selarrivDay = new Select(arrivingDay);
		selarrivDay.selectByVisibleText("25");
	}

	@Then("^I click on economy class radio button$")
	public void i_click_on_economy_class_radio_button() {
		flyPage.serviceType.click();
	}

	@Then("^I select \"([^\"]*)\" from Airline dropdown$")
	public void i_select_from_Airline_dropdown(String arg1) {
		WebElement airline = flyPage.airline;
		Select selAirline = new Select(airline);
		selAirline.selectByVisibleText("Blue Skies Airlines");
	}

	@Then("^I click continue button$")
	public void i_click_continue_button() {
		flyPage.continueButton.click();
	}

}
