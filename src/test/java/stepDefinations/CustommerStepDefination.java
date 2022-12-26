package stepDefinations;

import static org.testng.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import objects.CustomerPageObject;

public class CustommerStepDefination {
	
	CustomerPageObject ctr;
	public static WebDriver driver;
	
	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 ctr=new CustomerPageObject(driver);
		System.out.println("Browser Launched");
	    
	}

	@When("user open Url {string}")
	public void user_open_Url(String Url) {
	   driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	}

	@Then("user enter username {string} and password {string}")
	public void user_enter_username_and_password(String Uname, String Pwd) {
		
		ctr.Enteremail(Uname);
		ctr.Enterpassword(Pwd);
	}

	@Then("user click on Log In")
	public void user_click_on_Log_In() {
		ctr.clkLogin();
	}
	
	@When("user click on customers")
	public void user_click_on_customers() {
	   ctr.clkCustomers();
	}

	@When("click on customers menue Item")
	public void click_on_customers_menue_Item() {
	    ctr.clkcustomerMenue();
	}

	@When("user click on add new button")
	public void user_click_on_add_new_button() {
	   ctr.clkAddNew();
	}

	@Then("add new customer page will be display")
	public void add_new_customer_page_will_be_display() {
		String title=driver.getCurrentUrl();
		System.out.println(title);
		Assert.assertEquals("https://admin-demo.nopcommerce.com/Admin/Customer/Create", title);
	}

	@Then("user fill the customers information")
	public void user_fill_the_customers_information() {
	    
	}

	@Then("Click on save button")
	public void click_on_save_button() {
	   ctr.clksave();
	}

	@Then("user can view conformation message {string}")
	public void user_can_view_conformation_message(String string) {
		boolean msg = driver.getPageSource().contains("The new customer has been added successfully.");
		System.out.println(msg);
		Assert.assertEquals("The new customer has been added successfully.", msg);
	}

	@Then("page tittle should be {string}")
	public void page_tittle_should_be(String ttl) {
		String title=driver.getCurrentUrl();
		System.out.println(title);
		Assert.assertEquals("https://admin-demo.nopcommerce.com/admin/", title);
	}
		
	@When("user click on logout link")
	public void user_click_on_logout_link() throws InterruptedException {
		ctr.clkLogOut();
	  Thread.sleep(3000);
	}

	@Then("title should be {string}")
	public void title_should_be() {
		 String Act_title= driver.getTitle();
		   System.out.println(Act_title);
		   String Exp_title="Your store. Login";
		   Assert.assertEquals("Your store. Login", Act_title);
	}

	@Then("close the browser")
	public void close_the_browser() {
	   driver.close();
	}

}
