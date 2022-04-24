$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/LoginTest.feature");
formatter.feature({
  "name": "Login Feature",
  "description": "\tIn order to do perform successfull login\n\tAs a user\n\tI want to launch the Flipboard app",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Click on continue button",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user click on getstartedbutton",
  "keyword": "Given "
});
formatter.match({
  "location": "FlipboardSteps.user_click_on_getstartedbutton()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": ": Click on continue button and select topics",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user click on getstartedbutton",
  "keyword": "Given "
});
formatter.step({
  "name": "user selects \u003ctopics\u003e topic",
  "keyword": "When "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "topics"
      ]
    },
    {
      "cells": [
        "4"
      ]
    }
  ]
});
formatter.scenario({
  "name": ": Click on continue button and select topics",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user click on getstartedbutton",
  "keyword": "Given "
});
formatter.match({
  "location": "FlipboardSteps.user_click_on_getstartedbutton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects 4 topic",
  "keyword": "When "
});
formatter.match({
  "location": "FlipboardSteps.user_selects_topic(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});