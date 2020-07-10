$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ShopPage.feature");
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
  "name": "Title of your feature",
  "description": "I want to use this template for my feature file",
  "id": "title-of-your-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    }
  ]
});
formatter.before({
  "duration": 909700,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 23,
      "value": "#@tag1"
    },
    {
      "line": 24,
      "value": "#Scenario: Title of your scenario"
    },
    {
      "line": 25,
      "value": "#Given I want to write a step with precondition"
    },
    {
      "line": 26,
      "value": "#And some other precondition"
    },
    {
      "line": 27,
      "value": "#When I complete action"
    },
    {
      "line": 28,
      "value": "#And some other action"
    },
    {
      "line": 29,
      "value": "#And yet another action"
    },
    {
      "line": 30,
      "value": "#Then I validate the outcomes"
    },
    {
      "line": 31,
      "value": "#And check more outcomes"
    },
    {
      "line": 32,
      "value": "#"
    },
    {
      "line": 33,
      "value": "#@tag2"
    },
    {
      "line": 34,
      "value": "#Scenario Outline: Title of your scenario outline"
    },
    {
      "line": 35,
      "value": "#Given I want to write a step with \u003cname\u003e"
    },
    {
      "line": 36,
      "value": "#When I check for the \u003cvalue\u003e in step"
    },
    {
      "line": 37,
      "value": "#Then I verify the \u003cstatus\u003e in step"
    },
    {
      "line": 38,
      "value": "#"
    },
    {
      "line": 39,
      "value": "#Examples:"
    },
    {
      "line": 40,
      "value": "#| name  | value | status  |"
    },
    {
      "line": 41,
      "value": "#| name1 |     5 | success |"
    },
    {
      "line": 42,
      "value": "#| name2 |     7 | Fail    |"
    }
  ],
  "line": 45,
  "name": "plus sign quantity increase",
  "description": "",
  "id": "title-of-your-feature;plus-sign-quantity-increase",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 44,
      "name": "@oec-50"
    }
  ]
});
formatter.step({
  "line": 46,
  "name": "User enters url \"https://ozarro.shop/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 47,
  "name": "click on shop link",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "user click on Headphones USB Wires product",
  "keyword": "When "
});
formatter.step({
  "line": 49,
  "name": "user clicks on plus sign",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "number of product quantity should increased",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://ozarro.shop/",
      "offset": 17
    }
  ],
  "location": "ShopPageTest.user_enters_url(String)"
});
formatter.result({
  "duration": 16763771100,
  "status": "passed"
});
formatter.match({
  "location": "ShopPageTest.click_on_shop_link()"
});
formatter.result({
  "duration": 2147056900,
  "status": "passed"
});
formatter.match({
  "location": "ShopPageTest.user_click_on_Headphones_USB_Wires_product()"
});
formatter.result({
  "duration": 1761969300,
  "status": "passed"
});
formatter.match({
  "location": "ShopPageTest.user_clicks_on_plus_sign()"
});
formatter.result({
  "duration": 43100,
  "status": "passed"
});
formatter.match({
  "location": "ShopPageTest.number_of_product_quantity_should_increased()"
});
formatter.result({
  "duration": 37400,
  "status": "passed"
});
formatter.after({
  "duration": 1373887500,
  "status": "passed"
});
formatter.before({
  "duration": 348000,
  "status": "passed"
});
formatter.scenario({
  "line": 53,
  "name": "Headphones USB Wires",
  "description": "",
  "id": "title-of-your-feature;headphones-usb-wires",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 52,
      "name": "@oec-46"
    }
  ]
});
formatter.step({
  "line": 54,
  "name": "User enters url \"https://ozarro.shop/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 55,
  "name": "click on shop link",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "user click on Headphones USB Wires product",
  "keyword": "When "
});
formatter.step({
  "line": 57,
  "name": "user should be able to see Headphones USB",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://ozarro.shop/",
      "offset": 17
    }
  ],
  "location": "ShopPageTest.user_enters_url(String)"
});
formatter.result({
  "duration": 9371565900,
  "status": "passed"
});
formatter.match({
  "location": "ShopPageTest.click_on_shop_link()"
});
formatter.result({
  "duration": 1830936500,
  "status": "passed"
});
formatter.match({
  "location": "ShopPageTest.user_click_on_Headphones_USB_Wires_product()"
});
formatter.result({
  "duration": 1906649000,
  "status": "passed"
});
formatter.match({
  "location": "ShopPageTest.user_should_be_able_to_see_Headphones_USB()"
});
formatter.result({
  "duration": 11429700,
  "status": "passed"
});
formatter.after({
  "duration": 1373341800,
  "status": "passed"
});
formatter.before({
  "duration": 372800,
  "status": "passed"
});
formatter.scenario({
  "line": 61,
  "name": "Edit quantity box",
  "description": "",
  "id": "title-of-your-feature;edit-quantity-box",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 60,
      "name": "@oec-52"
    }
  ]
});
formatter.step({
  "line": 62,
  "name": "User enters url \"https://ozarro.shop/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 63,
  "name": "click on shop link",
  "keyword": "And "
});
formatter.step({
  "line": 64,
  "name": "user click on Headphones USB Wires product",
  "keyword": "When "
});
formatter.step({
  "line": 65,
  "name": "user can type the number of quantity",
  "keyword": "And "
});
formatter.step({
  "line": 66,
  "name": "edit box should be editable",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://ozarro.shop/",
      "offset": 17
    }
  ],
  "location": "ShopPageTest.user_enters_url(String)"
});
formatter.result({
  "duration": 9291575600,
  "status": "passed"
});
formatter.match({
  "location": "ShopPageTest.click_on_shop_link()"
});
formatter.result({
  "duration": 1920752200,
  "status": "passed"
});
formatter.match({
  "location": "ShopPageTest.user_click_on_Headphones_USB_Wires_product()"
});
formatter.result({
  "duration": 2360817500,
  "status": "passed"
});
formatter.match({
  "location": "ShopPageTest.user_can_type_the_number_of_quantity()"
});
formatter.result({
  "duration": 9188207500,
  "status": "passed"
});
formatter.match({
  "location": "ShopPageTest.edit_box_should_be_editable()"
});
formatter.result({
  "duration": 39500,
  "status": "passed"
});
formatter.after({
  "duration": 1072330900,
  "status": "passed"
});
formatter.before({
  "duration": 364500,
  "status": "passed"
});
formatter.scenario({
  "line": 70,
  "name": "Search button functionality",
  "description": "",
  "id": "title-of-your-feature;search-button-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 69,
      "name": "@oec-67"
    }
  ]
});
formatter.step({
  "line": 71,
  "name": "User enters url \"https://ozarro.shop/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 72,
  "name": "click on shop link",
  "keyword": "And "
});
formatter.step({
  "line": 73,
  "name": "user clicks on search button",
  "keyword": "When "
});
formatter.step({
  "line": 74,
  "name": "user should see list of products",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://ozarro.shop/",
      "offset": 17
    }
  ],
  "location": "ShopPageTest.user_enters_url(String)"
});
formatter.result({
  "duration": 9648997100,
  "status": "passed"
});
formatter.match({
  "location": "ShopPageTest.click_on_shop_link()"
});
formatter.result({
  "duration": 1773404800,
  "status": "passed"
});
formatter.match({
  "location": "ShopPageTest.user_clicks_on_search_button()"
});
formatter.result({
  "duration": 7158612200,
  "status": "passed"
});
formatter.match({
  "location": "ShopPageTest.user_should_see_list_of_products()"
});
formatter.result({
  "duration": 5633600,
  "status": "passed"
});
formatter.after({
  "duration": 1090787000,
  "status": "passed"
});
formatter.before({
  "duration": 337600,
  "status": "passed"
});
formatter.scenario({
  "line": 78,
  "name": "User can search by pressing enter key",
  "description": "",
  "id": "title-of-your-feature;user-can-search-by-pressing-enter-key",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 77,
      "name": "@oec-68"
    }
  ]
});
formatter.step({
  "line": 79,
  "name": "User enters url \"https://ozarro.shop/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 80,
  "name": "click on shop link",
  "keyword": "And "
});
formatter.step({
  "line": 81,
  "name": "user types on laptop",
  "keyword": "When "
});
formatter.step({
  "line": 82,
  "name": "user presses enter key",
  "keyword": "And "
});
formatter.step({
  "line": 83,
  "name": "user should see search results contains word laptop",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://ozarro.shop/",
      "offset": 17
    }
  ],
  "location": "ShopPageTest.user_enters_url(String)"
});
formatter.result({
  "duration": 8688401700,
  "status": "passed"
});
formatter.match({
  "location": "ShopPageTest.click_on_shop_link()"
});
formatter.result({
  "duration": 1558758200,
  "status": "passed"
});
formatter.match({
  "location": "ShopPageTest.user_types_on_laptop()"
});
formatter.result({
  "duration": 3235254300,
  "status": "passed"
});
formatter.match({
  "location": "ShopPageTest.user_presses_enter_key()"
});
formatter.result({
  "duration": 4076434300,
  "status": "passed"
});
formatter.match({
  "location": "ShopPageTest.user_should_see_search_results_contains_word_laptop()"
});
formatter.result({
  "duration": 16825600,
  "status": "passed"
});
formatter.after({
  "duration": 1280378400,
  "status": "passed"
});
});