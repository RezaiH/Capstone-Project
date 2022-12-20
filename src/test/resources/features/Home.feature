Feature: Retail Home Page

  @shopByDepartmentSidebar
  Scenario: Verify Shop by Department sidebar
    Given User is on Retail website
    When User click on All section
    Then below options are present in Shop By department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |

  @departmentSidebarOptions
  Scenario Outline: Verify department sidebar options
    Given User is on Retail website
    When User click on All section
    And User on 'department'
    Then below options are present in department
      | <optionOne> | <optionTwo> |

    Examples: 
      | department  | optionOne                      | optionTwo                |
      | Electronics | TV & Video                     | Video Games              |
      | Computers   | Accessories                    | Networking               |
      | Smart Home  | Smart Home Lightning           | Plugs and Outlets        |
      | Sports      | Athletic Clothing              | Exercise & Fitness       |
      | Automative  | Automative Parts & Accessories | MotorCycle & Powersports |

  @addItemToCart
  Scenario: Verify User can add an item to cart
    Given User is on Retail website
    When User click on Sign in option
    And User enter email 'hussain@gmail.com' and password 'Hussain@17'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click on add to Cart button
    Then the cart icon quantity should change to '2'

  @placingOrderWoutSA
  Scenario: Verify User can place an order without Shipping address and payment Method on file
    Given User is on Retail website
    When User click on Sign in option
    And User enter email 'hussain@gmail.com' and password 'Hussain@17'
    And User click on login button
    And User should be logged in into Account
    And User change the category to 'Smart Home'
    And User search for an item 'kasa Outdoor Smart Plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click on add to Cart button
    Then the cart icon quantity should change to '2'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click Add a new address link for shipping address
    And User fill new address form with below data
      | country     | fullName      | phoneNumber | streetAddress | apt | city   | state      | zipCode |
      | Afghanistan | Aseela |  2027272727 | 490 Khoshal Khan | 100 | Center | Herat |   80809 |
    And User click on Add Your Address button
    And User click on Add a Credit Card or Debit Card for payment method
    And User fill Debit or Credit Card information
      | cardNumber       | nameOnCard    | expirationYear | expirationMonth | securityCode |
      | 4343434332323232 | Naweed Ahmad |              2036 |        4    |        800 |
    And User click on Add your card button
    And User click on Place Your Order
    Then a message displays 'Order Placed, Thanks'

  @placingOrderWSA
  Scenario: Verify User can place an order with Shipping address and payment method on file
    Given User is on Retail website
    When User click on Sign in option
    And User enter email 'hussain@gmail.com' and password 'Hussain@17'
    And User click on login button
    And User should be logged in into Account
    And User change category to 'Electronics'
    And User search for the item 'Apex Legends'
    And User click on Search icon
    And User click on the item
    And User select the quantity '5'
    And User click on add to Cart button
    Then the cart icon quantity should change to '5'
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click on Place Your Order
    Then a message should appear 'Order Placed, Thanks'
