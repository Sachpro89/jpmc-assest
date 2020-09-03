Feature: Title of your feature
   
  Scenario: J.P.Morgan home page verification
    Given User launch chrome browser
    When User opens URL "http://www.Google.com"
    And User search for "J.P.Morgan"
    And User click on the first Link
    Then user should be able to see the LOGO
    And Page Title should be "J.P. Morgan India | About us"
    And close the browser

  