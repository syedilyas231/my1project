Feature: multi task through scenario outlines concept
  @scenariorun
  Scenario Outline: multitasks
    Given navigate to web page
    When user enter  username"<username>" and  password"<password>"
    And  click to login
    Then validate the web
    Examples:
      | username | password       |
      | syed     | 34513534654we  |
      | ilyas    | 623547715757tr |
      | ahmed    | 7547778889re   |