$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/resources/Feature/homePageVerify.feature");
formatter.feature({
  "line": 1,
  "name": "Title of your feature",
  "description": "",
  "id": "title-of-your-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "J.P.Morgan home page verification",
  "description": "",
  "id": "title-of-your-feature;j.p.morgan-home-page-verification",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User launch chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User opens URL \"http://www.Google.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User search for \"J.P.Morgan\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User click on the first Link",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should be able to see the LOGO",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Page Title should be \"J.P. Morgan India | About us\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepsToVerify.user_launch_chrome_browser()"
});
formatter.result({
  "duration": 8798070500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.Google.com",
      "offset": 16
    }
  ],
  "location": "StepsToVerify.user_opens_URL(String)"
});
formatter.result({
  "duration": 3877666300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "J.P.Morgan",
      "offset": 17
    }
  ],
  "location": "StepsToVerify.user_search_for(String)"
});
formatter.result({
  "duration": 2062401700,
  "status": "passed"
});
formatter.match({
  "location": "StepsToVerify.user_click_on_the_first_Link()"
});
formatter.result({
  "duration": 7681935200,
  "status": "passed"
});
formatter.match({
  "location": "StepsToVerify.user_should_be_able_to_see_the_LOGO()"
});
formatter.result({
  "duration": 116222000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "J.P. Morgan India | About us",
      "offset": 22
    }
  ],
  "location": "StepsToVerify.page_Title_should_be(String)"
});
formatter.result({
  "duration": 13926500,
  "status": "passed"
});
formatter.match({
  "location": "StepsToVerify.close_the_browser()"
});
formatter.result({
  "duration": 840427800,
  "status": "passed"
});
});