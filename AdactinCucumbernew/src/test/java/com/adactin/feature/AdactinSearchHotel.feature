Feature: search functionality for adactin application

Scenario: Successfull search into the adactin application with valid credential
When user select location
And user select hotels
And user select RoomType
And user select numberofrooms
And user select checkindate
And user select checkoutdate
And user Select adultsperroom
And user select childrenperroom 
Then user verify the serach in the loginpage