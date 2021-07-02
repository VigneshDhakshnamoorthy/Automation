
Feature: fleetstudio page
  Fleet Studio's Work Page Automation 
 	
 	Scenario: Work Page Automation
 		Given navigate to workpage
 	 	When filter by "Product Dev" and check projects count is 7
 	 	Then check "Kimberly-Clark" is display in this filter
 	 	When filter by "QA" and check projects count is 2
	 	Then check "BMW" is display in this filter
 	 	Then navigate to homepage

 