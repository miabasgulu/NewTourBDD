package com.newtour.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.newtour.utils.Base;

public class EditProfilePage extends Base{
	
	public EditProfilePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='PROFILE']")
	public WebElement profileLink;
	
	@FindBy(name="firstName")
	public WebElement fName;
	
	@FindBy(name="lastName")
	public WebElement lastName;

	@FindBy(name="phone")
	public WebElement phoneNumber;

	@FindBy(name="email")
	public WebElement email;

	@FindBy(name="address1")
	public WebElement addressFirst;

	@FindBy(name="address2")
	public WebElement addressSecond;

	@FindBy(name="city")
	public WebElement city;

	@FindBy(name="state")
	public WebElement state;

	@FindBy(name="postalCode")
	public WebElement postalCode;

	@FindBy(name="country")
	public WebElement country;

	@FindBy(xpath="//img[@src='images/profile_submit.gif']")
	public WebElement submitBtn;
}
