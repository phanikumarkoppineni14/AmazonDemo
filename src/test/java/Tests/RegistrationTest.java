package Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.AddToWishList;
import pageobjects.BackToSignIn;
import pageobjects.GamingAccessories;
import pageobjects.HomePage;
import pageobjects.LandingPage;
import pageobjects.MobileAccessories;
import pageobjects.PuzzlePage;
import pageobjects.SignInPage;
import resources.Base;

public class RegistrationTest extends Base {

	WebDriver driver;

	@Test
	public void login() {

	LandingPage landingpage = new LandingPage(driver);
        landingpage.accountListdropdown().click();
		landingpage.createAccountSubmit().click();

		SignInPage signinpage = new SignInPage(driver);
		signinpage.customerName().sendKeys(prop.getProperty("Name"));
		signinpage.phoneNumber().sendKeys(prop.getProperty("phonenumber"));
		signinpage.ap_email().sendKeys(prop.getProperty("Email"));
		signinpage.ap_password().sendKeys(prop.getProperty("Password"));
		signinpage.submit().click();
		
		
		PuzzlePage puzzlepage = new PuzzlePage(driver);
		puzzlepage.Amazon().click();
		
		HomePage homepage= new HomePage(driver);
		homepage.Mobiles().click();
		
	    MobileAccessories MobilesAccess = new MobileAccessories(driver);
	    MobilesAccess.MobilesAccess().click();
	    
	    GamingAccessories Gaming = new GamingAccessories(driver);
	    Gaming.GamingAccess().click();
	    Gaming.GameFingerSleeves().click();
	    

		AddToWishList AddWishList= new AddToWishList(driver);
		AddWishList.WishList().click();
		
		BackToSignIn backtosignin= new BackToSignIn(driver);
		backtosignin.phonenumber().sendKeys(prop.getProperty("phonenumber"));
		backtosignin.submit();
		
}
	
	@BeforeMethod

	public void before() throws IOException {

		driver = startbrowser();

		driver.get(prop.getProperty("URL"));
	}

	
	}


