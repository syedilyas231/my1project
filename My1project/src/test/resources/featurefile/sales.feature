Feature: login error inn salesforce webpage
  @salesregrun1
    #Before
   Scenario: salesforce error validation
 #Given navigate to webpage salesforce
    When user enter username "syed" and password "12345"
    And click on login button
    Then validate credentials of web page

#After
