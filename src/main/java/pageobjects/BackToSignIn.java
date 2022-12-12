package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BackToSignIn {
	WebDriver driver;
	public  BackToSignIn   (WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		}
	@FindBy(id="ap_email")
	WebElement phonenumber;

	@FindBy(xpath="//*[@class='a-button a-button-span12 a-button-primary']")
	WebElement submit;

	public WebElement phonenumber () {
		return phonenumber;
	}
public WebElement submit() {
	return submit;

	}
}


