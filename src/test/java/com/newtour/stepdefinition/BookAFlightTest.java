package com.newtour.stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.newtour.pages.BookAFlightPage;
import com.newtour.utils.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BookAFlightTest extends Base {

	BookAFlightPage bookFlight = new BookAFlightPage();

	@Given("^I enter first name for each passenger$")
	public void i_enter_first_name_for_each_passenger() {
		bookFlight.firstPassFN.sendKeys("Mahammad");
		bookFlight.secondPassFN.sendKeys("Hamza");
		bookFlight.thirdPassFN.sendKeys("Kubra");
		bookFlight.fourthPassFN.sendKeys("Banu");
	}

	@Then("^I enter last name for each passenger$")
	public void i_enter_last_name_for_each_passenger() {
		bookFlight.firstPassLN.sendKeys("Ismayil");
		bookFlight.secondPassLN.sendKeys("Ismayil");
		bookFlight.thirdPassLN.sendKeys("Ismayil");
		bookFlight.fourthPassLN.sendKeys("Ismayil");
	}

	@Then("^I select meal type for each passenger$")
	public void i_select_meal_type_for_each_passenger() {
		WebElement mealType = bookFlight.firPassMealType;
		Select slc = new Select(mealType);
		slc.selectByVisibleText("Muslim");

		WebElement mealType2 = bookFlight.secPassMealType;
		Select slc2 = new Select(mealType2);
		slc2.selectByVisibleText("Muslim");

		WebElement mealType3 = bookFlight.thirPassMealType;
		Select slc3 = new Select(mealType3);
		slc3.selectByVisibleText("Muslim");

		WebElement mealType4 = bookFlight.fourPassMealType;
		Select slc4 = new Select(mealType4);
		slc4.selectByVisibleText("Muslim");
	}

	@Given("^I select credit card type$")
	public void i_select_credit_card_type() {
		WebElement cctype = bookFlight.creditCardType;
		Select creccType = new Select(cctype);
		creccType.selectByVisibleText("Visa");
	}

	@Then("^I enter credit card number$")
	public void i_enter_credit_card_number() {
		bookFlight.creditCardNum.sendKeys("44556677889933");
	}

	@Then("^I select expiration month$")
	public void i_select_expiration_month() {
		WebElement ccExpM = bookFlight.credCardExpMonth;
		Select credCExpM = new Select(ccExpM);
		credCExpM.selectByVisibleText("07");
	}

	@Then("^I select expiration year$")
	public void i_select_expiration_year() {
		WebElement ccExpY = bookFlight.credCardExpYear;
		Select credCExpY = new Select(ccExpY);
		credCExpY.selectByVisibleText("2010");
	}

	@Then("^I enter credit card first name$")
	public void i_enter_credit_card_first_name() {
		bookFlight.credCarFN.sendKeys("Mahammad");
	}

	@Then("^I enter credit card middle name$")
	public void i_enter_credit_card_middle_name() {
		bookFlight.credCarMN.sendKeys("Hamza");
	}

	@Then("^I enter credit card last name$")
	public void i_enter_credit_card_last_name() {
		bookFlight.credCarLastN.sendKeys("Ismayil");
	}

	@Given("^I enter billing address$")
	public void i_enter_billing_address() {
		bookFlight.billAddress1.clear();
		bookFlight.billAddress1.sendKeys("Seminary rd");
		bookFlight.billAddress2.sendKeys("Bailey's Crossroads");
	}

	@Then("^I enter billing City$")
	public void i_enter_billing_City() {
		bookFlight.billCity.clear();
		bookFlight.billCity.sendKeys("Alexandria");
	}

	@Then("^I enter billing state$")
	public void i_enter_billing_state() {
		bookFlight.billState.clear();
		bookFlight.billState.sendKeys("VA");
	}

	@Then("^I enter billing zipp code$")
	public void i_enter_billing_zipp_code() {
		bookFlight.billZippCode.clear();
		bookFlight.billZippCode.sendKeys("22311");
	}

	@Then("^I slect billing country name$")
	public void i_slect_billing_country_name() {
		WebElement countryBillAddress = bookFlight.billCountry;
		Select counBilAdd = new Select(countryBillAddress);
		counBilAdd.selectByVisibleText("UNITED STATES");

	}

	@Given("^I enter delivery address$")
	public void i_enter_delivery_address() {
		bookFlight.delAddress1.clear();
		bookFlight.delAddress1.sendKeys("Persimmon dr");

		bookFlight.billAddress2.sendKeys("Mantua");
	}

	@Then("^I enter delivery City$")
	public void i_enter_delivery_City() {
		bookFlight.delCity.clear();
		bookFlight.delCity.sendKeys("Fairfax");
	}

	@Then("^I enter delivery state$")
	public void i_enter_delivery_state() {
		bookFlight.delState.clear();
		bookFlight.delState.sendKeys("VA");
	}

	@Then("^I enter delivery zipp code$")
	public void i_enter_delivery_zipp_code() {
		bookFlight.delZippCode.clear();
		bookFlight.delZippCode.sendKeys("22031");
	}

	@Then("^I slect delivery country name$")
	public void i_slect_delivery_country_name() {
		WebElement countrydeliveryAddress = bookFlight.billCountry;
		Select counDelAdd = new Select(countrydeliveryAddress);
		counDelAdd.selectByVisibleText("UNITED STATES");
	}

	@Then("^I click on secure purchase button$")
	public void i_click_on_secure_purchase_button() {
		bookFlight.securePurchaseBtn.click();
		bookFlight.backToHome.click();
	}

}
