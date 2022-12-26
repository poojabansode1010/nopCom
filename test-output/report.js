$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Login.feature");
formatter.feature({
  "name": "Customer Login Feature.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Customer Login using valid username and password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LginStepDefination.user_launch_chrome_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user open Url \"https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F\"",
  "keyword": "When "
});
formatter.match({
  "location": "LginStepDefination.user_open_Url(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enter username \"admin@yourstore.com\" and password \"admin\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LginStepDefination.user_enter_username_and_password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click on Log In",
  "keyword": "And "
});
formatter.match({
  "location": "LginStepDefination.user_click_on_Log_In()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "page tittle should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LginStepDefination.page_tittle_should_be(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click on logout link",
  "keyword": "When "
});
formatter.match({
  "location": "LginStepDefination.user_click_on_logout_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "title should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LginStepDefination.title_should_be(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "LginStepDefination.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});