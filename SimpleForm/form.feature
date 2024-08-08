
@Start
Feature: Simple form

  @MainProcess
  Scenario: Validate the working of Simple Form Functionality
  
    Given User Opens the Browser and ENter the Url
   
    When User Enters firstname,lastname and Email
    
    And Enters the Contact Number and Message
    
    And Click on submit
    
    Then Thank You for reaching out to us should have been displayed
    
   

 