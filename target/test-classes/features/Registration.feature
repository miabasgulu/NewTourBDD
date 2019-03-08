Feature: Registration Test 

Background: Go to website and click on registration link 

	Given navigate to New Tour homepage 
	When click on register link 
	
@Test
Scenario: Fill out contact information 

	Given enter first name to the given text filed 
	And enter last name to the given text field 
	And enter phone number to the given text field 
	Then enter email address to the given text field 
	
@Test
Scenario: Fill out mailing information 

	Given enter mailing address to the given text field 
	And enter city name to the given text field 
	And enter State/Province name to the given text field 
	And enter postal code to the given text field 
	Then select country name from the given dropdown option 
	
@Test
Scenario: Fill out user information 

	Given enter user name to the given text field 
	And enter password to the given text field 
	And confirm the password to the given text field 
	Then click on submit button 
	
@Test
Scenario Outline: 

	Given enter "<user name>" to the given text field 
	And enter your "<password>" to the given text field 
	And "<confirm the password>" to the given text field 
	Then click on submit button 
	
	Examples: 
	
		| user name | password | confirm the password |
		| Hamza     | 123456   | 123456               |
		| Azer      | 456789   | 456789               |
		| Yashar    | 123789   | 123789               |
