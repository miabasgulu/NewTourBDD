$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("BookAFlight.feature");
formatter.feature({
  "line": 1,
  "name": "Book a flight",
  "description": "",
  "id": "book-a-flight",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8049245417,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Go to webpage, sign in user account and fill out flight details",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I go to webpage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter user name",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I ener password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I lunch user account",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I clik type button as a \"round trip\" option",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I select \"4\" passenger from the dropdown",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I select departure from dropdown as \"New York\" aeraport",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I select departure date as \"August, 15\" from dropdown",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I select arriving as \"Sydney\" aeraport from dropdown",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I select arriving date as \"August, 25\" from dropdown",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I click on economy class radio button",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I select \"Blue Skies Airlines\" from Airline dropdown",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "I click continue button",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "I select \"Blue Skies Airlines 361\" from deoarture table",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I select Blue \"Skies Airlines 631\" from return table",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I click on \"contunie\" button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTest.i_go_to_webpage()"
});
formatter.result({
  "duration": 948903344,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.i_enter_user_name()"
});
formatter.result({
  "duration": 164169258,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.i_ener_password()"
});
formatter.result({
  "duration": 85428142,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.i_click_sign_in_button()"
});
formatter.result({
  "duration": 1555733744,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.i_lunch_user_account()"
});
formatter.result({
  "duration": 496484,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "round trip",
      "offset": 25
    }
  ],
  "location": "FlightsTest.i_clik_type_button_as_a_option(String)"
});
formatter.result({
  "duration": 74153570,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 10
    }
  ],
  "location": "FlightsTest.i_select_passenger_from_the_dropdown(String)"
});
formatter.result({
  "duration": 156255477,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "New York",
      "offset": 37
    }
  ],
  "location": "FlightsTest.i_select_departure_from_dropdown_as_aeraport(String)"
});
formatter.result({
  "duration": 115410804,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "August, 15",
      "offset": 28
    }
  ],
  "location": "FlightsTest.i_select_departure_date_as_from_dropdown(String)"
});
formatter.result({
  "duration": 475020795,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sydney",
      "offset": 22
    }
  ],
  "location": "FlightsTest.i_select_arriving_as_aeraport_from_dropdown(String)"
});
formatter.result({
  "duration": 184965544,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "August, 25",
      "offset": 27
    }
  ],
  "location": "FlightsTest.i_select_arriving_date_as_from_dropdown(String)"
});
formatter.result({
  "duration": 287158504,
  "status": "passed"
});
formatter.match({
  "location": "FlightsTest.i_click_on_economy_class_radio_button()"
});
formatter.result({
  "duration": 54355189,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Blue Skies Airlines",
      "offset": 10
    }
  ],
  "location": "FlightsTest.i_select_from_Airline_dropdown(String)"
});
formatter.result({
  "duration": 152981782,
  "status": "passed"
});
formatter.match({
  "location": "FlightsTest.i_click_continue_button()"
});
formatter.result({
  "duration": 384184568,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Blue Skies Airlines 361",
      "offset": 10
    }
  ],
  "location": "SelectFlightTest.i_select_from_deoarture_table(String)"
});
formatter.result({
  "duration": 114235179,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Skies Airlines 631",
      "offset": 15
    }
  ],
  "location": "SelectFlightTest.i_select_Blue_from_return_table(String)"
});
formatter.result({
  "duration": 63423437,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "contunie",
      "offset": 12
    }
  ],
  "location": "SelectFlightTest.i_click_on_button(String)"
});
formatter.result({
  "duration": 496939462,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Fill out passenger\u0027s information for bookin a flight",
  "description": "",
  "id": "book-a-flight;fill-out-passenger\u0027s-information-for-bookin-a-flight",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "I enter first name for each passenger",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "I enter last name for each passenger",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "I select meal type for each passenger",
  "keyword": "Then "
});
formatter.match({
  "location": "BookAFlightTest.i_enter_first_name_for_each_passenger()"
});
formatter.result({
  "duration": 421276692,
  "status": "passed"
});
formatter.match({
  "location": "BookAFlightTest.i_enter_last_name_for_each_passenger()"
});
formatter.result({
  "duration": 415912331,
  "status": "passed"
});
formatter.match({
  "location": "BookAFlightTest.i_select_meal_type_for_each_passenger()"
});
formatter.result({
  "duration": 498764254,
  "status": "passed"
});
