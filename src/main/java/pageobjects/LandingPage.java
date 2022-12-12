package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	WebDriver driver;
	public  LandingPage(WebDriver driver) {
		
this.driver = driver;
PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//*[@id=\"nav-link-accountList\"]")
	 WebElement accountListdropdown;
	
	@FindBy(xpath="//*[@id=\"createAccountSubmit\"]")
	WebElement createAccountSubmit;
	
	public WebElement accountListdropdown() {
		return accountListdropdown;
	}
	public WebElement createAccountSubmit() {
		return createAccountSubmit;  
	}
	
	
	}
	

