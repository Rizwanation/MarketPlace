Feature: Testing Landing Page
  Background: WebDriver is initialized successfully
    Given ChromeDriver is Initialized
    Then Browser is open and maximized

    Scenario: Check with Google
      Given Google's URL is Entered
      When User tries to navigate to google
      Then Google Search Page is loaded

