Feature: Application Login
# "Background" For common prerequisite for all the scenarios in the same feature file....
#  What if diff scenarios have diff prerequisites.... Hooks....?
#Background:
#Given Validate the browser
#When Browser is triggred
#Then check if browser is started

@SmokeTest
@RegTest
Scenario: Home page default login
Given User is on landing page
When User login into application with "joe" and password "1234"
Then Home page is populated
And Cards displayed are "true"

@MobileTest
@RegTest
Scenario: Home page default login
Given User is on landing page
When User login into application with "john" and password "5678"
Then Home page is populated
And Cards displayed are "false"

# too many params to pass
@RegTest
Scenario: Home page default login
Given User is on landing page
When User signup with following details
|jenny|abcd|john@abcd.com|Australia|123456789|
Then Home page is populated
And Cards displayed are "false"



# for Parameterization "Scenario Outline", "Examples"
@RegTest
Scenario Outline: Home page default login
Given User is on landing page
When User login in to application with <username> and password <password>
Then Home page is populated
And Cards displayed are "true"

Examples:
|username	|password	|
|user1		|pass1		|
|user2		|pass2		|
|user3		|pass3		|
|user4		|pass4		|
