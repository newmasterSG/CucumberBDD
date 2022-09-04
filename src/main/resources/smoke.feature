Feature: Smoke
  As a userit
  I want to test all main se functionality
  So that I can be sure that site works correctly

  Scenario Outline: Check to other options in the page of Product
    Given User opens '<homePage>' page
    And User checks search field visibility
    When User makes search by keyword '<keyword>'
    And User clicks search button
    And User clicks to the first product
    And User checks buying options visibility
    Then User clicks buying options
    Examples:
      | homePage               | keyword                         |
      | https://www.amazon.com | Logitech Wireless Combo MK270   |


  Scenario Outline: Check main function
    Given User opens <url> page
    And User checks header visibility
    And User checks footer visibility
    And User checks search field visibility
    And User checks sign in field visibility
    And User checks choose language visibility
    And User checks order field visibility
    And User checks deliver to country field visibility
    And User checks cart visibility
    And User checks register button visibility
    And User checks today's deals field visibility
    And User checks customer service field visibility
    And User checks sell field visibility
    When User makes search by keyword '<keyword>'
    Then User clicks search button
    Examples:
      | url                      |keyword    |
      | 'https://www.amazon.com' |Samsung S20|

    Scenario Outline: Click to the intercepted element on the site
      Given User opens '<homePage>' page
      And User checks gift card field visibility
      And User clicks gift card
      When User clicks to the choose format
      And User clicks to first product
      Then User clicks to logo
      Examples:
        | homePage                       |
        |   https://www.amazon.com       |

      Scenario Outline: Check The Sing In Page and Create Page element
        Given User opens '<homePage>' page
        And User checks sign in field visibility
        When User clicks to the sign in field
        And User checks field is entry
        And User checks register visibility
        Then User clicks register button
        And User checks name field visibility
        And User checks email or email field visibility
        And User checks password visibility
        And User checks repassword visibility
        Examples:
          | homePage                       |
          |   https://www.amazon.com       |

        Scenario Outline: Fill Sign In element
          Given User opens '<homePage>' page
          And User checks sign in field visibility
          When User clicks to the sign in field
          Then User fills data '<email>'
          Examples:
            | homePage                       |email|
            |   https://www.amazon.com       |baminrl@email-temp.com|

          Scenario Outline: Create Account
            Given User opens '<homePage>' page
            And User checks sign in field visibility
            When User clicks to the sign in field
            And User checks register visibility
            Then User clicks register button
            And User fills '<name>'
            And User fills'<email>'
            And User fill '<password>'
            And User fill'<repassword>'
            Examples:
              | homePage | name | email | password |repassword|
              | https://www.amazon.com      |Yehor      |    baminrl@email-temp.com   |    123456789      |123456789|

            Scenario Outline: Choose Language and Currency
              Given User opens '<homePage>' page
              And User checks choose language visibility
              When User clicks to the choose language
              And User checks change language visibility
              And User clicks change language
              And User checks change choice currency visibility
              And User clicks to the choice currency
              And User checks currency visibility
              Then User clicks currency
              Examples:
                | homePage |
              |   https://www.amazon.com        |

              Scenario Outline: Change banners
                Given User opens '<homePage>' page
                And User checks to change click right
                When User click to change right
                And User checks to change click left
                Then User clicks to change left
                Examples:
                  |             homePage           |
                  |https://www.amazon.com          |

                  Scenario Outline: Check amount products on the search page
                    Given User opens '<homePage>' page
                    And User checks search field visibility
                    When User makes search by keyword '<keyword>'
                    And User clicks search button
                    Then User checks that amount of products on the page
                    Examples:
                      | homePage | keyword |
                      | https://www.amazon.com         |  Samsung S20  |

  Scenario Outline:Change country
    Given User opens '<homePage>' page
    And User checks left side bar visibility
    And User clicks left side bar button
    And User checks change country on side bar
    When User clicks change country
    And User checks change country field visibility
    And User clicks change country field
    And User checks returns to homepage
    Then User clicks returns to homepage
    Examples:
      | homePage |
      |   https://www.amazon.com       |

