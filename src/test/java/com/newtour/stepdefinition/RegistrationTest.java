package com.newtour.stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.newtour.pages.RegistrationPage;
import com.newtour.utils.Base;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class RegistrationTest extends Base {

	RegistrationPage registrPage = new RegistrationPage();

	@Given("^navigate to New Tour homepage$")
	public void navigate_to_New_Tour_homepage() {
		driver.get("http://newtours.demoaut.com");
	}

	@When("^click on register link$")
	public void click_on_register_link() {
		registrPage.registrationLink.click();
	}

	@And("^enter first name to the given text filed$")
	public void enter_first_name_to_the_given_text_filed() {
		registrPage.firstName.sendKeys("BaKu");
	}

	@And("^enter last name to the given text field$")
	public void enter_last_name_to_the_given_text_field() {
		registrPage.lastName.sendKeys("Ismayil");
	}

	@When("^enter phone number to the given text field$")
	public void enter_phone_number_to_the_given_text_field() {
		registrPage.phone.sendKeys("2223334455");
	}

	@When("^enter email address to the given text field$")
	public void enter_email_address_to_the_given_text_field() {
		registrPage.email.sendKeys("Baku.2012.2015@gmail.com");
	}

	@When("^enter mailing address to the given text field$")
	public void enter_mailing_address_to_the_given_text_field() {
		registrPage.addressFirstBox.sendKeys("Metallurg");
		registrPage.addressSecondBox.sendKeys("Mehelle");
	}

	@When("^enter city name to the given text field$")
	public void enter_city_name_to_the_given_text_field() {
		registrPage.city.sendKeys("Sumgait");
	}

	@When("^enter State/Province name to the given text field$")
	public void enter_State_Province_name_to_the_given_text_field() {
		registrPage.state.sendKeys("Azerbaijan");
	}

	@When("^enter postal code to the given text field$")
	public void enter_postal_code_to_the_given_text_field() {
		registrPage.postalCode.sendKeys("22031");
	}

	@When("^select country name from the given dropdown option$")
	public void select_country_name_from_the_given_dropdown_option() {
		WebElement selectCountry = registrPage.country;
		Select selCountry = new Select(selectCountry);
		selCountry.selectByVisibleText("AZERBAIJAN");
	}

	@When("^enter user name to the given text field$")
	public void enter_user_name_to_the_given_text_field() {
		registrPage.userName.sendKeys("BaKu");
	}

	@When("^enter password to the given text field$")
	public void enter_password_to_the_given_text_field() {
		registrPage.password.sendKeys("123456789");
	}

	@When("^confirm the password to the given text field$")
	public void confirm_the_password_to_the_given_text_field() {
		registrPage.confirmPassword.sendKeys("123456789");
	}

	@When("^click on submit button$")
	public void click_on_submit_button() {
		registrPage.submitButton.click();
	}
	
	@Given("^enter \"([^\"]*)\" to the given text field$")
	public void enter_to_the_given_text_field(String arg1)   {
	    registrPage.userName.sendKeys(arg1);
	}
	
	@Given("^enter your \"([^\"]*)\" to the given text field$")
	public void enter_your_to_the_given_text_field(String arg1)   {
	   registrPage.password.sendKeys(arg1);
	}

	@Given("^\"([^\"]*)\" to the given text field$")
	public void to_the_given_text_field(String arg1)   {
	   registrPage.confirmPassword.sendKeys(arg1);
	}

}
