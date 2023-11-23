package dataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class loginFeature {
	@DataProvider
	public String[][] data()
	{
		String [][]sarr= {{"nayana@gmail.com","123"},{"nayanahn@gmail.com","3456"},{"gowda@gmail.com","3456"}};
		return sarr;
	}
	@Test(dataProvider="data")
	public void login(String cred[])
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys(cred[0]);
		driver.findElement(By.id("Password")).sendKeys(cred[1]);
		
	}

}
