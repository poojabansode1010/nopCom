Feature: Customer Login Feature.
Scenario: Customer Login using valid username and password

Given user launch chrome browser
When user open Url "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
Then user enter username "admin@yourstore.com" and password "admin"
And user click on Log In
Then page tittle should be "Dashboard / nopCommerce administration"
When user click on logout link
Then title should be "Your store. Login"
And close the browser


Scenario Outline:Login Data Driven Testing 
Given user launch chrome browser
When user open Url "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
Then user enter username "<email>"and password "<password>"
And user click on Log In
Then page tittle should be "Dashboard / nopCommerce administration"
When user click on logout link
Then title should be "Your store. Login"
And close the browser

Examples:
|email|password|
|admin@yourstore.com|admin|
|admin1@yourstore.com|admin123|

