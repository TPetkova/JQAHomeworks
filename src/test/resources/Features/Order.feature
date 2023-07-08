Feature: User makes an order
  In order to make a successful order
  As a user
  I want to be able to add products in the shopping cart

  @smoke
  Scenario: 1. User selects a product and add it to the shopping cart
    Given a user is on the Home page
    And the user selects an item "Sauce Labs Onesie" from the products
    When the user clicks "Add to cart" button
    Then the shopping cart has 1 product
    And the selected item "Sauce Labs Onesie" is added to the cart

  @smoke
  Scenario: 2. User add a product to the cart
    Given a user is on the Home page
    When the user clicks "Add to cart" button of the product "Sauce Labs Backpack"
    Then the shopping cart has 1 product
    And the selected item "Sauce Labs Backpack" is added to the cart