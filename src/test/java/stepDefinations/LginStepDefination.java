package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import objects.LoginPageObject;

public class LginStepDefination {

	public static WebDriver driver;
	public LoginPageObject lp;
	 

	
	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		lp=new LoginPageObject(driver);
		System.out.println("Browser Launched");
	    
	}

	@When("user open Url {string}")
	public void user_open_Url(String Url) {
	   driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	}

	@Then("user enter username {string} and password {string}")
	public void user_enter_username_and_password(String uname, String pwd) {
		
		lp.EnterEmail(uname);
		lp.EnterPassword(pwd);
	}

	@Then("user click on Log In")
	public void user_click_on_Log_In() {
	   lp.clkLogin();
	}

	@Then("page tittle should be {string}")
	public void page_tittle_should_be(String ttl) {
		
		String title=driver.getCurrentUrl();
		System.out.println(title);
		Assert.assertEquals("https://admin-demo.nopcommerce.com/admin/", title);
	 
//		if(driver.getPageSource().contains("Login was unsuccessful.")) {
//			driver.close();
//			Assert.assertTrue(false);
//		}else {
//			Assert.assertEquals(ttl, driver.getTitle());
//		}
	}
		
	@When("user click on logout link")
	public void user_click_on_logout_link() throws InterruptedException {
	  lp.clkLogout();
	  Thread.sleep(3000);
	}

	@Then("title should be {string}")
	public void title_should_be(String lout_ttl) {
		 String Act_title= driver.getTitle();
		   System.out.println(Act_title);
		   String Exp_title="lout_ttl";
	}

	@Then("close the browser")
	public void close_the_browser() {
	   driver.close();
	}


}
