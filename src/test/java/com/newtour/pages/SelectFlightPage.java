package com.newtour.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.newtour.utils.Base;

public class SelectFlightPage extends Base {

	public SelectFlightPage() {

		PageFactory.initElements(driver, this);
	}
	@FindBy(name="outFlight")
	public WebElement departureBtn;
	
	@FindBy(name="inFlight")
	public WebElement returnBtn;
	
	@FindBy(name="reserveFlights")
	public WebElement contunieBtn;

}
