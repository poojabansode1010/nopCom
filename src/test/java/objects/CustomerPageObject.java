package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPageObject   {

	public WebDriver ldriver;
	 
	 
	 
	 public CustomerPageObject(WebDriver rdriver) {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver, this);
	 }
	 
	 	@FindBy(xpath="//input[@id='Email']")@CacheLookup WebElement Email;
		@FindBy(xpath="//input[@id='Password']")@CacheLookup WebElement Password ;
		@FindBy(xpath="//button[normalize-space()='Log in']")@CacheLookup WebElement logIn ;
		@FindBy(xpath="//p[text()='Customers']")@CacheLookup WebElement customers;
		@FindBy(xpath="//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]")@CacheLookup WebElement customerMenue;
		@FindBy(xpath="/html/body/div[3]/div[1]/form[1]/div/div/a")@CacheLookup WebElement AddNew;
		@FindBy(xpath="//input[@id='Email'] ")@CacheLookup WebElement Email;
		@FindBy(xpath="//input[@id='Password'] ")@CacheLookup WebElement Password;
		@FindBy(xpath="//input[@id='FirstName'] ")@CacheLookup WebElement FirstName;
		@FindBy(xpath="//input[@id='LastName'] ")@CacheLookup WebElement LastName;
		@FindBy(xpath="//input[@id='Gender_Male'] ")@CacheLookup WebElement Gender_Male;
		@FindBy(xpath="//input[@id='Gender_Female'] ")@CacheLookup WebElement Gender_Female;
		@FindBy(xpath="//span[@class='k-icon k-i-calendar']")@CacheLookup WebElement DateOfBirth ;
		@FindBy(xpath="//input[@id='Company'] ")@CacheLookup WebElement Company;
		@FindBy(xpath="//input[@id='IsTaxExempt'] ")@CacheLookup WebElement IsTaxExempt;
		@FindBy(xpath="(//div[@class='k-multiselect-wrap k-floatwrap'] )[1]")@CacheLookup WebElement Newsletter  ;
		@FindBy(xpath="//div[@class='k-multiselect-wrap k-floatwrap'] )[2]")@CacheLookup WebElement CustomerRoles ;
		@FindBy(xpath="//select[@id='VendorId']")@CacheLookup WebElement VendorId;
		@FindBy(xpath="//input[@id='Active']")@CacheLookup WebElement Active;
		@FindBy(xpath="//textarea[@id='AdminComment']")@CacheLookup WebElement textarea;
		@FindBy(xpath="//button[@name='save']")@CacheLookup WebElement save;
		@FindBy(xpath="//a[normalize-space()='Logout']")@CacheLookup WebElement LogOut;
		
		
		public void Enteremail(String uname) {
			Email.clear();
			Email.sendKeys(uname);
		}
		
		public void Enterpassword(String pwd) {
			Password.clear();
			Password.sendKeys(pwd);
		}
		
		public void clkLogin() {
			logIn.click();
		}
		public void clkCustomers() {
			customers.click();
		}
		
		public void clkcustomerMenue() {
			customerMenue.click();
		}
		
		public void clkAddNew() {
			AddNew.click();
		}
		
		public void sendEmail(String mail) {
			Email.sendKeys(mail);
		}
		
		public void sendPassword(String password) {
			Password.sendKeys(password);
		}
		
		public void sendFirstName(String fname) {
			FirstName.sendKeys(fname);
		}
		
		public void sendLastName(String lname) {
			LastName.sendKeys(lname);
		}
		
		public void selectGender() {
			Gender_Male.click();
		}
		
		public void sendGender_Female() {
			Gender_Female.click();
		}
		
		public void sendDateOfBirth() {
			DateOfBirth.click();
		}
		
		public void sendCompany() {
			Company.click();
		}
		
		public void checkIsTaxExempt() {
			IsTaxExempt.click();
		}
		
		public void sendNewsletter() {
			Newsletter.click();
		}
		
		public void selectCustomerRoles() {
			CustomerRoles.click();
		}
		
		public void sendVendorId() {
			VendorId.click();
		}
		
		public void checkActive() {
			Active.click();
		}
		
		public void sendtextarea() {
			textarea.click();
		}
		
		public void clksave() {
			save.click();
		}
		
		public void clkLogOut() {
			LogOut.click();
		}

		
		
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

