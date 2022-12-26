package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {

 public WebDriver ldriver;
 
 
 
 public LoginPageObject(WebDriver rdriver) {
	 ldriver=rdriver;
	 PageFactory.initElements(rdriver, this);
 }
 
	
	
	@FindBy(xpath="//input[@id='Email']")@CacheLookup WebElement Email;
	@FindBy(xpath="//input[@id='Password']")@CacheLookup WebElement Password ;
	@FindBy(xpath="//button[normalize-space()='Log in']")@CacheLookup WebElement logIn ;
	@FindBy(xpath="//a[normalize-space()='Logout']")@CacheLookup WebElement LogOut;
	
	
	public void EnterEmail(String uname) {
		Email.clear();
		Email.sendKeys(uname);
	}
	
	public void EnterPassword(String pwd) {
		Password.clear();
		Password.sendKeys(pwd);
	}
	
	public void clkLogin() {
		logIn.click();
	}
	
	public void clkLogout() {
		LogOut.click();
	}
	
}
