Feature: Flights page 

Background: Go to webpage and sign in user account 

	Given I go to webpage 
	Then I enter user name 
	And I ener password 
	And I click sign in button 
	Then I lunch user account 
	
@Test	
Scenario: Fill out flight order detail form 

	Given I clik type button as a "round trip" option 
	Then I select "4" passenger from the dropdown 
	Then I select departure from dropdown as "New York" aeraport 
	Then I select departure date as "August, 15" from dropdown 
	Then I select arriving as "Sydney" aeraport from dropdown 
	Then I select arriving date as "August, 25" from dropdown 
	Then I click on economy class radio button 
	Then I select "Blue Skies Airlines" from Airline dropdown 
	Then I click continue button 
	
	
	