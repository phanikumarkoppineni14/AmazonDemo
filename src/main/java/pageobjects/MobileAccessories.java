package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobileAccessories {

	WebDriver driver;
	public  MobileAccessories (WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		}
	@FindBy(xpath="//span[contains(text(),'Mobile Accessories')]")
	WebElement MobilesAccess;


	public WebElement MobilesAccess() {
		return MobilesAccess;
		
	}
	
	
}

