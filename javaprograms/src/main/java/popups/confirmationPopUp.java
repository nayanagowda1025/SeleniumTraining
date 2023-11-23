package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class confirmationPopUp {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		WebElement iframe=driver.findElement(By.xpath("//iframe[contains(@name,'webengage-engagement-callback-frame')]"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.xpath("//a[@class='close']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		driver.findElement(By.xpath("//input[@data-cy='departure']")).click();
		
		
		
	}
		
	}


