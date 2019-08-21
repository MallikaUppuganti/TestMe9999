$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/training_h2a.06.15/Desktop/Testing/Week 3/Selenium WorkSpace/CucumberDemo4/Feature456/mtest9999.feature");
formatter.feature({
  "name": "Test Validation for the git jenkins integration",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "My demo report validation in jenkins",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "TestMeApp is fully up and running",
  "keyword": "Given "
});
formatter.match({
  "location": "MyTest9999.testmeapp_is_fully_up_and_running()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Registered user will enter valid credentials",
  "keyword": "Then "
});
formatter.match({
  "location": "MyTest9999.registered_user_will_enter_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verifies for the Login Status of her Credentials",
  "keyword": "And "
});
formatter.match({
  "location": "MyTest9999.verifies_for_the_Login_Status_of_her_Credentials()"
});
formatter.result({
  "status": "passed"
});
});