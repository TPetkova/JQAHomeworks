$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login_Logout.feature");
formatter.feature({
  "name": "User is able to login and logout on the \"https://www.saucedemo.com/\" page",
  "description": "  In order to use the website functionalities\n  As a user\n  I want to be able to login and logout on the website",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "1. Successful login of a user",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a user is on the \"https://www.saucedemo.com/\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.LoginSteps.aUserIsOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enter a valid username \"standard_user\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.LoginSteps.theUserEnterAValidUsername(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enter a valid password \"secret_sauce\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.LoginSteps.theUserEnterAValidPassword(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks \"Login\" button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.LoginSteps.theUserClicksButton(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is redirected to the Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.LoginSteps.theUserIsRedirectedToTheHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "2. Successful logout of a user",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a user is on the Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.LoginSteps.aUserIsOnTheHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks menu button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.LoginSteps.theUserClicksMenuButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "there is logout option",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.LoginSteps.thereIsLogoutOption()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks logout option",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.LoginSteps.theUserClicksLogoutOption()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is logged out",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.LoginSteps.theUserIsLoggedOut()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Order.feature");
formatter.feature({
  "name": "User makes an order",
  "description": "  In order to make a successful order\n  As a user\n  I want to be able to add products in the shopping cart",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "1. User selects a product and add it to the shopping cart",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a user is on the Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.LoginSteps.aUserIsOnTheHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects an item \"Sauce Labs Onesie\" from the products",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.OrderSteps.theUserSelectsAnItemFromTheProducts(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks \"Add to cart\" button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.LoginSteps.theUserClicksButton(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the shopping cart has 1 product",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.OrderSteps.theShoppingCartHasProduct(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the selected item \"Sauce Labs Onesie\" is added to the cart",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.OrderSteps.theSelectedItemIsAddedToTheCart(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "2. User add a product to the cart",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "a user is on the Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.LoginSteps.aUserIsOnTheHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks \"Add to cart\" button of the product \"Sauce Labs Backpack\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.OrderSteps.theUserClicksButtonOfTheProduct(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the shopping cart has 1 product",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.OrderSteps.theShoppingCartHasProduct(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the selected item \"Sauce Labs Backpack\" is added to the cart",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.OrderSteps.theSelectedItemIsAddedToTheCart(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});