Feature: check if it creates PDF document with picture
  Scenario: HL logo
    Given a new PDF-document "hl_pic.pdf"
#    When "logo.png" is preprocessed
#    When  "logo.png" is added to the PDF-document
#    And   "logo.png" is roted by 45 degrees
    Then  the PDF-document is closed