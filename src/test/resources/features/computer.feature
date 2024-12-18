@regression
  Feature:  Computer Feature

    @smoke
    Scenario: User should Navigate to Computer page sccuessfully
      Given I am on the  home page
      When I click on the computer tab
      Then I can see text "Computers"

      @sanity
      Scenario: User should navigate to desktop page successfully
        Given I am on the  home page
        When I click on the computer tab
        And I click on Desktop Link
        Then I can see the text "Desktops"


        Scenario Outline: User Should BuildYouOwnComputer And Add Them To Cart Successfully
          Given I am on the  home page
          When I click on the computer tab
          And I click on Desktop Link
          And I Click on the product name "Build your own computer"
          And I Select processor "<processor>"
          And I Select RAM "<ram>"
          And I Select HDD "<hdd>"
          And I Select OS "<os>"
          And I Select Software "<software>"
          And I Click on ADD TO CART Button
          Then I can see the Message"The product has been added to your shopping cart"

          Examples:
            | processor                                      | ram          | hdd               | os                  | software                  |
            | 2.2 GHz Intel Pentium Dual-Core E2200          | 2 GB         | 320 GB            | Windows 7[+50.00]   | Microsoft Office [+50.00] |
            | 2.5 GHz Intel Pentium Dual-Core E2200 [+15.00]  |4GB [+20.00]  | 400 GB [+100.00]  | Windows 10 [+60.00] | Acrobat Reader [+10.00]   |
            | 2.5 GHz Intel Pentium Dual-Core E2200 [+15.00] |8GB [+60.00]  | 320 GB            | Ubuntu              |  Total Commander [+5.00]  |