Feature: Sign in 

@Test
Scenario: Sign in as registrated user 

	Given I go to webpage 
	Then I enter user name 
	And I ener password 
	And I click sign in button 
	Then I lunch user account