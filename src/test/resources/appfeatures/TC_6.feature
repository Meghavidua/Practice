Feature: Process with Auto Store Option

Scenario: Auto store option
Given user is in landing page
When user clicks on signin link
When user enters valid username
And user enters vaid  password
And clicks on Sign-in button
Then user choose the product
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