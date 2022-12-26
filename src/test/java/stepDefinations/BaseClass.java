package stepDefinations;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import objects.CustomerPageObject;
import objects.LoginPageObject;

public class BaseClass {


public WebDriver driver;
public LoginPageObject lp;
public CustomerPageObject ctr;

// genrating randam string

public static String randomstring() {
	String genratedstring1 = RandomStringUtils.randomAlphabetic(5);
	return (genratedstring1);
	
	 
	
}



	
	

}
