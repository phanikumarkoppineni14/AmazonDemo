package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public WebDriver driver;
	public Properties prop;

	public WebDriver startbrowser() throws IOException {
		
		prop = new Properties();
		String propath = System.getProperty("user.dir") + "\\src\\main\\java\\resources\\data.properties" ;
		FileInputStream fis = new FileInputStream(propath);
		prop.load(fis);

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}

}
