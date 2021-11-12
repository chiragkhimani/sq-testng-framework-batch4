#Author: Chirag
Feature: Login Features Tests
  As user, I should be able to login into the website


  Scenario: verify user can able to login
    Given user is on website
    When user login with valid cred
    Given verify login successful
