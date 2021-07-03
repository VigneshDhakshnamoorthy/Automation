Feature: Fleetstudio Work Page
 	
 	Scenario: Work Page Automation (Positive)
 		Given navigate to workpage
 	 	When filter by "Product Dev" and check projects count is 7
 	 	Then check company "Kimberly-Clark" is display in "Product Dev" filter
 	 	When filter by "QA" and check projects count is 2
	 	Then check company "BMW" is display in "QA" filter
 	 	Then navigate to homepage

 Scenario: Work Page Automation (Negative)
 		Given navigate to workpage
 	 	When filter by "Product Dev" and check projects count is 7
 	 	Then check company "Kimberly-Clark" is display in "Product Dev" filter
 	 	When filter by "QA" and check projects count is 3
	 	Then check company "BMW" is display in "QA" filter
 	 	Then navigate to homepage