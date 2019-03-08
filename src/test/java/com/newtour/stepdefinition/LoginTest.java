package com.newtour.stepdefinition;

import com.newtour.pages.LoginPage;
import com.newtour.utils.Base;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import cucumber.api.java.en.*;

public class LoginTest extends Base {

	final static org.apache.log4j.Logger logger = Logger.getLogger(LoginTest.class);
	LoginPage loginPage = new LoginPage();

	@Test
	@Given("^I go to webpage$")
	public void i_go_to_webpage() {
		driver.get("http://newtours.demoaut.com");
		logger.info("Website opened");
	}

	@Then("^I enter user name$")
	public void i_enter_user_name() {
		loginPage.username.sendKeys("BaKu");
		logger.info("User name entered");
	}

	@Then("^I ener password$")
	public void i_ener_password() {
		loginPage.password.sendKeys("123456789");
		logger.info("Password entered");
	}

	@Then("^I click sign in button$")
	public void i_click_sign_in_button() {
		loginPage.signIn.click();
		logger.info("Clicked on sign in button");
	}

	@Then("^I lunch user account$")
	public void i_lunch_user_account() {
		logger.info("Lunched user account");
	}

}
