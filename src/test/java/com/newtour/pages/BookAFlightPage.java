package com.newtour.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.newtour.utils.Base;

public class BookAFlightPage extends Base {

	public BookAFlightPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "passFirst0")
	public WebElement firstPassFN;

	@FindBy(name = "passLast0")
	public WebElement firstPassLN;

	@FindBy(name = "pass.0.meal")
	public WebElement firPassMealType;

	@FindBy(name = "passFirst1")
	public WebElement secondPassFN;

	@FindBy(name = "passLast1")
	public WebElement secondPassLN;

	@FindBy(name = "pass.1.meal")
	public WebElement secPassMealType;

	@FindBy(name = "passFirst2")
	public WebElement thirdPassFN;

	@FindBy(name = "passLast2")
	public WebElement thirdPassLN;

	@FindBy(name = "pass.2.meal")
	public WebElement thirPassMealType;

	@FindBy(name = "passFirst3")
	public WebElement fourthPassFN;

	@FindBy(name = "passLast3")
	public WebElement fourthPassLN;

	@FindBy(name = "pass.3.meal")
	public WebElement fourPassMealType;

	@FindBy(name = "creditCard")
	public WebElement creditCardType;

	@FindBy(name = "creditnumber")
	public WebElement creditCardNum;

	@FindBy(name = "cc_exp_dt_mn")
	public WebElement credCardExpMonth;

	@FindBy(name = "cc_exp_dt_yr")
	public WebElement credCardExpYear;

	@FindBy(name = "cc_frst_name")
	public WebElement credCarFN;

	@FindBy(name = "cc_mid_name")
	public WebElement credCarMN;

	@FindBy(name = "cc_last_name")
	public WebElement credCarLastN;

	@FindBy(name = "billAddress1")
	public WebElement billAddress1;

	@FindBy(name = "billAddress2")
	public WebElement billAddress2;

	@FindBy(name = "billCity")
	public WebElement billCity;

	@FindBy(name = "billState")
	public WebElement billState;

	@FindBy(name = "billZip")
	public WebElement billZippCode;

	@FindBy(name = "billCountry")
	public WebElement billCountry;

	@FindBy(name = "delAddress1")
	public WebElement delAddress1;

	@FindBy(name = "delAddress2")
	public WebElement delAddress2;

	@FindBy(name = "delCity")
	public WebElement delCity;

	@FindBy(name = "delState")
	public WebElement delState;

	@FindBy(name = "delZip")
	public WebElement delZippCode;

	@FindBy(name = "delCountry")
	public WebElement delCountry;

	@FindBy(name = "buyFlights")
	public WebElement securePurchaseBtn;

	@FindBy(xpath = "//img[@src='/images/forms/home.gif']")
	public WebElement backToHome;

}
