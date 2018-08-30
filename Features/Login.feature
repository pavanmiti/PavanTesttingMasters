Feature: Validate the following functionalities on the Login Module
	As an Admin User Application should accept only Admin Credentials
	If there is a invalid Username and Password user must validate the error message
	If the User forgot Username and Password should be able to reset
Background:
Given Launch "ff" browser and enter "url" 
	    |firefox|http://server/bank/|

@smoketest	
Scenario: This scenario is designed to validate the valid credentials of Admin User 
	    
	    Then Enter "Username" and "Password"
	    |admin|admin|
	    And Verify the Homepage is displayed
	    Then VerifyBrokenlinks
	    Then Logout and close the browser
	    
	    