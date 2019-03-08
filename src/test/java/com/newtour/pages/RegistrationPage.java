package com.newtour.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.newtour.utils.Base;

public class RegistrationPage extends Base {

	public RegistrationPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()='REGISTER']")
	public WebElement registrationLink;

	@FindBy(name = "firstName")
	public WebElement firstName;

	@FindBy(name = "lastName")
	public WebElement lastName;

	@FindBy(name = "phone")
	public WebElement phone;

	@FindBy(id = "userName")
	public WebElement email;

	@FindBy(name = "address1")
	public WebElement addressFirstBox;

	@FindBy(name = "address2")
	public WebElement addressSecondBox;

	@FindBy(name = "city")
	public WebElement city;

	@FindBy(name = "state")
	public WebElement state;

	@FindBy(name = "postalCode")
	public WebElement postalCode;

	@FindBy(name = "country")
	public WebElement country;

	@FindBy(id = "email")
	public WebElement userName;

	@FindBy(name = "password")
	public WebElement password;

	@FindBy(name = "confirmPassword")
	public WebElement confirmPassword;

	@FindBy(name = "register")
	public WebElement submitButton;

}
