package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PuzzlePage {
	
	WebDriver driver;
	public  PuzzlePage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}

	@FindBy(xpath="//*[@class='a-icon a-icon-logo']")
	WebElement Amazon;
	

public WebElement Amazon() {
	return Amazon;
	
}
}