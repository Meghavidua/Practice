Feature: Header Search - Web Application

Scenario: Using Header Search Process the Flow 
Given user is in landing page
When user clicks on signin link
When user enters valid username
And user enters vaid  password
And clicks on Sign-in button
When user choose the product by header search
Then user click on add to card
Then user add the product to the cart
Then user view the cart
When user choose the delivery method
And user proceed with donation
And user close the pop
When user enter promotion code if any
When user enter FBC if available
When user choose auto order /one time order
When user add payment information
And user click final place order
Then user proceed complete checkout
Then Order place sucessfully 