Feature: Retail Account Page

Background:
	Given User is on Retail website
	When User click on Sign in option
	And User enter email 'hussain@gmail.com' and password 'Hussain@17'
	And User click on login button
	Then User should be logged in into the Account
	
	@profileInfoUpdated
	Scenario: Verify User can update profile information
	When User click on Account option
	And User update Name 'Aseela Jan' and Phone '(500)500-6000'
	And User click on Update button
	Then User profile information should be updated
	
	@passwordUpdated
	Scenario: Verfiy User can update password
		When User click on Account option
		And User enter below information
		|previousPassword|newPassword|confirmPassword|
		|Hussain@17|Hussain@18|Hussain@18|
		And User click on Change Password button
		Then a message should be displayed 'Password Updated Successfully'
		
		@paymentAdded
		Scenario: Verify User can add a payment method
			When User click on Account option
			And User click on Add a payment method link
			And User fill Debit or credit card information
			|cardNumber|nameOnCard|expirationYear|expirationMonth|securityCode|
			|9876543210222222|Asma Jan|2040|10|333|
			And User click on Add your card button
			Then a message should be displayed as 'Payment Method added sucessfully'
		
		@paymentUpdated
		Scenario: Verify User can edit Debit or Credit card
			When User click on Account option
			And User click on added Debit card or Credit card
			And User click on Edit option of card section
			And User edit information with below data
			#|cardNumber|nameOnCard|expirationYear|expirationMonth|securityCode|
			|4444444455555555|Naheed Jan|2036|4|123|
			And User click on Update Your Card button
			Then a message should show up 'Payment Method updated Successfully'
		
		@removeDebitCard     
		Scenario: Verify User can remove Debit or Credit card
			When User click on Account option
			And User click on added Debit card or Credit card
			And User click on remove option of card section
			Then payment details should be removed
		
		@addAddress
		Scenario: Verify User can add an address
			When User click on Account option
			And User click on Add address option
			And User fill new address form with below information
			|country|fullName|phoneNumber|streetAddress|apt|city|state|zipCode|
			|United States|Hussain Rezai|2027313131|1131 University Blvd| 1500|Silver Spring|Maryland|20785|
			And User click on Add Your Address button
			Then a message should display 'Address Added Successfully'
		
		@testAddress 
		Scenario: Verify User can add nother address information for test
			When User click on Account option
			And User click on Add address option
			And User fill the address form with below information
			#|country|fullName|phoneNum|streetAdd|aptNum|city|state|zipCode|
			|Afghanistan|Mudaser Musakhail|0776217631|100 Nor|100|Kabul|Kabul|10010|
	  #	And User click on update Your Address button
		  Then a message should display 'Address Added Successfully'
		
		@addressUpdated
		Scenario: Verify User can edit an Address added on account
			When User click on Account option
			And User click on edit address option
			And User update address form with below information
		#	|country|fullName|phoneNumber|streetAddress|apt|city|state|zipCode|
			|United States|Feraidon Hakimi|8800000000|777 Hill Road|420|German Town|Virginia|90000|
			And User click on Update Your Address button
			Then a message should come as 'Address Updated Successfully'
		
		@addressRemoved
		Scenario: Verify User can remove Address from Account
			When User click on Account option
			And User click on Remove option of Address section
			Then Address details should be removed
		
		
		
		
		
		
		
		
		
		
		
		