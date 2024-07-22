Feature: End to End testing

  Scenario: "French No. 6 Ground Coffee: 12-Oz" - Order confirmation
  
  
    Given the user logs into the website
    
    And User navigates to shop all tab
    
    Then the user adds French No 6 Ground Coffee 12 Oz to the cart

    And the final check out is done with order confirmation
