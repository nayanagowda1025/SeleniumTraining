package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public final class Flipkart {
	WebDriver driver;
	@Parameters("browser")
	@Test(groups = "functional")
	public void flipkart (@Optional("chrome") String browser)
	{
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}

		driver.get("https://www.flipkart.com/");
	}

}
