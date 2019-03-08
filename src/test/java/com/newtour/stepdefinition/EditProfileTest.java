package com.newtour.stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.newtour.pages.EditProfilePage;
import com.newtour.utils.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class EditProfileTest extends Base {

	EditProfilePage editProf = new EditProfilePage();

	@Given("^I click profile link$")
	public void i_click_profile_link() {
		editProf.profileLink.click();
	}

	@Then("^I eneter first name$")
	public void i_eneter_first_name() {
		editProf.fName.sendKeys("Khalid");
	}

	@Then("^I enter last name$")
	public void i_enter_last_name()   {
		editProf.lastName.sendKeys("Valid");
	}

	@Then("^I enter phone number$")
	public void i_enter_phone_number()   {
		editProf.phoneNumber.sendKeys("2223334455");
	}

	@Then("^i enter email address$")
	public void i_enter_email_address()   {
		editProf.email.sendKeys("BaKu.2012.2015@gmail.com");
	}

	@Then("^I enter mailing address$")
	public void i_enter_mailing_address()   {
		editProf.addressFirst.sendKeys("Persimmon Dr, Mantua");
		editProf.addressSecond.sendKeys("Fairfax");
	}

	@Then("^I enter city name$")
	public void i_enter_city_name()   {
		editProf.city.sendKeys("Fairfax");
	}

	@Then("^I enter State name$")
	public void i_enter_State_name()   {
		editProf.state.sendKeys("VA");
	}

	@Then("^I enter zipp code$")
	public void i_enter_zipp_code()   {
		editProf.postalCode.sendKeys("22322");
	}

	@Then("^I select country name from given options$")
	public void i_select_country_name_from_given_options()   {
		WebElement selCountry = editProf.country;
		Select selectCoun = new Select(selCountry);
		selectCoun.selectByVisibleText("UNITED STATES");
	}

	@Then("^I click on submit button$")
	public void i_click_on_submit_button()   {
		editProf.submitBtn.click();
	}

}
