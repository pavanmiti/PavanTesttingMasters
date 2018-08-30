$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "Validate the following functionalities on the Home Page Module",
  "description": "As an User Application should be launched properly",
  "id": "validate-the-following-functionalities-on-the-home-page-module",
  "keyword": "Feature"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Launch \"ff\" browser and enter \"url\"",
  "rows": [
    {
      "cells": [
        "firefox",
        "http://server/bank/"
      ],
      "line": 6
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "ff",
      "offset": 8
    },
    {
      "val": "url",
      "offset": 31
    }
  ],
  "location": "TC_01_Login.launchBrowser(String,String,DataTable)"
});
formatter.result({
  "duration": 7053513886,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "This scenario is designed to validate the valid credentials of Admin User",
  "description": "",
  "id": "validate-the-following-functionalities-on-the-home-page-module;this-scenario-is-designed-to-validate-the-valid-credentials-of-admin-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@tab"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "check for  features",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "verify Tab Order",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "validateTabs",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Tc_O1_verify_features_loginPage.check_for_features()"
});
formatter.result({
  "duration": 265855063,
  "status": "passed"
});
formatter.match({
  "location": "Tc_O1_verify_features_loginPage.verifyHomeTab()"
});
formatter.result({
  "duration": 49547917,
  "status": "passed"
});
formatter.match({
  "location": "Tc_O1_verify_features_loginPage.validatetabs()"
});
formatter.result({
  "duration": 1219632537,
  "status": "passed"
});
formatter.match({
  "location": "Tc_O1_verify_features_loginPage.closebrowser()"
});
formatter.result({
  "duration": 5510609,
  "status": "passed"
});
});