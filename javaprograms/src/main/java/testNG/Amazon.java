package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Amazon {
	WebDriver driver;
	@Parameters("browser")
	@Test(groups = "functional")
	
	public void amazon(@Optional("chrome") String browser)
	{
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
	   
	   driver.get("https://www.amazon.com/");
	}

}
