$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Login feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@web"
    },
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.scenarioOutline({
  "line": 23,
  "name": "Verify Invalid Login for multiple users",
  "description": "",
  "id": "login-feature;verify-invalid-login-for-multiple-users",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 22,
      "name": "@login-3"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "I enter \u003cusername\u003e into username text fields on home screen",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "I enter \u003cpassword\u003e into password text fields on home screen",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I click on login button on home screen",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I verify that i am an invalid login page",
  "keyword": "Then "
});
formatter.examples({
  "line": 29,
  "name": "",
  "description": "",
  "id": "login-feature;verify-invalid-login-for-multiple-users;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 30,
      "id": "login-feature;verify-invalid-login-for-multiple-users;;1"
    },
    {
      "cells": [
        "mohammad@technosoftacademy.io",
        "test1234"
      ],
      "line": 31,
      "id": "login-feature;verify-invalid-login-for-multiple-users;;2"
    },
    {
      "cells": [
        "chris@technosoftacademy.io",
        "abc123"
      ],
      "line": 32,
      "id": "login-feature;verify-invalid-login-for-multiple-users;;3"
    },
    {
      "cells": [
        "smith@technosoftacademy.io",
        "test"
      ],
      "line": 33,
      "id": "login-feature;verify-invalid-login-for-multiple-users;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 50893149420,
  "status": "passed"
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
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSD.iAmOnHomePage()"
});
formatter.result({
  "duration": 4313551376,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Verify Invalid Login for multiple users",
  "description": "",
  "id": "login-feature;verify-invalid-login-for-multiple-users;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@login"
    },
    {
      "line": 1,
      "name": "@web"
    },
    {
      "line": 22,
      "name": "@login-3"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "I enter mohammad@technosoftacademy.io into username text fields on home screen",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "I enter test1234 into password text fields on home screen",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I click on login button on home screen",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I verify that i am an invalid login page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "mohammad@technosoftacademy.io",
      "offset": 8
    },
    {
      "val": "username",
      "offset": 43
    }
  ],
  "location": "LoginSD.enterDataIntoTextFields(String,String)"
});
formatter.result({
  "duration": 1691251468,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test1234",
      "offset": 8
    },
    {
      "val": "password",
      "offset": 22
    }
  ],
  "location": "LoginSD.enterDataIntoTextFields(String,String)"
});
formatter.result({
  "duration": 295190488,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "login",
      "offset": 11
    }
  ],
  "location": "LoginSD.clickOnLoginButton(String)"
});
formatter.result({
  "duration": 2832880218,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 5315761720,
  "status": "passed"
});
formatter.before({
  "duration": 12392962190,
  "status": "passed"
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
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSD.iAmOnHomePage()"
});
formatter.result({
  "duration": 22230658,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Verify Invalid Login for multiple users",
  "description": "",
  "id": "login-feature;verify-invalid-login-for-multiple-users;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@login"
    },
    {
      "line": 1,
      "name": "@web"
    },
    {
      "line": 22,
      "name": "@login-3"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "I enter chris@technosoftacademy.io into username text fields on home screen",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "I enter abc123 into password text fields on home screen",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I click on login button on home screen",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I verify that i am an invalid login page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "chris@technosoftacademy.io",
      "offset": 8
    },
    {
      "val": "username",
      "offset": 40
    }
  ],
  "location": "LoginSD.enterDataIntoTextFields(String,String)"
});
formatter.result({
  "duration": 858112717,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 8
    },
    {
      "val": "password",
      "offset": 20
    }
  ],
  "location": "LoginSD.enterDataIntoTextFields(String,String)"
});
formatter.result({
  "duration": 182622457,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "login",
      "offset": 11
    }
  ],
  "location": "LoginSD.clickOnLoginButton(String)"
});
formatter.result({
  "duration": 1739714384,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 3189109348,
  "status": "passed"
});
formatter.before({
  "duration": 7093480279,
  "status": "passed"
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
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSD.iAmOnHomePage()"
});
formatter.result({
  "duration": 33493206,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "Verify Invalid Login for multiple users",
  "description": "",
  "id": "login-feature;verify-invalid-login-for-multiple-users;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@login"
    },
    {
      "line": 1,
      "name": "@web"
    },
    {
      "line": 22,
      "name": "@login-3"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "I enter smith@technosoftacademy.io into username text fields on home screen",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "I enter test into password text fields on home screen",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I click on login button on home screen",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I verify that i am an invalid login page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "smith@technosoftacademy.io",
      "offset": 8
    },
    {
      "val": "username",
      "offset": 40
    }
  ],
  "location": "LoginSD.enterDataIntoTextFields(String,String)"
});
formatter.result({
  "duration": 822454821,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test",
      "offset": 8
    },
    {
      "val": "password",
      "offset": 18
    }
  ],
  "location": "LoginSD.enterDataIntoTextFields(String,String)"
});
formatter.result({
  "duration": 198771461,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "login",
      "offset": 11
    }
  ],
  "location": "LoginSD.clickOnLoginButton(String)"
});
formatter.result({
  "duration": 1433108486,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 1320745638,
  "status": "passed"
});
});