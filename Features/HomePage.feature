Feature: Validate the following functionalities on the Home Page Module
	As an User Application should be launched properly
	
	Background: 
	Given Launch "ff" browser and enter "url" 
	    |firefox|http://server/bank/|
	    
@tab
Scenario: This scenario is designed to validate the valid credentials of Admin User 
	    
	    Then check for  features
	    Then verify Tab Order
	    Then validateTabs
	    And close browser
	    
	    