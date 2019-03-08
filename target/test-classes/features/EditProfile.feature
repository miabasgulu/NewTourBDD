Feature: Edit Profile 

Background: Go to website and log in account 

	Given I go to webpage 
	Then I enter user name 
	And I ener password 
	And I click sign in button 

@Test	
Scenario: Edit contact information in exist profile 

	Given I click profile link 
	Then I eneter first name 
	Then I enter last name 
	Then I enter phone number 
	Then i enter email address 
	
@Test
Scenario: Edit mailing information 

	Given I click profile link 
	Then I enter mailing address 
	Then I enter city name 
	Then I enter State name 
	Then I enter zipp code 
	Then I select country name from given options 
	Then I click on submit button 
