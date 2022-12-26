Feature: Customers
Scenario: Add new Customer. 

Given user launch chrome browser
When user open Url "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
Then user enter username "admin@yourstore.com" and password "admin"
And user click on Log In
Then page tittle should be "Dashboard / nopCommerce administration"
When user click on customers
And click on customers menue Item
When user click on add new button 
Then add new customer page will be display
Then user fill the customers information 
And Click on save button
Then user can view conformation message "The new customer has been added successfully."
When user click on logout link
Then title should be "Your store. Login"
And close the browser
