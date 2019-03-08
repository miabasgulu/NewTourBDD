package com.newtour.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.newtour.utils.Base;

public class FlightsPage extends Base{

	public FlightsPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="tripType")
	public WebElement flightType;
	
	@FindBy(name="passCount")
	public WebElement passangers;
	
	@FindBy(name="fromPort")
	public WebElement departingFrom;
	
	@FindBy(name="fromMonth")
	public WebElement departingMonth;
	
	@FindBy(name="fromDay")
	public WebElement departingDay;
	
	@FindBy(name="toPort")
	public WebElement arrivingTo;
	
	@FindBy(name="toMonth")
	public WebElement arrivingMonth;
	
	@FindBy(name="toDay")
	public WebElement arrivingDay;
	
	@FindBy(name="servClass")
	public WebElement serviceType;
	
	@FindBy(name="airline")
	public WebElement airline;
	
	@FindBy(name="findFlights")
	public WebElement continueButton;
}
