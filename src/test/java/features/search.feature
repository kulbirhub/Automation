Feature: Search and place order for Vegetables

@GreenKartSearchSmoke
Scenario: Search for items and validate results
Given User is on GreenKart landing page
When User search for "Cucumber" vegetable
Then "Cucumber" results are displayed

@GreenKartSearchRegression
Scenario: Search for items and then move to checkout page
Given User is on GreenKart landing page
When User search for "Brinjal" vegetable
And Added items to cart
And Proceed to checkout page for purchase
Then Verify selected "Brinjal" items are displayed in Checkout page

@GreenKartSearchRegression
Scenario Outline: Search for items and then move to checkout page
Given User is on GreenKart landing page
When User searched for <Name> vegetables
And Added items to cart
And Proceed to checkout page for purchase
Then Verify selected <Name> items are displayed in Checkout pages

Examples:
|Name		|
|Brinjal	|
|Beetroot|

