package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GamingAccessories {
	
	WebDriver driver;
	public  GamingAccessories (WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		}
	@FindBy(xpath="//span[contains(text(),'Gaming Accessories')]")
	WebElement  GamingAccess;
    
	
	@FindBy(xpath="(//div[@class='a-section octopus-pc-asin-title'])[5]")
	WebElement Smartphone;

	public WebElement  GameFingerSleeves() {
		return  Smartphone;
	}
	
	public WebElement GamingAccess() {
		return GamingAccess;
	}
}
