Feature: test

  Background:
    * url baseUrl

  Scenario: test

    Given path 'test'
    And header Content-Type = 'application/json'
    And request {}
    When method GET
    Then status 200
    And match $ == "OK"
