Feature: fetching User Details
Scenario: testing the url for karate
	 
	Given url 'https://reqres.in/api/users/2'
	When method GET
	Then status 200