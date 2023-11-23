package programElement;

import java.time.Duration;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleFilter {

	static WebDriver driver;
	static JavascriptExecutor executor;
	static String firstword="";
	static String secondword;

	public static void main(String[] args) throws InterruptedException {

		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://bus.ixigo.com/bus_search/Bangalore/7/Jamkhandi/1621/20-11-2023/O");
		driver.manage().window().maximize();
		
		 executor = (JavascriptExecutor) driver;
		
		String input = "Price Drop;Bus Type:Non AC:Seater;Departure Time:Before 10 AM;Bus Partner:Royal Travels;Boarding Point:8th Mile;Dropping Point:Jamakhandi Bus Stand";
       
		String[] parts = input.split(";");

		for (int i = 0; i < parts.length; i++) {
			String sentence = parts[i];
			String[] words = sentence.split("[:]");

			int wordCount = words.length;
		
			if (wordCount == 1) {
				firstword=words[0];
				
				String firstXpath = "//p[text()='Filters']/following::label[text()='"+firstword+"']/../div/input";
				WebElement element= driver.findElement(By.xpath(firstXpath));

				if (element.isDisplayed()) {
					element.click();
				} 
				else {

					executor.executeScript("arguments[0].scrollIntoView(true);", element);

					element.click();
				}
			}

			else if (wordCount > 1) {
				
            for (int j = 1; j < words.length; j++) {
	

            	firstword=words[0];
				
            	secondword=words[j];

				try {
				
				String secondXpath="//div[contains(@class,'filter-container-wrapper')]/descendant::p[text()='"+firstword+"']/../descendant::span[text()='"+secondword+"']";
				WebElement type= driver.findElement(By.xpath(secondXpath));

				if (type.isDisplayed()) {

					executor.executeScript("arguments[0].click();", type);
				} 
				}
				catch (Exception e) {
					
					driver.findElement(By.xpath("//div[text()='"+firstword+"' ]/../..")).click();
					String thirdXpath="//div[contains(@class,'filter-container-wrapper')]/descendant::div[text()='"+firstword+"']/../../descendant::label[text()='"+secondword+"']";
					WebElement checkBox= driver.findElement(By.xpath(thirdXpath));
					executor.executeScript("arguments[0].click();", checkBox);
					
				}
				
				}
		}
		}
		}
}


			
		


	


