package Academy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drivername {

	WebDriver driver;

	public WebDriver InitializeDriver() throws IOException {

		Properties pro = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\anil0\\eclipse-workspace\\traveltest\\src\\main\\java\\Academy\\data.properties");
		pro.load(fis);
		String brouserName = pro.getProperty("brouser");
		if (brouserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
		} 
		else if(brouserName.equals("FireFox"))  {
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			driver = new FirefoxDriver();
		}
		//driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		return driver;
	}
		
}
