package Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	@Test
	public void login() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demowebshop.tricentis.com/login");
	driver.findElement(By.id("Email")).sendKeys();
	driver.findElement(By.id("Password")).sendKeys();
	Assert.assertEquals(driver.getTitle(), "Demo Web Shop");
	}

}
