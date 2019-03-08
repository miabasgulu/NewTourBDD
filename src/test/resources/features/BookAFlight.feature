Feature: Book a flight 

Background: Go to webpage, sign in user account and fill out flight details 

	Given I go to webpage 
	Then I enter user name 
	And I ener password 
	And I click sign in button 
	Then I lunch user account 
	Then I clik type button as a "round trip" option 
	Then I select "4" passenger from the dropdown 
	Then I select departure from dropdown as "New York" aeraport 
	Then I select departure date as "August, 15" from dropdown 
	Then I select arriving as "Sydney" aeraport from dropdown 
	Then I select arriving date as "August, 25" from dropdown 
	Then I click on economy class radio button 
	Then I select "Blue Skies Airlines" from Airline dropdown 
	Then I click continue button 
	And I select "Blue Skies Airlines 361" from deoarture table 
	And I select Blue "Skies Airlines 631" from return table 
	Then I click on "contunie" button 
	
@Test 
Scenario: Fill out passenger's information for bookin a flight 

	Given I enter first name for each passenger 
	Then I enter last name for each passenger 
	Then I select meal type for each passenger 
	
@Test 
Scenario: Fill put credit card information 

	Given I select credit card type 
	Then I enter credit card number 
	Then I select expiration month 
	Then I select expiration year 
	Then I enter credit card first name 
	Then I enter credit card middle name 
	Then I enter credit card last name 
	
@Test 
Scenario: Fill out billing address information 

	Given I enter billing address 
	Then I enter billing City 
	Then I enter billing state 
	Then I enter billing zipp code 
	Then I slect billing country name 
	
@Test 
Scenario: Fill out delivery address information 

	Given I enter delivery address 
	Then I enter delivery City 
	Then I enter delivery state 
	Then I enter delivery zipp code 
	Then I slect delivery country name 
	Then I click on secure purchase button 
	