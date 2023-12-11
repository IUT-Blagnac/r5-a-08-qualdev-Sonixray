Feature: An example

  Scenario: today is Sunday
    Given today is Sunday
    When I ask whether it's Friday yet
    Then I should be told "Nope"

  Scenario: today is Friday
    Given today is Friday
    When I ask whether it's Friday yet
    Then I should be told "TGIF"
    
  Scenario: today is Tuesday
    Given today is Tuesday
    When I ask whether it's Friday yet
    Then I should be told "Nope"