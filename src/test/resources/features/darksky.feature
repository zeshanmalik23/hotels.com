@web @regression @darksky
  Feature: Darksky Feature

    Background:
      Given i am on darksky homepage


      @darksky-1
      Scenario: Verify invalid signup error message
        When I am on the darksky Register page
        And  I click on Register button
        Then I verify current URL

      @darksky-2
        Scenario: Verify Current Temperature should not be greater or less than the Temperature from Daily Timeline
          Then I verify current temp is not greater or less then temps from daily timeline

       @darksky-3
          Scenario: Verify individual day temp timeline

            When I expand todays timeline
            Then I verify lowest and highest temp is displayed correctly

       @darksky-4
            Scenario: Verify timline is displayed in correct format

              Then I verify timeline is displayed with two hours incremented
