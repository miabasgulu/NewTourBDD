package com.newtour.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.newtour.utils.Base;

public class LoginPage extends Base {

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "userName")
	public WebElement username;

	@FindBy(name = "password")
	public WebElement password;

	@FindBy(name = "login")
	public WebElement signIn;
}
