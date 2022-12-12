package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	  
	WebDriver driver;
	
	
	public SignInPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	

	@FindBy(xpath="//*[@name='customerName']")
	WebElement  customerName;
	
	
	@FindBy(xpath="//*[@name='customerName']//following::input[1]")
	WebElement  phoneNumber;
	
	@FindBy(xpath="//*[@name='customerName']//following::input[2]")
	WebElement ap_email;
	
	@FindBy(xpath="//*[@name='customerName']//following::input[3]")
	WebElement ap_password;
	
	@FindBy(xpath="//*[@name='customerName']//following::input[4]")
	WebElement submit;


public WebElement customerName() {
	return customerName;

}
	
public WebElement phoneNumber() {
	return phoneNumber;
	
}
public WebElement ap_email() {
	return ap_email;
	
}
public WebElement ap_password() {
	return ap_password;
}

public WebElement submit() {
	return submit;
	
}
}
