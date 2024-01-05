Feature:    customize shade as a guest


  @regression
  Scenario Outline:  Design a shade

   # Given user lunched the URL and login successfully
    When user clicked on Design and Buy button
    And user clicked to select Roller as a shade style
    And user clicked on Next button
    Then user entered the desired Measurements "<width>" and "<widthfraction>" and "<height>" and "<heightfraction>"
    And user clicked Next Button
    And user clicked to select Battery Powered option
    And user click on Next Button
    And user clicked to Choose Mounting Type inside Mount
    And user clicked to choose the Headrail Option Architectural Fascia
    And user clicked on the Next button
    Then user clicked to Choose the Fabric Style
    And user clicked on Next btn
    And user clicked to select Fabric Collection Color Red

    And user clicked on next BTN6
    Then used select the shade control option
    And user select Pico 3button
    And user select Pico color Light Almond "<PicoColor>"
    And user clicked next BTN7
    And used Enter Shade Location Name "<ShadeLocation>"
    Then used Add item to Cart

    Examples:
    |width  | widthfraction  | height | heightfraction | PicoColor    | ShadeLocation    |
    |19     | 7/8            | 12     | 1/2            | Light Almond | My bedroom shade |