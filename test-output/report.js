$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./features/SignUp.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "Sign Up",
  "description": "",
  "id": "sign-up",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 23,
  "name": "Successful Sign Up With Valid Credentials",
  "description": "",
  "id": "sign-up;successful-sign-up-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 22,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "User opens URL \"https://gillette.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "Mouse hover on Account",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Click Login/Sign Up",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Click Sign Up",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Enter Email Address as \"rishav.x.rishu@gmail.com\"",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "Enter Password as \"Rishav@123\"",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Enter Confirm Password as \"Rishav@123\"",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Enter First Name as \"Rishav\"",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Enter Last Name as \"Shrivastava\"",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Enter Zip as \"58745\"",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Wait till captcha is checked",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "Click on Get Started",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Page Title should be \"Gillette - Order Status\"",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "SignUpSteps.user_Launch_Chrome_browser()"
});
formatter.result({
  "duration": 3535352214,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://gillette.com",
      "offset": 16
    }
  ],
  "location": "SignUpSteps.user_opens_URL(String)"
});
formatter.result({
  "duration": 4505269670,
  "status": "passed"
});
formatter.match({
  "location": "SignUpSteps.mouse_hover_on_Account()"
});
formatter.result({
  "duration": 134320016,
  "status": "passed"
});
formatter.match({
  "location": "SignUpSteps.click_Login_Sign_Up()"
});
formatter.result({
  "duration": 3608620366,
  "status": "passed"
});
formatter.match({
  "location": "SignUpSteps.click_Sign_Up()"
});
formatter.result({
  "duration": 17689187393,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rishav.x.rishu@gmail.com",
      "offset": 24
    }
  ],
  "location": "SignUpSteps.enter_Email_Address_as(String)"
});
formatter.result({
  "duration": 693787024,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rishav@123",
      "offset": 19
    }
  ],
  "location": "SignUpSteps.enter_Password_as(String)"
});
formatter.result({
  "duration": 208526255,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rishav@123",
      "offset": 27
    }
  ],
  "location": "SignUpSteps.enter_Confirm_Password_as(String)"
});
formatter.result({
  "duration": 131199225,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rishav",
      "offset": 21
    }
  ],
  "location": "SignUpSteps.enter_First_Name_as(String)"
});
formatter.result({
  "duration": 138594695,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Shrivastava",
      "offset": 20
    }
  ],
  "location": "SignUpSteps.enter_Last_Name_as(String)"
});
formatter.result({
  "duration": 120547268,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "58745",
      "offset": 14
    }
  ],
  "location": "SignUpSteps.enter_Zip_as(String)"
});
formatter.result({
  "duration": 123857936,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.wait_Till_Captcha_Is_Checked()"
});
formatter.result({
  "duration": 20000258126,
  "status": "passed"
});
formatter.match({
  "location": "SignUpSteps.click_on_Get_Started()"
});
formatter.result({
  "duration": 107423050,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Gillette - Order Status",
      "offset": 22
    }
  ],
  "location": "SignUpSteps.page_Title_should_be(String)"
});
formatter.result({
  "duration": 5938682,
  "error_message": "java.lang.AssertionError: expected [Gillette - Order Status] but found [Gillette - Create Account]\n\tat org.testng.Assert.fail(Assert.java:97)\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:136)\n\tat org.testng.Assert.assertEquals(Assert.java:118)\n\tat org.testng.Assert.assertEquals(Assert.java:575)\n\tat org.testng.Assert.assertEquals(Assert.java:585)\n\tat stepdefinitions.SignUpSteps.page_Title_should_be(SignUpSteps.java:100)\n\tat ✽.Then Page Title should be \"Gillette - Order Status\"(./features/SignUp.feature:37)\n",
  "status": "failed"
});
formatter.match({
  "location": "SignUpSteps.close_browser()"
});
formatter.result({
  "status": "skipped"
});
});