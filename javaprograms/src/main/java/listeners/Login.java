package listeners;

import org.openqa.selenium.By;
import org.testng.Assert;

import org.testng.annotations.Test;

public class Login extends BaseClass {
	@Test
	public void loginToDemo()
	{
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("nayanahn");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("nayanahn");
		Assert.fail();
		
	}

}
