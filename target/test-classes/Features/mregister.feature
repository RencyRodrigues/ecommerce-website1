Feature: To test registeration functionality

  @register
  Scenario: 
    Given User is able to open Maxi website
    When User clicks on Sign-in button
    Then User Clicks on Create PC id
    Then User enters Valid email password and confirm password
    Then User clicks on checkbox
    Then User clicks on create a PC id
    #Then User is able to register successfully
    
   @login
   Scenario:
   Given User opens Maxi website
   When User clicks on Sign_in button
   Then User enters email and password
   And clicks on Sign_in button
   Then User is able to login Successfully
   
   
   @HomeBeautyMenu
   Scenario:
   Given User opens Maxiwebsite
   When User hover over Home,Beauty and baby menu bar
   Then User is able to view all the subcategories
   Then user is able to hover over the Sub-Category
   #And user is able to click on a particular Sub-Category
  # Then User is able to open particular Sub-category page
   
   @homebaner
   Scenario:
   Given user open the website
   When User hovers on the banner
   Then user clicks on forward button on banner
   Then user clicks on backward button on banner